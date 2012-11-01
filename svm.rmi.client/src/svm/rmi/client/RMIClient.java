package svm.rmi.client;

import svm.rmi.abstraction.controller.IRMIContestController;
import svm.rmi.abstraction.factory.IRMIControllerFactory;

import java.rmi.Naming;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMIClient {
    public static void main(String[] args) {
        try {

            //Hole Argument (IP)
           // String ip = args[0];
              String ip="10.0.0.2";
            //Lookup Objekt    Holle ATM Fabrik
            IRMIControllerFactory factory = (IRMIControllerFactory) Naming.lookup("rmi://" + ip + ":1099/RMI");

            //Starte die Testmethoden
            System.out.println("Client runs");
           IRMIContestController contestController= factory.getRMIContestController();

        } catch (Exception e) {
            System.out.println("RMI Client errors: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
