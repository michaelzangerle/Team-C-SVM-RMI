package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.ISearchController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferDepartment;
import svm.logic.abstraction.transferobjects.ITransferLocation;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMISearchController;

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
    public List<ITransferMember> getMembers(String s, String s1, ITransferDepartment iTransferDepartment) throws RemoteException, NoSessionFoundException, IllegalGetInstanceException {

        return controller.getMembers(s, s1, iTransferDepartment);
    }

    @Override
    public List<ITransferMember> getMembers(String s, String s1, ITransferDepartment iTransferDepartment, Boolean paid) throws NoSessionFoundException, IllegalGetInstanceException, RemoteException {
        return controller.getMembers(s, s1, iTransferDepartment, paid);
    }

    @Override
    public List<ITransferMember> getMembers(String s, String s1) throws RemoteException, NoSessionFoundException, IllegalGetInstanceException {
        return controller.getMembers(s, s1);
    }

    @Override
    public List<ITransferMember> getMembers(Date date, Date date1) throws RemoteException, NoSessionFoundException, IllegalGetInstanceException {
        return controller.getMembers(date, date1);
    }

    @Override
    public List<ITransferDepartment> getDepartments() throws RemoteException, IllegalGetInstanceException, NoSessionFoundException {
        return controller.getDepartments();
    }

    @Override
    public List<ITransferLocation> getLocations() throws RemoteException, IllegalGetInstanceException, NoSessionFoundException {
        return controller.getLocations();
    }

    @Override
    public void start() throws RemoteException, NoSessionFoundException, IllegalGetInstanceException {
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
