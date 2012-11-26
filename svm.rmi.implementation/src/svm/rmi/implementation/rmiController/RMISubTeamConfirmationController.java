package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.ISubTeamConfirmationController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.rmi.abstraction.controller.IRMISubTeamConfirmationController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMISubTeamConfirmationController extends UnicastRemoteObject implements IRMISubTeamConfirmationController {

    ISubTeamConfirmationController controller;

    public RMISubTeamConfirmationController(ISubTeamConfirmationController controller) throws RemoteException {
        super();
        this.controller = controller;
    }

    @Override
    public void setConfirmation(boolean confirm, String comment) {
        controller.setConfirmation(confirm, comment);
    }

    @Override
    public ITransferMember getMember() throws RemoteException {
        return controller.getMember();
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException, RemoteException, NotSupportedException, InstantiationException, IllegalAccessException {
        controller.start();
    }

    @Override
    public void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        controller.commit();
    }

    @Override
    public void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        controller.abort();
    }

}
