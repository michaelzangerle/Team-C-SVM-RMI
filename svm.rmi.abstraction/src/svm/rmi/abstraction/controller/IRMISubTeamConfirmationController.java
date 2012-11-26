package svm.rmi.abstraction.controller;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public interface IRMISubTeamConfirmationController extends Remote, Serializable, IRMIController {

    svm.logic.abstraction.transferobjects.ITransferMember getMember() throws java.rmi.RemoteException;

    void setConfirmation(boolean confirm, String comment);
}
