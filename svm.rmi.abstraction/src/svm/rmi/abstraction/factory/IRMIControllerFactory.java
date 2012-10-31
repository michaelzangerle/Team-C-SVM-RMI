package svm.rmi.abstraction.factory;

import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.rmi.abstraction.controller.IRMIContestConfirmationController;
import svm.rmi.abstraction.controller.IRMIContestController;

import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IRMIControllerFactory extends Remote {



    IRMIControllerFactory getInstance();

    public IRMIContestController getContestController() throws IllegalAccessException, InstantiationException, NoSessionFoundException;

    /**
     * Change Contest
     *
     * @param contest
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public IRMIContestController getContestController(ITransferContest contest) throws IllegalAccessException, InstantiationException;

    /**
     * Confirm a Contest for Member
     *
     * @param member
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public IRMIContestConfirmationController getContestConfirmationController(ITransferMember member);

}
