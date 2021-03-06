package svm.rmi.abstraction.controller;

import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;


import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * ProjectTeam: Team C
 * Date: 05.11.12
 */
public interface IRMIController extends Remote, Serializable {
    void commit() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException;

    void start() throws NoSessionFoundException, IllegalGetInstanceException, RemoteException, InstantiationException, IllegalAccessException,NotSupportedException;

    void abort() throws ExistingTransactionException, NoSessionFoundException, NoTransactionException, RemoteException;
}
