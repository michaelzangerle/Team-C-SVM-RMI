package svm.rmi.abstraction.controller;

import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public interface IRMILoginController extends Remote, Serializable, IRMIController {
    boolean login(java.lang.String s, java.lang.String s1) throws java.rmi.RemoteException, svm.logic.abstraction.exception.IllegalGetInstanceException, svm.persistence.abstraction.exceptions.NoSessionFoundException;

    svm.logic.abstraction.transferobjects.ITransferAuth getMember() throws java.rmi.RemoteException;

    boolean loginWithoutLdap(String s, String s1) throws IllegalGetInstanceException, NoSessionFoundException, RemoteException;
}
