package svm.rmi.implementation.rmiControllerFactory;


import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.LogicFacade;
import svm.logic.abstraction.controller.IMemberController;
import svm.logic.abstraction.controller.ISearchController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.NotAllowException;
import svm.logic.abstraction.transferobjects.*;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.rmi.abstraction.controller.*;
import svm.rmi.abstraction.factory.IRMIControllerFactory;
import svm.rmi.implementation.rmiController.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class RMIControllerFactory extends UnicastRemoteObject implements IRMIControllerFactory {

    private static IRMIControllerFactory instance;

    private RMIControllerFactory() throws RemoteException {
        super();
    }


    public static IRMIControllerFactory getInstance() throws RemoteException {
        if (instance == null)
            instance = new RMIControllerFactory();
        return instance;
    }

    @Override
    public IRMIContestController getRMIContestController(ITransferAuth user) throws RemoteException {
        try {
            return new RMIContestController(LogicFacade.getContestController(user));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (NotSupportedException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    @Override
    public IRMIContestController getRMIContestController(ITransferContest contest, ITransferAuth user) throws RemoteException {
        try {
            return new RMIContestController(LogicFacade.getContestController(user, contest));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    @Override
    public IRMIContestConfirmationController getRMIContestConfirmationController(ITransferMember member, ITransferAuth user) throws RemoteException {
        return new RMIContestConfirmationController(LogicFacade.getContestConfirmationController(user, member));
    }


    @Override
    public IRMISubTeamConfirmationController getRMISubTeamConfirmationController(ITransferMember member, ITransferAuth user) throws RemoteException {
        return new RMISubTeamConfirmationController(LogicFacade.getSubTeamConfirmationController(user, member));
    }

    @Override
    public IRMISubTeamController getRMISubTeamController(ITransferTeam team, ITransferContest contest, ITransferAuth user) throws RemoteException {
        try {
            return new RMISubTeamController(LogicFacade.getSubTeamController(user, team, contest));
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (NotSupportedException e) {
            throw new RemoteException(e.getMessage(), e);
        }
    }

    @Override
    public IRMIMemberController getRMIMemberController(ITransferMember member, ITransferAuth user) throws RemoteException {
        return new RMIMemberController(LogicFacade.getMemberController(user, member));
    }

    @Override
    public IRMIMemberController getRMIMemberController(ITransferAuth user) throws RemoteException {
        try {
            return new RMIMemberController(LogicFacade.getMemberController(user));
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (NotSupportedException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    @Override
    public IRMISearchController getRMISearchController(ITransferAuth user) throws RemoteException {
        return new RMISearchController(LogicFacade.getSearchController(user));

    }

    @Override
    public IRMIContestController getRMITeamContestController(ITransferContest contest, ITransferAuth user) throws RemoteException {
        try {
            return new RMIContestController(LogicFacade.getContestController(user, contest));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    /**
     * Handle Login
     *
     * @return IRMILoginController
     * @throws RemoteException
     */
    @Override
    public IRMILoginController getRMILoginController() throws RemoteException {
        return new RMILoginController(LogicFacade.getLoginController());
    }

    @Override
    public IRMIMessageController getRMIMessageController(ITransferAuth user) throws RemoteException {
        return new RMIMessageController(LogicFacade.getMessageController(user));
    }

    @Override
    public void generateTestMember(ITransferAuth user) throws RemoteException {
        try {
            ISearchController searchController = LogicFacade.getSearchController(user);
            searchController.start();
            ITransferSport sport = null;
            sport = searchController.getSports().get(0);
            searchController.commit();

            IMemberController memberController = LogicFacade.getMemberController(user);
            memberController.start();
            memberController.setBirthDate(new Date());
            memberController.setEntryDate(new Date());
            memberController.setLat("");
            memberController.setLong("");
            memberController.setFirstName("asdf");
            memberController.setGender("M");
            memberController.setLastName("asdf");
            memberController.setSocialNumber("asdf");
            memberController.setTitle("asdf");
            memberController.setUsername("sadf");

            memberController.setSport(sport);
            memberController.commit();
        } catch (NotAllowException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSessionFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (DomainParameterCheckException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ExistingTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (DomainAttributeException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
