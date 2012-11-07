package svm.rmi.implementation.rmiController;

import svm.logic.abstraction.controller.ISubTeamConfirmationController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.logic.abstraction.transferobjects.ITransferSubTeamHasMember;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMISubTeamConfirmationController;

import javax.transaction.NotSupportedException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMISubTeamConfirmationController extends UnicastRemoteObject implements IRMISubTeamConfirmationController {

    ISubTeamConfirmationController controller;

    public RMISubTeamConfirmationController(ISubTeamConfirmationController controller) throws RemoteException {
        super();
        this.controller = controller;
    }


    @Override
    public List<ITransferSubTeamHasMember> getSubTeamsOfMember() throws IllegalGetInstanceException, RemoteException {
        return controller.getSubTeamsOfMember();
    }

    @Override
    public void setConfirmationForSubTeam(ITransferSubTeamHasMember iTransferSubTeamHasMember, boolean b, String s) throws RemoteException {
        controller.setConfirmationForSubTeam(iTransferSubTeamHasMember, b, s);
    }

    @Override
    public ITransferMember getMember() throws RemoteException {
        return controller.getMember();
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

}
