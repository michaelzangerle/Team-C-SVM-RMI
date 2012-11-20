package svm.rmi.implementation.rmiController;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.controller.IMemberController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.NotAllowException;
import svm.logic.abstraction.transferobjects.ITransferLocation;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.logic.abstraction.transferobjects.ITransferSport;
import svm.logic.abstraction.transferobjects.ITransferUserPrivilege;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.rmi.abstraction.controller.IRMIMemberController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public class RMIMemberController extends UnicastRemoteObject implements IRMIMemberController {

    IMemberController controller;

    public RMIMemberController(IMemberController memberController) throws RemoteException {
        super();
        this.controller = memberController;
    }

    @Override
    public ITransferMember getMember() throws RemoteException {
        return controller.getMember();
    }

    @Override
    public void setTitle(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setTitle(s);
    }

    @Override
    public void setFirstName(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setFirstName(s);
    }

    @Override
    public void setLastName(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setLastName(s);
    }

    @Override
    public void setSocialNumber(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setSocialNumber(s);
    }

    @Override
    public void setBirthDate(Date date) throws DomainParameterCheckException, RemoteException, NotAllowException {
        controller.setBirthDate(date);
    }

    @Override
    public void setGender(String s) throws DomainParameterCheckException, DomainAttributeException, RemoteException, NotAllowException {
        controller.setGender(s);
    }

    @Override
    public void setEntryDate(Date date) throws DomainParameterCheckException, RemoteException, NotAllowException {
        controller.setEntryDate(date);
    }

    @Override
    public void setPhone1(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setPhone1(s);
    }

    @Override
    public void setPhone2(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setPhone2(s);
    }

    @Override
    public void setEmail1(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setEmail1(s);
    }

    @Override
    public void setEmail2(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setEmail2(s);
    }

    @Override
    public void setFax(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setFax(s);
    }

    @Override
    public void setStreet(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setStreet(s);
    }

    @Override
    public void setStreetNumber(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setStreetNumber(s);
    }

    @Override
    public void setLat(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setLat(s);
    }

    @Override
    public void setLong(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setLong(s);
    }

    @Override
    public void setLocation(ITransferLocation iTransferLocation) throws DomainAttributeException, RemoteException, NotAllowException {
        controller.setLocation(iTransferLocation);
    }

    @Override
    public void setUsername(String userName) throws RemoteException, DomainAttributeException, NotAllowException {
        controller.setUsername(userName);
    }

    @Override
    public void setPaidCurrentYear() throws RemoteException, DomainAttributeException, NoSessionFoundException, IllegalAccessException, InstantiationException, NotSupportedException, NotAllowException {
        this.controller.setPaidCurrentYear();
    }

    @Override
    public List<ITransferUserPrivilege> getPrivileges() throws RemoteException, IllegalGetInstanceException {
        return controller.getPrivileges();
    }

    @Override
    public void addPrivilege(ITransferUserPrivilege privilege) throws NotAllowException, DomainParameterCheckException, NoSessionFoundException, DomainAttributeException, IllegalAccessException, InstantiationException, RemoteException {
        controller.addPrivilege(privilege);
    }

    @Override
    public void removePrivilege(ITransferUserPrivilege privilege) throws NotAllowException, DomainParameterCheckException, DomainAttributeException, RemoteException {
        controller.removePrivilege(privilege);
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException, RemoteException, NotSupportedException, InstantiationException, IllegalAccessException {
        controller.start();
    }

    @Override
    public void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        controller.commit();
    }

    @Override
    public void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        controller.abort();
    }

    @Override
    public void setSport(ITransferSport sport) throws RemoteException{
       controller.setSport(sport);
    }

    @Override
    public ITransferSport getSport() throws RemoteException{
      return controller.getSport();
    }

}
