package svm.rmi.abstraction.controller;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public interface IRMILoginController extends Remote, Serializable, IRMIController {
    boolean login(java.lang.String s, java.lang.String s1) throws java.rmi.RemoteException, svm.logic.abstraction.exception.IllegalGetInstanceException, svm.persistence.abstraction.exceptions.NoSessionFoundException;

    svm.logic.abstraction.transferobjects.ITransferAuth getMember() throws java.rmi.RemoteException;
}
