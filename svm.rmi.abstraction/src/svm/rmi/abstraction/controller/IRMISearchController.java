package svm.rmi.abstraction.controller;

import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public interface IRMISearchController extends Remote, Serializable, IRMIController {
    java.util.List<svm.logic.abstraction.transferobjects.ITransferMember> getMembers(java.lang.String s, java.lang.String s1, svm.logic.abstraction.transferobjects.ITransferDepartment iTransferDepartment) throws svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferMember> getMembers(java.lang.String s, java.lang.String s1, svm.logic.abstraction.transferobjects.ITransferDepartment iTransferDepartment, Boolean paid) throws svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException, DomainParameterCheckException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferMember> getMembers(java.lang.String s, java.lang.String s1) throws svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferMember> getMembers(java.util.Date date, java.util.Date date1) throws svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferDepartment> getDepartments() throws svm.logic.abstraction.exception.IllegalGetInstanceException, svm.persistence.abstraction.exceptions.NoSessionFoundException, java.rmi.RemoteException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferLocation> getLocations() throws svm.logic.abstraction.exception.IllegalGetInstanceException, svm.persistence.abstraction.exceptions.NoSessionFoundException, java.rmi.RemoteException;

    java.util.List<ITransferContest> getContests() throws IllegalGetInstanceException, NoSessionFoundException,RemoteException;

    java.util.List<ITransferTeam> getTeams() throws IllegalGetInstanceException, NoSessionFoundException,RemoteException;
}
