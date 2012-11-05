package svm.rmi.abstraction.controller;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IRMIContestConfirmationController extends Remote, Serializable, IRMIController {

    java.util.List<svm.logic.abstraction.transferobjects.ITransferContestHasTeams> getTeamsForNotConfirmedContests() throws java.rmi.RemoteException, svm.logic.abstraction.exception.IllegalGetInstanceException;

    void confirmParticipationOfATeam(svm.logic.abstraction.transferobjects.ITransferContestHasTeams iTransferContestHasTeams, boolean b, java.lang.String s, boolean b1) throws java.rmi.RemoteException;
}
