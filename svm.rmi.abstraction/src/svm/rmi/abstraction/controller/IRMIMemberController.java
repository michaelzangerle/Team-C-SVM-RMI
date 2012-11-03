package svm.rmi.abstraction.controller;

import svm.logic.abstraction.controller.IMemberController;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public interface IRMIMemberController extends Remote,Serializable,IMemberController {
}
