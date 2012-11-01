package svm.rmi.abstraction.controller;

import svm.logic.abstraction.controller.ISubTeamController;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public interface IRMISubTeamController extends Remote,Serializable, ISubTeamController {
}
