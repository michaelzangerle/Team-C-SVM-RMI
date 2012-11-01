package svm.rmi.implementation.rmiController;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.controller.IContestController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContest;
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

    public void setContestName(String s) throws RemoteException
    {
        try {
            contestController.setContestName(s);
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);

        }
    }

    @Override
    public void setContestStartDate(Date date) throws RemoteException {
        try {
            contestController.setContestStartDate(date);
        } catch (DomainParameterCheckException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }

    @Override
    public void setContestEndDate(Date date) throws RemoteException {
        try {
            contestController.setContestEndDate(date);
        } catch (DomainParameterCheckException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }

    @Override
    public void setContestFee(float v) throws RemoteException {
        try {
            contestController.setContestFee(v);
        } catch (DomainParameterCheckException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }

    @Override
    public ITransferContest getTransferContest() {
      return contestController.getTransferContest();
    }

    @Override
    public void start() throws RemoteException{
        try {
            contestController.start();
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }

    @Override
    public void commit() throws RemoteException {
        try {
            contestController.commit();
        } catch (ExistingTransactionException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (NoTransactionException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }

    @Override
    public void abort() throws RemoteException {
        try {
            contestController.abort();
        } catch (ExistingTransactionException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        } catch (NoTransactionException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
    }
}
