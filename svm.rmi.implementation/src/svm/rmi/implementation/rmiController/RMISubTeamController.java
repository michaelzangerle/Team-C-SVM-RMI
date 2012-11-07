package svm.rmi.implementation.rmiController;

import svm.domain.abstraction.exception.DomainException;
import svm.logic.abstraction.controller.ISubTeamController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.LogicException;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.logic.abstraction.transferobjects.ITransferSubTeam;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.rmi.abstraction.controller.IRMISubTeamController;

import javax.transaction.NotSupportedException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMISubTeamController extends UnicastRemoteObject implements IRMISubTeamController {

    ISubTeamController controller;

    public RMISubTeamController(ISubTeamController controller) throws RemoteException {
        super();
        this.controller = controller;
    }

    @Override
    public ITransferSubTeam getSubTeam() throws RemoteException {
        return controller.getSubTeam();
    }

    @Override
    public void setName(String s) throws RemoteException {
        controller.setName(s);
    }

    @Override
    public void addMember(ITransferMember iTransferMember) throws LogicException, NoSessionFoundException, DomainException, IllegalAccessException, InstantiationException, RemoteException, NotSupportedException {
        controller.addMember(iTransferMember);
    }

    @Override
    public void removeMember(ITransferMember iTransferMember) throws RemoteException {
        controller.removeMember(iTransferMember);
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
