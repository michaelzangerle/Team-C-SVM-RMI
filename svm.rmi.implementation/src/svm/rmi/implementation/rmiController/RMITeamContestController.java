package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.ITeamContestController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferMatch;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMITeamContestController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public class RMITeamContestController extends UnicastRemoteObject implements IRMITeamContestController {

    ITeamContestController controller;
    protected RMITeamContestController(ITeamContestController controller) throws RemoteException {
        super();
        this.controller=controller;
    }

    @Override
    public void addMatch(ITransferTeam iTransferTeam, ITransferTeam iTransferTeam1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addResult(ITransferMatch iTransferMatch, Integer integer, Integer integer1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addTeam(ITransferTeam iTransferTeam) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeTeam(ITransferTeam iTransferTeam) {
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
