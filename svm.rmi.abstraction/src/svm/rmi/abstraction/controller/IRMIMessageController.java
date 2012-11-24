package svm.rmi.abstraction.controller;

import java.rmi.RemoteException;

/**
 * ProjectTeam: Team C
 * Date: 22.11.12
 */
public interface IRMIMessageController extends IRMIController {
    void addObserver(svm.logic.abstraction.jmsobjects.IMessageObserver iMessageObserver) throws java.rmi.RemoteException;

    void removeObserver(svm.logic.abstraction.jmsobjects.IMessageObserver iMessageObserver) throws java.rmi.RemoteException;

    void updateMessages() throws javax.jms.JMSException, RemoteException;
}
