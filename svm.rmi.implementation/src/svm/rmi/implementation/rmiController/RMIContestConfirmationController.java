package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.IContestConfirmationController;
import svm.rmi.abstraction.controller.IRMIContestConfirmationController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class RMIContestConfirmationController extends UnicastRemoteObject implements IRMIContestConfirmationController {

    IContestConfirmationController confirmationController;

    public RMIContestConfirmationController(IContestConfirmationController contestConfirmationController) throws RemoteException {
        super();
        this.confirmationController=contestConfirmationController;
    }
}
