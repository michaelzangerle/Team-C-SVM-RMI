package svm.rmi.abstraction.controller;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public interface IRMISubTeamConfirmationController extends Remote, Serializable, IRMIController {
    java.util.List<svm.logic.abstraction.transferobjects.ITransferSubTeamHasMember> getSubTeamsOfMember() throws svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException;

    void setConfirmationForSubTeam(svm.logic.abstraction.transferobjects.ITransferSubTeamHasMember iTransferSubTeamHasMember, boolean b, java.lang.String s) throws java.rmi.RemoteException;

    svm.logic.abstraction.transferobjects.ITransferMember getMember() throws java.rmi.RemoteException;
}
