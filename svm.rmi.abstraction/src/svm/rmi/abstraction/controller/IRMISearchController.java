package svm.rmi.abstraction.controller;

import svm.logic.abstraction.controller.ISearchController;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 03.11.12
 */
public interface IRMISearchController extends Remote,Serializable,ISearchController {

}
