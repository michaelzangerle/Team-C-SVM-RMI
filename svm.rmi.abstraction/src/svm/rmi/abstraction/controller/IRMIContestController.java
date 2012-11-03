package svm.rmi.abstraction.controller;

import svm.logic.abstraction.controller.IContestController;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IRMIContestController extends Remote,Serializable,IContestController {

}
