package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.IContestConfirmationController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContestHasTeams;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMIContestConfirmationController;

import svm.persistence.abstraction.exceptions.NotSupportedException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class RMIContestConfirmationController extends UnicastRemoteObject implements IRMIContestConfirmationController {

    IContestConfirmationController confirmationController;

    public RMIContestConfirmationController(IContestConfirmationController contestConfirmationController) throws RemoteException {
        super();
        this.confirmationController = contestConfirmationController;
    }

    @Override
    public List<ITransferContestHasTeams> getTeamsForNotConfirmedContests() throws IllegalGetInstanceException, RemoteException {
        return confirmationController.getTeamsForNotConfirmedContests();
    }

    @Override
    public void confirmParticipationOfATeam(ITransferContestHasTeams iTransferContestHasTeams, boolean b, String s, boolean b1) throws RemoteException {
        confirmationController.confirmParticipationOfATeam(iTransferContestHasTeams, b, s, b1);
    }

    @Override
    public void start() throws NoSessionFoundException, IllegalGetInstanceException, RemoteException, NotSupportedException, InstantiationException, IllegalAccessException {
        confirmationController.start();
    }

    @Override
    public void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        confirmationController.commit();
    }

    @Override
    public void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException {
        confirmationController.abort();
    }
}
