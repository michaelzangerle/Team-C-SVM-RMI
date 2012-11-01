package svm.rmi.abstraction.controller;

import svm.logic.abstraction.controller.IContestConfirmationController;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IRMIContestConfirmationController  extends Remote,Serializable, IContestConfirmationController {

}
