package svm.rmi.implementation.rmiControllerFactory;

import svm.logic.abstraction.LogicFacade;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.logic.abstraction.transferobjects.ITransferSubTeam;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.rmi.abstraction.controller.IRMIContestConfirmationController;
import svm.rmi.abstraction.controller.IRMIContestController;
import svm.rmi.abstraction.controller.IRMISubTeamConfirmationController;
import svm.rmi.abstraction.controller.IRMISubTeamController;
import svm.rmi.abstraction.factory.IRMIControllerFactory;
import svm.rmi.implementation.rmiController.RMIContestConfirmationController;
import svm.rmi.implementation.rmiController.RMIContestController;
import svm.rmi.implementation.rmiController.RMISubTeamConfirmationController;
import svm.rmi.implementation.rmiController.RMISubTeamController;

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



    public static IRMIControllerFactory getInstance() throws RemoteException {
        if(instance==null)
            instance=new RMIControllerFactory();
        return instance;
    }

    @Override
    public IRMIContestController getRMIContestController() throws RemoteException {
        try {
            return new RMIContestController(LogicFacade.getContestController());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }

    @Override
    public IRMIContestController getRMIContestController(ITransferContest contest) throws RemoteException {
        try {
            return new RMIContestController(LogicFacade.getContestController(contest));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }

    @Override
    public IRMIContestConfirmationController getRMIContestConfirmationController(ITransferMember member) throws RemoteException {
        return new RMIContestConfirmationController(LogicFacade.getContestConfirmationController(member));
    }

    @Override
    public IRMISubTeamConfirmationController getRMISubTeamConfirmationController() throws RemoteException {
        return  new RMISubTeamConfirmationController(LogicFacade.getSubTeamConfirmationController());
    }

    @Override
    public IRMISubTeamController getRMISubTeamController(ITransferTeam team, ITransferContest contest) throws  RemoteException {
        try {
            return new RMISubTeamController(LogicFacade.getSubTeamController(team,contest));
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }

    @Override
    public IRMISubTeamController getRMISubTeamController(ITransferSubTeam subTeam) throws RemoteException {
        return new RMISubTeamController(LogicFacade.getSubTeamController(subTeam));
    }
}
