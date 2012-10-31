package svm.rmi.implementation.rmiController;

import svm.rmi.abstraction.controller.IRMIContestConfirmationController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class RMIContestConfirmationController extends UnicastRemoteObject implements IRMIContestConfirmationController {

    protected RMIContestConfirmationController() throws RemoteException {
        super();
    }
}
