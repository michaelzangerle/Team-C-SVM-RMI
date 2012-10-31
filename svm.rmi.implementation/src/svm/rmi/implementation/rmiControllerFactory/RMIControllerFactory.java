package svm.rmi.implementation.rmiControllerFactory;

import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.rmi.abstraction.controller.IRMIContestConfirmationController;
import svm.rmi.abstraction.controller.IRMIContestController;
import svm.rmi.abstraction.factory.IRMIControllerFactory;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class RMIControllerFactory extends UnicastRemoteObject implements IRMIControllerFactory {

    private static IRMIControllerFactory instance;

    private RMIControllerFactory() throws RemoteException {
        super();
    }


    @Override
    public IRMIControllerFactory getInstance() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IRMIContestController getContestController() throws IllegalAccessException, InstantiationException, NoSessionFoundException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IRMIContestController getContestController(ITransferContest contest) throws IllegalAccessException, InstantiationException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IRMIContestConfirmationController getContestConfirmationController(ITransferMember member) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
