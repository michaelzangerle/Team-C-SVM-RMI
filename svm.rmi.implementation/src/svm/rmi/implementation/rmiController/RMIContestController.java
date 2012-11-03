package svm.rmi.implementation.rmiController;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.controller.IContestController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferLocation;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMIContestController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class RMIContestController   extends UnicastRemoteObject implements IRMIContestController {

    IContestController contestController;

    public RMIContestController(IContestController contestController) throws RemoteException {
        super();
        this.contestController=contestController;
    }

    @Override
    public void setContestName(String s) throws DomainAttributeException {
       contestController.setContestName(s);
    }

    @Override
    public void setContestStartDate(Date date) throws DomainParameterCheckException {
       contestController.setContestEndDate(date);
    }

    @Override
    public void setContestEndDate(Date date) throws DomainParameterCheckException {
         contestController.setContestEndDate(date);
    }

    @Override
    public void setContestFee(float v) throws DomainParameterCheckException, DomainAttributeException {
        contestController.setContestFee(v);
    }

    @Override
    public ITransferContest getTransferContest() {
       return contestController.getTransferContest();
    }

    @Override
    public void setPhone1(String s) throws DomainAttributeException {
       contestController.setPhone1(s);
    }

    @Override
    public void setPhone2(String s) throws DomainAttributeException {
       contestController.setPhone2(s);
    }

    @Override
    public void setEmail1(String s) throws DomainAttributeException {
        contestController.setEmail1(s);
    }

    @Override
    public void setEmail2(String s) throws DomainAttributeException {
        contestController.setEmail2(s);
    }

    @Override
    public void setFax(String s) throws DomainAttributeException {
       contestController.setFax(s);
    }

    @Override
    public void setStreet(String s) throws DomainAttributeException {
       contestController.setStreet(s);
    }

    @Override
    public void setStreetNumber(String s) throws DomainAttributeException {
        contestController.setStreetNumber(s);
    }

    @Override
    public void setLat(String s) throws DomainAttributeException {
        contestController.setLat(s);
    }

    @Override
    public void setLong(String s) throws DomainAttributeException {
        contestController.setLong(s);
    }

    @Override
    public void setLocation(ITransferLocation iTransferLocation) throws DomainAttributeException {
      contestController.setLocation(iTransferLocation);
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException {
        contestController.start();
    }

    @Override
    public void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException {
        contestController.commit();
    }

    @Override
    public void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException {
        contestController.abort();
    }
}
