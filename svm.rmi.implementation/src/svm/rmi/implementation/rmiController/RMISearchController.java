package svm.rmi.implementation.rmiController;

import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.controller.ISearchController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.NotAllowException;
import svm.logic.abstraction.transferobjects.*;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMISearchController;

import javax.transaction.NotSupportedException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public class RMISearchController extends UnicastRemoteObject implements IRMISearchController {

    ISearchController controller;

    public RMISearchController(ISearchController searchController) throws RemoteException {
        super();
        this.controller = searchController;
    }

    @Override
    public List<ITransferMember> getMembers(String s, String s1, ITransferDepartment iTransferDepartment) throws RemoteException, NoSessionFoundException, IllegalGetInstanceException, NotAllowException {

        return controller.getMembers(s, s1, iTransferDepartment);
    }

    @Override
    public List<ITransferMember> getMembers(String s, String s1, ITransferDepartment iTransferDepartment, Boolean paid) throws NoSessionFoundException, IllegalGetInstanceException, RemoteException, DomainParameterCheckException, NotAllowException {
        return controller.getMembers(s, s1, iTransferDepartment, paid);
    }

    @Override
    public List<ITransferMember> getMembers(String s, String s1) throws RemoteException, NoSessionFoundException, IllegalGetInstanceException, NotAllowException {
        return controller.getMembers(s, s1);
    }

    @Override
    public List<ITransferMember> getMembers(Date date, Date date1) throws RemoteException, NoSessionFoundException, IllegalGetInstanceException, NotAllowException {
        return controller.getMembers(date, date1);
    }

    @Override
    public List<ITransferDepartment> getDepartments() throws RemoteException, IllegalGetInstanceException, NoSessionFoundException, NotAllowException {
        return controller.getDepartments();
    }

    @Override
    public List<ITransferLocation> getLocations() throws RemoteException, IllegalGetInstanceException, NoSessionFoundException, NotAllowException {
        return controller.getLocations();
    }

    @Override
    public List<ITransferContest> getContests() throws IllegalGetInstanceException, NoSessionFoundException, RemoteException, NotAllowException {
        return controller.getContests();
    }

    @Override
    public List<ITransferTeam> getTeams() throws IllegalGetInstanceException, NoSessionFoundException, RemoteException, NotAllowException {
        return controller.getTeams();
    }

    @Override
    public void start() throws RemoteException, NoSessionFoundException, IllegalGetInstanceException, NotSupportedException, InstantiationException, IllegalAccessException {
        controller.start();
    }

    @Override
    public void commit() throws RemoteException, ExistingTransactionException, NoSessionFoundException, NoTransactionException {
        controller.commit();
    }

    @Override
    public void abort() throws RemoteException, ExistingTransactionException, NoSessionFoundException, NoTransactionException {
        controller.abort();
    }
}
