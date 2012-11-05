package svm.rmi.abstraction.controller;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public interface IRMITeamContestController extends Remote, Serializable, IRMIController {
    void addResult(svm.logic.abstraction.transferobjects.ITransferMatch p0, java.lang.Integer p1, java.lang.Integer p2) throws java.rmi.RemoteException, svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.domain.abstraction.exception.DomainException, java.lang.IllegalAccessException, java.lang.InstantiationException;

    void addTeam(svm.logic.abstraction.transferobjects.ITransferTeam p0) throws java.rmi.RemoteException, svm.domain.abstraction.exception.DomainException, svm.persistence.abstraction.exceptions.NoSessionFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException;

    void removeTeam(svm.logic.abstraction.transferobjects.ITransferTeam p0) throws java.rmi.RemoteException, svm.domain.abstraction.exception.DomainException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferMatch> getMatches() throws java.rmi.RemoteException, svm.logic.abstraction.exception.IllegalGetInstanceException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferTeam> getTeams() throws java.rmi.RemoteException, svm.logic.abstraction.exception.IllegalGetInstanceException;

    void addMatch(svm.logic.abstraction.transferobjects.ITransferTeam p0, svm.logic.abstraction.transferobjects.ITransferTeam p1, java.util.Date p2, java.util.Date p3) throws java.rmi.RemoteException, svm.domain.abstraction.exception.DomainException, svm.persistence.abstraction.exceptions.NoSessionFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, svm.logic.abstraction.exception.LogicException;
}
