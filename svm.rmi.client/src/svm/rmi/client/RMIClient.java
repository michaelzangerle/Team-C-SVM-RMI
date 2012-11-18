package svm.rmi.client;

import svm.logic.abstraction.transferobjects.ITransferAuth;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.rmi.abstraction.controller.IRMIContestController;
import svm.rmi.abstraction.controller.IRMILoginController;
import svm.rmi.abstraction.controller.IRMISearchController;
import svm.rmi.abstraction.factory.IRMIControllerFactory;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.naming.*;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMIClient {
    public static void main(String[] args) {
        try {

            //Hole Argument (IP)
            String ip = "";
            if (args.length > 0) {
                ip = args[0];
            } else {
                ip = InetAddress.getLocalHost().getHostAddress();
            }

            Hashtable env = new Hashtable();
            env.put("java.naming.factory.initial",
                    "com.sun.jndi.cosnaming.CNCtxFactory");
            env.put("java.naming.provider.url", "iiop://<hostname>:900");
            Context ic = new InitialContext(env);

            //Lookup Objekt    Holle ATM Fabrik
            //IRMIControllerFactory factory = (IRMIControllerFactory) Naming.lookup("rmi://" + ip + ":1099/RMI");
            IRMIControllerFactory factory = (IRMIControllerFactory) PortableRemoteObject.narrow(ic.lookup("Path: rmi://" + ip + ":1099/RMI"), IRMIControllerFactory.class);

            //Starte die Testmethoden
            System.out.println("Path: rmi://" + ip + ":1099/RMI");
            System.out.println("Client runs");
            //IRMIContestController contestController = factory.getRMIContestController();

            IRMILoginController lc = factory.getRMILoginController();
            lc.start();
            lc.loginWithoutLdap("tf-test", "Pak3bGEh");
            ITransferAuth user = lc.getMember();
            lc.abort();


            /* IRMISearchController searchController = factory.getRMISearchController(m);
                        searchController.start();
                        for (ITransferMember obj : searchController.getMembers("Georgi", "")) {
                            System.out.println(obj.getFirstName() + " " + obj.getLastName());
                        }
                        searchController.commit();
                            System.out.println("Login funkt");
            */

            // 1. contest ausgewählt via searchcontroller
            // 2. contestconoller init und start

            IRMISearchController searchController = factory.getRMISearchController(user);
            searchController.start();

            List<ITransferContest> contests = searchController.getContests();

            for (ITransferContest c : contests) {
                System.out.println(c.getName());
            }

            IRMIContestController contestController = factory.getRMIContestController(contests.get(0), user);
            contestController.start();
            System.out.println(contestController.getTransferContest().getSport());
            for (ITransferTeam team : contestController.getPossibleTeams()) {
                System.out.println(team);
            }


        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("RMI Client Remote Expetion " + e.getMessage());
        } catch (Exception e) {
            System.out.println("RMI Client errors: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
