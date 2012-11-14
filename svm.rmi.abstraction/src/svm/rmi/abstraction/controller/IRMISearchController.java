package svm.rmi.abstraction.controller;

import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.NotAllowException;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferSport;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.logic.abstraction.transferobjects.ITransferUserPrivilege;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public interface IRMISearchController extends Remote, Serializable, IRMIController {
    java.util.List<svm.logic.abstraction.transferobjects.ITransferMember> getMembers(java.lang.String firstname, java.lang.String lastname, svm.logic.abstraction.transferobjects.ITransferDepartment iTransferDepartment) throws svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException, NotAllowException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferMember> getMembers(java.lang.String firstname, java.lang.String lastname, svm.logic.abstraction.transferobjects.ITransferDepartment iTransferDepartment, Boolean paid) throws svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException, DomainParameterCheckException, NotAllowException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferMember> getMembers(java.lang.String firstname, java.lang.String lastname) throws svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException, NotAllowException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferMember> getMembers(java.util.Date date, java.util.Date date1) throws svm.persistence.abstraction.exceptions.NoSessionFoundException, svm.logic.abstraction.exception.IllegalGetInstanceException, java.rmi.RemoteException, NotAllowException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferDepartment> getDepartments() throws svm.logic.abstraction.exception.IllegalGetInstanceException, svm.persistence.abstraction.exceptions.NoSessionFoundException, java.rmi.RemoteException, NotAllowException;

    java.util.List<svm.logic.abstraction.transferobjects.ITransferLocation> getLocations() throws svm.logic.abstraction.exception.IllegalGetInstanceException, svm.persistence.abstraction.exceptions.NoSessionFoundException, java.rmi.RemoteException, NotAllowException;

    java.util.List<ITransferContest> getContests() throws IllegalGetInstanceException, NoSessionFoundException, RemoteException, NotAllowException;

    java.util.List<ITransferTeam> getTeams() throws IllegalGetInstanceException, NoSessionFoundException, RemoteException, NotAllowException;

    List<ITransferUserPrivilege> getUserPrivileges() throws NotAllowException, IllegalGetInstanceException, NoSessionFoundException,RemoteException;

    List<ITransferSport> getSports() throws IllegalGetInstanceException, NoSessionFoundException, NotAllowException;
}
