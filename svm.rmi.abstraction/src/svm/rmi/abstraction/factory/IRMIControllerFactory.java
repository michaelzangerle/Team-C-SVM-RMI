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
    public IRMIContestController getRMIContestController(ITransferMember user) throws RemoteException;

    /**
     * Change Contest
     *
     * @param contest
     * @return IRMIContestController
     * @throws RemoteException
     */
    public IRMIContestController getRMIContestController(ITransferContest contest,ITransferMember user) throws RemoteException;

    /**
     * Confirm a Contest for Member
     *
     * @param member
     * @return IRMIContestConfirmationController
     * @throws RemoteException
     */
    public IRMIContestConfirmationController getRMIContestConfirmationController(ITransferMember member,ITransferMember user) throws RemoteException;

    /**
     * Sub Team Confirmation
     *
     * @return IRMISubTeamConfirmationController
     * @throws RemoteException
     */
    public IRMISubTeamConfirmationController getRMISubTeamConfirmationController(ITransferMember member,ITransferMember user) throws RemoteException;

    /**
     * Handle SubTeams
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    public IRMISubTeamController getRMISubTeamController(ITransferTeam team, ITransferContest contest,ITransferMember user) throws RemoteException;

    /**
     * Handle SubTeams
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    public IRMISubTeamController getRMISubTeamController(ITransferSubTeam subTeam,ITransferMember user) throws RemoteException;

    /**
     * Member Controller
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    IRMIMemberController getRMIMemberController(ITransferMember member,ITransferMember user) throws RemoteException;

    /**
     * Handle Searches
     *
     * @return IRMISubTeamController
     * @throws RemoteException
     */
    IRMISearchController getRMISearchController(ITransferMember user) throws RemoteException;

    /**
     * Handle Login
     *
     * @return IRMILoginController
     * @throws RemoteException
     */
    IRMILoginController getRMILoginController(ITransferMember user) throws RemoteException;

    IRMITeamContestController getRMITeamContestController(ITransferContest contest,ITransferMember user) throws RemoteException;

    IRMIMemberController getRMIMemberController(ITransferMember user) throws RemoteException;
}
