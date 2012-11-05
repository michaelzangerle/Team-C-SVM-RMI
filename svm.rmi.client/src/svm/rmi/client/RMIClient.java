package svm.rmi.client;

import svm.logic.abstraction.transferobjects.ITransferMember;
import svm.rmi.abstraction.controller.IRMILoginController;
import svm.rmi.abstraction.controller.IRMISearchController;
import svm.rmi.abstraction.factory.IRMIControllerFactory;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMIClient {
    public static void main(String[] args) {
        try {
            String policy = PolicyFileLocator.getLocationOfPolicyFile();
            System.setProperty("java.security.policy", policy);
            System.out.println("Policy: " + policy);

            System.setSecurityManager(new RMISecurityManager());

            //Hole Argument (IP)
            String ip = "";
            if (args.length > 0) {
                ip = args[0];
            } else {
                ip = "127.0.0.1";
            }

            //Lookup Objekt    Holle ATM Fabrik
            IRMIControllerFactory factory = (IRMIControllerFactory) Naming.lookup("rmi://" + ip + ":1099/RMI");

            //Starte die Testmethoden
            System.out.println("Path: rmi://" + ip + ":1099/RMI");
            System.out.println("Client runs");
            //IRMIContestController contestController = factory.getRMIContestController();
            IRMILoginController loginController=factory.getRMILoginController();
            loginController.start();
            ITransferMember m=null;
            if(loginController.login("mary.sluis","admin"))
            {
            m=loginController.getMember();
            System.out.println(m.getFirstName());
            loginController.commit();
            }

            IRMISearchController searchController = factory.getRMISearchController(m);
            searchController.start();
            for (ITransferMember obj : searchController.getMembers("Georgi", "")) {
                System.out.println(obj.getFirstName() + " " + obj.getLastName());
            }
            searchController.commit();
                System.out.println("Login funkt");


        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("RMI Client Remote Expetion " + e.getMessage());
        } catch (Exception e) {
            System.out.println("RMI Client errors: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
