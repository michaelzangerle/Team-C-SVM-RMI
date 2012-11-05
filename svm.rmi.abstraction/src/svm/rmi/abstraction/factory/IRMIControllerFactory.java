package svm.rmi.abstraction.factory;

import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.logic.abstraction.transferobjects.ITransferSubTeam;
import svm.logic.abstraction.transferobjects.ITransferTeam;
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
    public IRMIContestController getRMIContestController() throws RemoteException;

    /**
     * Change Contest
     *
     * @param contest
     * @return IRMIContestController
     * @throws RemoteException
     */
    public IRMIContestController getRMIContestController(ITransferContest contest) throws RemoteException;

    /**
     * Confirm a Contest for Member
     *
     * @param member
     * @return IRMIContestConfirmationController
     * @throws RemoteException
     */
    public IRMIContestConfirmationController getRMIContestConfirmationController(ITransferMember member) throws RemoteException;

    /**
     * Sub Team Confirmation
     *
     * @return IRMISubTeamConfirmationController
     * @throws RemoteException
     */
    public IRMISubTeamConfirmationController getRMISubTeamConfirmationController(ITransferMember member) throws RemoteException;

    /**
     * Handle SubTeams
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    public IRMISubTeamController getRMISubTeamController(ITransferTeam team, ITransferContest contest) throws RemoteException;

    /**
     * Handle SubTeams
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    public IRMISubTeamController getRMISubTeamController(ITransferSubTeam subTeam) throws RemoteException;

    /**
     * Member Controller
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    IRMIMemberController getRMIMemberController(ITransferMember member) throws RemoteException;

    /**
     * Handle Searches
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    IRMISearchController getRMISearchController() throws RemoteException;

    /**
     * Handle Login
     *
     * @return IRMILoginController
     * @throws RemoteException
     */
    IRMILoginController getRMILoginController() throws RemoteException;

    IRMITeamContestController getRMITeamContestController(ITransferContest contest) throws RemoteException;

    IRMIMemberController getRMIMemberController() throws RemoteException;
}
