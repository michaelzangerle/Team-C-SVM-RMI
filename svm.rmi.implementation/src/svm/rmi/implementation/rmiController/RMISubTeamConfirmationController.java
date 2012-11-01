package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.ISubTeamConfirmationController;
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
        this.controller=controller;
    }


}
