package svm.rmi.implementation.rmiController;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.controller.IMemberController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferLocation;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMIMemberController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public class RMIMemberController extends UnicastRemoteObject implements IRMIMemberController {

    IMemberController controller;
    protected RMIMemberController(IMemberController memberController) throws RemoteException {
        super();
        this.controller=memberController;
    }

    @Override
    public ITransferMember getMember() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTitle(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFirstName(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setLastName(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSocialNumber(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setBirthDate(Date date) throws DomainParameterCheckException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setGender(String s) throws DomainParameterCheckException, DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setEntryDate(Date date) throws DomainParameterCheckException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPhone1(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPhone2(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setEmail1(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setEmail2(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFax(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setStreet(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setStreetNumber(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setLat(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setLong(String s) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setLocation(ITransferLocation iTransferLocation) throws DomainAttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
