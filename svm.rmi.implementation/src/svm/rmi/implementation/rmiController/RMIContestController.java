package svm.rmi.implementation.rmiController;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.controller.IContestController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.LogicException;
import svm.logic.abstraction.exception.NotAllowException;
import svm.logic.abstraction.transferobjects.*;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMIContestController;

import svm.persistence.abstraction.exceptions.NotSupportedException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class RMIContestController extends UnicastRemoteObject implements IRMIContestController {

    IContestController contestController;

    public RMIContestController(IContestController contestController) throws RemoteException {
        super();
        this.contestController = contestController;
    }

    @Override
    public void setContestName(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setContestName(s);
    }

    @Override
    public void setContestStartDate(Date date) throws DomainParameterCheckException, RemoteException, NotAllowException {
        contestController.setContestStartDate(date);
    }

    @Override
    public void setContestEndDate(Date date) throws DomainParameterCheckException, RemoteException, NotAllowException {
        contestController.setContestEndDate(date);
    }

    @Override
    public void setContestFee(float v) throws DomainParameterCheckException, DomainAttributeException, RemoteException, NotAllowException {
        contestController.setContestFee(v);
    }

    @Override
    public ITransferContest getTransferContest() throws RemoteException {
        return contestController.getTransferContest();
    }

    @Override
    public void setPhone1(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setPhone1(s);
    }

    @Override
    public void setPhone2(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setPhone2(s);
    }

    @Override
    public void setEmail1(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setEmail1(s);
    }

    @Override
    public void setEmail2(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setEmail2(s);
    }

    @Override
    public void setFax(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setFax(s);
    }

    @Override
    public void setStreet(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setStreet(s);
    }

    @Override
    public void setStreetNumber(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setStreetNumber(s);
    }

    @Override
    public void setLat(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setLat(s);
    }

    @Override
    public void setLong(String s) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setLong(s);
    }

    @Override
    public void setLocation(ITransferLocation iTransferLocation) throws DomainAttributeException, RemoteException, NotAllowException {
        contestController.setLocation(iTransferLocation);
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException, RemoteException, NotSupportedException, InstantiationException, IllegalAccessException {
        contestController.start();
    }

    @Override
    public void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        contestController.commit();
    }

    @Override
    public void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        contestController.abort();
    }

    @Override
    public void addMatch(ITransferTeam iTransferTeam, ITransferTeam iTransferTeam1, Date d1, Date d2) throws RemoteException, NoSessionFoundException, LogicException, DomainException, InstantiationException, IllegalAccessException, NotSupportedException, NotAllowException {
        contestController.addMatch(iTransferTeam, iTransferTeam1, d1, d2);
    }

    @Override
    public void setResult(ITransferMatch match, Integer home, Integer away) throws RemoteException, NoSessionFoundException, DomainException, InstantiationException, IllegalAccessException, NotAllowException {
        contestController.setResult(match,home,away);
    }

    @Override
    public void setSport(ITransferSport sport) throws NotAllowException {
        contestController.setSport(sport);
    }

    @Override
    public void setFinished(Boolean finished) {
       contestController.setFinished(finished);
    }

    @Override
    public void setDateForMatch(ITransferMatch match, Date date) throws RemoteException, NotAllowException {
        contestController.setDateForMatch(match,date);
    }

    @Override
    public void addTeam(ITransferTeam iTransferTeam) throws RemoteException, NoSessionFoundException, DomainException, InstantiationException, IllegalAccessException, NotAllowException {
        contestController.addTeam(iTransferTeam);
    }

    @Override
    public void removeTeam(ITransferTeam iTransferTeam) throws RemoteException, DomainException, NotAllowException {
        contestController.removeTeam(iTransferTeam);
    }

    @Override
    public List<ITransferMatch> getMatches() throws RemoteException, IllegalGetInstanceException {
        return contestController.getMatches();
    }

    @Override
    public List<ITransferTeam> getTeams() throws RemoteException, IllegalGetInstanceException {
        return contestController.getTeams();
    }

}
