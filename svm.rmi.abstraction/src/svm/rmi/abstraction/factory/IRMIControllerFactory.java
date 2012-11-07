package svm.rmi.abstraction.factory;

import svm.logic.abstraction.transferobjects.*;
import svm.rmi.abstraction.controller.*;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IRMIControllerFactory extends Remote {


    /**
     * Get Contest Controller
     *
     * @return IRMIContestController
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws svm.persistence.abstraction.exceptions.NoSessionFoundException
     *
     * @throws RemoteException
     */
    public IRMIContestController getRMIContestController(ITransferAuth user) throws RemoteException;

    /**
     * Change Contest
     *
     * @param contest
     * @return IRMIContestController
     * @throws RemoteException
     */
    public IRMIContestController getRMIContestController(ITransferContest contest,ITransferAuth user) throws RemoteException;

    /**
     * Confirm a Contest for Member
     *
     * @param member
     * @return IRMIContestConfirmationController
     * @throws RemoteException
     */
    public IRMIContestConfirmationController getRMIContestConfirmationController(ITransferMember member,ITransferAuth user) throws RemoteException;

    /**
     * Sub Team Confirmation
     *
     * @return IRMISubTeamConfirmationController
     * @throws RemoteException
     */
    public IRMISubTeamConfirmationController getRMISubTeamConfirmationController(ITransferMember member,ITransferAuth user) throws RemoteException;

    /**
     * Handle SubTeams
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    public IRMISubTeamController getRMISubTeamController(ITransferTeam team, ITransferContest contest,ITransferAuth user) throws RemoteException;

    /**
     * Handle SubTeams
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    public IRMISubTeamController getRMISubTeamController(ITransferSubTeam subTeam,ITransferAuth user) throws RemoteException;

    /**
     * Member Controller
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    IRMIMemberController getRMIMemberController(ITransferMember member,ITransferAuth user) throws RemoteException;

    /**
     * Handle Searches
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    IRMISearchController getRMISearchController(ITransferAuth user) throws RemoteException;

    IRMIContestController getRMITeamContestController(ITransferContest contest,ITransferAuth user) throws RemoteException;

    IRMIMemberController getRMIMemberController(ITransferAuth user) throws RemoteException;

    IRMILoginController getRMILoginController() throws RemoteException;
}
