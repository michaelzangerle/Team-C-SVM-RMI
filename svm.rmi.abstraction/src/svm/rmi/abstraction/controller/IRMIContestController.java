package svm.rmi.abstraction.controller;

import svm.logic.abstraction.transferobjects.ITransferContest;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IRMIContestController extends Remote,Serializable {
    public void setContestName(String s) throws RemoteException;
    public void setContestStartDate(Date date) throws RemoteException;
    public void setContestEndDate(Date date) throws RemoteException;
    public void setContestFee(float v) throws RemoteException;
    public ITransferContest getTransferContest();
    public void start() throws RemoteException;
    public void commit() throws RemoteException;
    public void abort() throws RemoteException;
}
