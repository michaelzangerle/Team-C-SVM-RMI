package svm.rmi.abstraction.factory;

import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.logic.abstraction.transferobjects.ITransferSubTeam;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.rmi.abstraction.controller.IRMIContestConfirmationController;
import svm.rmi.abstraction.controller.IRMIContestController;
import svm.rmi.abstraction.controller.IRMISubTeamConfirmationController;
import svm.rmi.abstraction.controller.IRMISubTeamController;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IRMIControllerFactory extends Remote {



    IRMIControllerFactory getInstance() throws RemoteException;

    /**
     * Get Contest Controller
     * @return    IRMIContestController
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSessionFoundException
     * @throws RemoteException
     */
    public IRMIContestController getRMIContestController() throws IllegalAccessException, InstantiationException, NoSessionFoundException, RemoteException;

    /**
     * Change Contest
     *
     * @param contest
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public IRMIContestController getRMIContestController(ITransferContest contest) throws IllegalAccessException, InstantiationException, RemoteException;

    /**
     * Confirm a Contest for Member
     *
     * @param member
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public IRMIContestConfirmationController getRMIContestConfirmationController(ITransferMember member) throws RemoteException;

    /**
     * Sub Team Confirmation
     * @return IRMISubTeamConfirmationController
     */
    public IRMISubTeamConfirmationController getRMISubTeamConfirmationController() throws RemoteException;

    /**
     * Handle SubTeams
     * @return  IRMISubTeamController
     */
    public IRMISubTeamController getRMISubTeamController(ITransferTeam team, ITransferContest contest) throws NoSessionFoundException, IllegalAccessException, InstantiationException, RemoteException;

    /**
     * Handle SubTeams
     * @return  IRMISubTeamController
     */
    public IRMISubTeamController getRMISubTeamController(ITransferSubTeam subTeam) throws RemoteException;

}
