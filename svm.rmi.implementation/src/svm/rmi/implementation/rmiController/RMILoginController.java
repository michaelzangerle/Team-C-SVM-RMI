package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.ILoginController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferAuth;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.rmi.abstraction.controller.IRMILoginController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public class RMILoginController extends UnicastRemoteObject implements IRMILoginController {

    ILoginController controller;

    public RMILoginController(ILoginController loginController) throws RemoteException {
        super();
        this.controller = loginController;
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

    @Override
    public boolean login(String s, String s1) throws RemoteException, IllegalGetInstanceException, NoSessionFoundException {
        return controller.login(s, s1);
    }

    public boolean loginWithoutLdap(String s,String s1) throws IllegalGetInstanceException, NoSessionFoundException, RemoteException {
        return controller.loginWithoutLdap(s,s1);
    }

    @Override
    public ITransferAuth getMember() throws RemoteException {
        return controller.getMember();
    }
}
