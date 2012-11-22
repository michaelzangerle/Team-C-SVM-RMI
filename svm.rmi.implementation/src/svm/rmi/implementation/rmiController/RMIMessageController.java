package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.IMessageController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.jmsobjects.IMessageObserver;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.rmi.abstraction.controller.IRMIMessageController;

import java.rmi.RemoteException;

/**
 * ProjectTeam: Team C
 * Date: 22.11.12
 */
public class RMIMessageController implements IRMIMessageController {

    IMessageController controller;

    public RMIMessageController(IMessageController controller) throws RemoteException {
        super();
        this.controller = controller;
    }

    @Override
    public void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        controller.commit();
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException, RemoteException, InstantiationException, IllegalAccessException, NotSupportedException {
        controller.start();
    }

    @Override
    public void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        controller.abort();
    }

    @Override
    public void addObserver(IMessageObserver iMessageObserver) throws RemoteException {
        controller.addObserver(iMessageObserver);
    }

    @Override
    public void removeObserver(IMessageObserver iMessageObserver) throws RemoteException {
        controller.removeObserver(iMessageObserver);
    }
}
