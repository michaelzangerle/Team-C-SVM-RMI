package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.IContestController;
import svm.rmi.abstraction.controller.IRMIContestController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class RMIContestController   extends UnicastRemoteObject implements IRMIContestController {

    IContestController contestController;
    public RMIContestController(IContestController contestController) throws RemoteException {
        super();
        this.contestController=contestController;
    }
}
