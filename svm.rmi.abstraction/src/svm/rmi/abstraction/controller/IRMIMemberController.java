package svm.rmi.abstraction.controller;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.logic.abstraction.exception.NotAllowException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import javax.transaction.NotSupportedException;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public interface IRMIMemberController extends Remote, Serializable, IRMIController {

    svm.logic.abstraction.transferobjects.ITransferMember getMember() throws RemoteException;

    void setTitle(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setFirstName(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setLastName(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setSocialNumber(java.lang.String s) throws svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setBirthDate(java.util.Date date) throws svm.domain.abstraction.exception.DomainParameterCheckException, java.rmi.RemoteException, NotAllowException;

    void setGender(java.lang.String s) throws svm.domain.abstraction.exception.DomainParameterCheckException, svm.domain.abstraction.exception.DomainAttributeException, java.rmi.RemoteException, NotAllowException;

    void setEntryDate(java.util.Date date) throws svm.domain.abstraction.exception.DomainParameterCheckException, java.rmi.RemoteException, NotAllowException;

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

    void setUsername(String userName) throws RemoteException, DomainAttributeException, NotAllowException;

    void setPaidCurrentYear() throws RemoteException, DomainAttributeException, NoSessionFoundException, IllegalAccessException, InstantiationException, NotSupportedException, NotAllowException, javax.transaction.NotSupportedException;
}
