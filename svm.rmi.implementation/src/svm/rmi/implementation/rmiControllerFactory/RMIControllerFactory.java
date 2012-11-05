package svm.rmi.implementation.rmiControllerFactory;

import svm.logic.abstraction.LogicFacade;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.logic.abstraction.transferobjects.ITransferSubTeam;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.rmi.abstraction.controller.*;
import svm.rmi.abstraction.factory.IRMIControllerFactory;
import svm.rmi.implementation.rmiController.*;

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
        if (instance == null)
            instance = new RMIControllerFactory();
        return instance;
    }

    @Override
    public IRMIContestController getRMIContestController() throws RemoteException {
        try {
            return new RMIContestController(LogicFacade.getContestController());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    @Override
    public IRMIContestController getRMIContestController(ITransferContest contest) throws RemoteException {
        try {
            return new RMIContestController(LogicFacade.getContestController(contest));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    @Override
    public IRMIContestConfirmationController getRMIContestConfirmationController(ITransferMember member) throws RemoteException {
        return new RMIContestConfirmationController(LogicFacade.getContestConfirmationController(member));
    }


    @Override
    public IRMISubTeamConfirmationController getRMISubTeamConfirmationController(ITransferMember member) throws RemoteException {
        return new RMISubTeamConfirmationController(LogicFacade.getSubTeamConfirmationController(member));
    }

    @Override
    public IRMISubTeamController getRMISubTeamController(ITransferTeam team, ITransferContest contest) throws RemoteException {
        try {
            return new RMISubTeamController(LogicFacade.getSubTeamController(team, contest));
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    @Override
    public IRMISubTeamController getRMISubTeamController(ITransferSubTeam subTeam) throws RemoteException {
        return new RMISubTeamController(LogicFacade.getSubTeamController(subTeam));
    }

    @Override
    public IRMIMemberController getRMIMemberController(ITransferMember member) throws RemoteException {
        return new RMIMemberController(LogicFacade.getMemberController(member));
    }

    @Override
    public IRMIMemberController getRMIMemberController() throws RemoteException {
        try {
            return new RMIMemberController(LogicFacade.getMemberController());
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    @Override
    public IRMISearchController getRMISearchController() throws RemoteException {
        return new RMISearchController(LogicFacade.getSearchController());
    }

    @Override
    public IRMITeamContestController getRMITeamContestController(ITransferContest contest) throws RemoteException {
        return new RMITeamContestController(LogicFacade.getTeamContestController(contest));
    }

    /**
     * Handle Login
     *
     * @return IRMILoginController
     * @throws RemoteException
     */
    public IRMILoginController getRMILoginController() throws RemoteException {
        return new RMILoginController(LogicFacade.getLoginController());
    }


}
