package svm.rmi.abstraction.controller;

import svm.persistence.abstraction.exceptions.NotSupportedException;
import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public interface IRMISubTeamController extends Remote, Serializable, IRMIController {
    svm.logic.abstraction.transferobjects.ITransferSubTeam getSubTeam() throws java.rmi.RemoteException;

    void setName(java.lang.String s) throws java.rmi.RemoteException;

    void addMember(svm.logic.abstraction.transferobjects.ITransferMember iTransferMember) throws svm.logic.abstraction.exception.LogicException, svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.domain.abstraction.exception.DomainException, java.lang.IllegalAccessException, java.lang.InstantiationException, java.rmi.RemoteException, NotSupportedException;

    void removeMember(svm.logic.abstraction.transferobjects.ITransferMember iTransferMember) throws java.rmi.RemoteException;
}
