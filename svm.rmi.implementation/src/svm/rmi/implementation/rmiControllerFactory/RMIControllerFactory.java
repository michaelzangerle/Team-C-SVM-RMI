package svm.rmi.implementation.rmiControllerFactory;

import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.ISubTeam;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.logic.abstraction.LogicFacade;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.rmi.abstraction.controller.IRMIContestConfirmationController;
import svm.rmi.abstraction.controller.IRMIContestController;
import svm.rmi.abstraction.controller.IRMISubTeamConfirmationController;
import svm.rmi.abstraction.controller.IRMISubTeamController;
import svm.rmi.abstraction.factory.IRMIControllerFactory;
import svm.rmi.implementation.rmiController.RMIContestConfirmationController;
import svm.rmi.implementation.rmiController.RMIContestController;

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
    public IRMIControllerFactory getInstance() throws RemoteException {
        if(instance==null)
            instance=new RMIControllerFactory();
        return instance;
    }

    @Override
    public IRMIContestController getRMIContestController() throws IllegalAccessException, InstantiationException, NoSessionFoundException, RemoteException {
        return new RMIContestController(LogicFacade.getContestController());
    }

    @Override
    public IRMIContestController getRMIContestController(ITransferContest contest) throws IllegalAccessException, InstantiationException, RemoteException {
        return new RMIContestController(LogicFacade.getContestController(contest));
    }

    @Override
    public IRMIContestConfirmationController getRMIContestConfirmationController(ITransferMember member) throws RemoteException {
        return new RMIContestConfirmationController(LogicFacade.getContestConfirmationController(member));
    }

    @Override
    public IRMISubTeamConfirmationController getRMISubTeamConfirmationController() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IRMISubTeamController getRMISubTeamController(ITeam team, IContest contest) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IRMISubTeamController getRMISubTeamController(ISubTeam subTeam) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
