package svm.rmi.abstraction.controller;

import java.io.Serializable;
import java.rmi.Remote;

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
}
