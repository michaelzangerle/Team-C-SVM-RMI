package svm.rmi.abstraction.controller;

/**
 * ProjectTeam: Team C
 * Date: 22.11.12
 */
public interface IRMIMessageController extends IRMIController {
    void addObserver(svm.logic.abstraction.jmsobjects.IMessageObserver iMessageObserver) throws java.rmi.RemoteException;

    void removeObserver(svm.logic.abstraction.jmsobjects.IMessageObserver iMessageObserver) throws java.rmi.RemoteException;
}
