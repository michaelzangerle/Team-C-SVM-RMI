package svm.rmi.client;

import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.rmi.abstraction.controller.IRMISearchController;
import svm.rmi.abstraction.factory.IRMIControllerFactory;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMIClient {
    public static void main(String[] args) {
        try {

            //Hole Argument (IP)
            // String ip = args[0];
            String ip = "127.0.0.1";
            //  ip="172.16.63.174";
            //Lookup Objekt    Holle ATM Fabrik
            IRMIControllerFactory factory = (IRMIControllerFactory) Naming.lookup("rmi://" + ip + ":1099/RMI");

            //Starte die Testmethoden
            System.out.println("Path: rmi://" + ip + ":1099/RMI");
            System.out.println("Client runs");
            //IRMIContestController contestController = factory.getRMIContestController();
            IRMISearchController searchController = factory.getRMISearchController();

            searchController.start();
            for (ITransferMember obj : searchController.getMembers("Georgi", "")) {
                System.out.println(obj.getFirstName() + " " + obj.getLastName());
            }
            searchController.commit();
        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("RMI Client Remote Expetion " + e.getMessage());
        } catch (Exception e) {
            System.out.println("RMI Client errors: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
