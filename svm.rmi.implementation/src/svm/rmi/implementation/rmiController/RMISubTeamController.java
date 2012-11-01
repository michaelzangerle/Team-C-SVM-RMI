package svm.rmi.implementation.rmiController;

import svm.rmi.abstraction.controller.IRMISubTeamController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMISubTeamController extends UnicastRemoteObject implements IRMISubTeamController {

    IRMISubTeamController controller;

    protected RMISubTeamController(IRMISubTeamController controller) throws RemoteException {
        super();
        this.controller=controller;
    }
}
