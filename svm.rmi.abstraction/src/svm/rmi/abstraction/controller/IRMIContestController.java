package svm.rmi.abstraction.controller;

import svm.domain.abstraction.exception.DomainException;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.LogicException;
import svm.logic.abstraction.exception.NotAllowException;
import svm.logic.abstraction.transferobjects.ITransferMatch;
import svm.logic.abstraction.transferobjects.ITransferSport;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import svm.persistence.abstraction.exceptions.NotSupportedException;
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

    void setContestName(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setContestStartDate(java.util.Date date) throws svm.domain.abstraction.exception.DomainParameterCheckException, java.rmi.RemoteException, NotAllowException;

    void setContestEndDate(java.util.Date date) throws svm.domain.abstraction.exception.DomainParameterCheckException, java.rmi.RemoteException, NotAllowException;

    void setContestFee(float v) throws svm.domain.abstraction.exception.DomainParameterCheckException, svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    svm.logic.abstraction.transferobjects.ITransferContest getTransferContest() throws java.rmi.RemoteException;

    void setPhone1(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setPhone2(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setEmail1(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setEmail2(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setFax(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setStreet(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setStreetNumber(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setLat(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setLong(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setLocation(svm.logic.abstraction.transferobjects.ITransferLocation iTransferLocation) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    List<ITransferTeam> getTeams() throws RemoteException, IllegalGetInstanceException;

    List<ITransferMatch> getMatches() throws RemoteException, IllegalGetInstanceException;

    void removeTeam(ITransferTeam iTransferTeam) throws RemoteException, DomainException, NotAllowException;

    void addTeam(ITransferTeam iTransferTeam) throws RemoteException, NoSessionFoundException, DomainException, InstantiationException, IllegalAccessException, NotAllowException;

    void setDateForMatch(ITransferMatch match, Date date) throws RemoteException, NotAllowException;

    void addMatch(ITransferTeam iTransferTeam, ITransferTeam iTransferTeam1, Date d1, Date d2) throws RemoteException, NoSessionFoundException, LogicException, DomainException, InstantiationException, IllegalAccessException, NotSupportedException, NotAllowException;

    void setResult(ITransferMatch match, Integer home, Integer away) throws NoSessionFoundException, DomainException, InstantiationException, IllegalAccessException, RemoteException, NotAllowException;

    void setSport(ITransferSport sport) throws NotAllowException, RemoteException;

    void setFinished(Boolean finished) throws RemoteException;
}
