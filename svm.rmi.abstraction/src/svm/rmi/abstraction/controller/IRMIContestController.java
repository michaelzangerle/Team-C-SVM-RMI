package svm.rmi.abstraction.controller;

import svm.domain.abstraction.exception.DomainException;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.LogicException;
import svm.logic.abstraction.transferobjects.ITransferMatch;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IRMIContestController extends Remote, Serializable, IRMIController {

    void setContestName(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setContestStartDate(java.util.Date date) throws svm.domain.abstraction.exception.DomainParameterCheckException, java.rmi.RemoteException;

    void setContestEndDate(java.util.Date date) throws svm.domain.abstraction.exception.DomainParameterCheckException, java.rmi.RemoteException;

    void setContestFee(float v) throws svm.domain.abstraction.exception.DomainParameterCheckException, svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    svm.logic.abstraction.transferobjects.ITransferContest getTransferContest() throws java.rmi.RemoteException;

    void setPhone1(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setPhone2(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setEmail1(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setEmail2(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setFax(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setStreet(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setStreetNumber(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setLat(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setLong(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    void setLocation(svm.logic.abstraction.transferobjects.ITransferLocation iTransferLocation) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException;

    List<ITransferTeam> getTeams() throws RemoteException, IllegalGetInstanceException;

    List<ITransferMatch> getMatches() throws RemoteException, IllegalGetInstanceException;

    void removeTeam(ITransferTeam iTransferTeam) throws RemoteException, DomainException;

    void addTeam(ITransferTeam iTransferTeam) throws RemoteException, NoSessionFoundException, DomainException, InstantiationException, IllegalAccessException;

    void setDateForMatch(ITransferMatch match, Date date) throws RemoteException;

    void addMatch(ITransferTeam iTransferTeam, ITransferTeam iTransferTeam1, Date d1, Date d2) throws RemoteException, NoSessionFoundException, LogicException, DomainException, InstantiationException, IllegalAccessException;

    void setResult(ITransferMatch match, Integer home, Integer away) throws NoSessionFoundException, DomainException, InstantiationException, IllegalAccessException, RemoteException;
}
