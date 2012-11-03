package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.ISearchController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferDepartment;
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
    protected RMISearchController(ISearchController searchController) throws RemoteException {
        super();
        this.controller=searchController;
    }

    @Override
    public List<ITransferMember> getMembers(String s, String s1, ITransferDepartment iTransferDepartment) throws NoSessionFoundException, IllegalGetInstanceException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<ITransferMember> getMembers(Date date, Date date1) throws NoSessionFoundException, IllegalGetInstanceException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<ITransferDepartment> getDepartments() throws IllegalGetInstanceException, NoSessionFoundException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
