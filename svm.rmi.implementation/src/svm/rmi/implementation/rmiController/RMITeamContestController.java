package svm.rmi.implementation.rmiController;

import svm.domain.abstraction.exception.DomainException;
import svm.logic.abstraction.controller.ITeamContestController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.LogicException;
import svm.logic.abstraction.transferobjects.ITransferMatch;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMITeamContestController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public class RMITeamContestController extends UnicastRemoteObject implements IRMITeamContestController {

    ITeamContestController controller;

    public RMITeamContestController(ITeamContestController controller) throws RemoteException {
        super();
        this.controller = controller;
    }

    @Override
    public void addMatch(ITransferTeam iTransferTeam, ITransferTeam iTransferTeam1, Date d1, Date d2) throws RemoteException, NoSessionFoundException, LogicException, DomainException, InstantiationException, IllegalAccessException {
        controller.addMatch(iTransferTeam, iTransferTeam1, d1, d2);
    }

    @Override
    public void setDateForMatch(ITransferMatch match, Date date) {
        controller.setDateForMatch(match,date);
    }

    @Override
    public void addResult(ITransferMatch iTransferMatch, Integer integer, Integer integer1) throws RemoteException, NoSessionFoundException, DomainException, IllegalAccessException, InstantiationException {
        controller.addResult(iTransferMatch, integer, integer1);
    }

    @Override
    public void addTeam(ITransferTeam iTransferTeam) throws RemoteException, NoSessionFoundException, DomainException, InstantiationException, IllegalAccessException {
        controller.addTeam(iTransferTeam);
    }

    @Override
    public void removeTeam(ITransferTeam iTransferTeam) throws RemoteException, DomainException {
        controller.removeTeam(iTransferTeam);
    }

    @Override
    public List<ITransferMatch> getMatches() throws RemoteException, IllegalGetInstanceException {
        return controller.getMatches();
    }

    @Override
    public List<ITransferTeam> getTeams() throws RemoteException, IllegalGetInstanceException {
        return controller.getTeams();
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException, RemoteException {
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
}
