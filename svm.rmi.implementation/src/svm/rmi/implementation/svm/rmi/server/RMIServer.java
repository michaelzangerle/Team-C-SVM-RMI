package svm.rmi.implementation.svm.rmi.server;

import svm.rmi.abstraction.factory.IRMIControllerFactory;
import svm.rmi.implementation.rmiControllerFactory.RMIControllerFactory;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMIServer {
    public static void main(String[] args) {
        try {

            //Setzen der Codebase     und der Policy
            System.setProperty("java.rmi.server.codebase", RMIServer.class
                    .getProtectionDomain().getCodeSource().getLocation().toString());

            //Hole Argument (IP)
            String ip = args[0];

            //Erzeugen eines SayHello Objektes
            IRMIControllerFactory factory= RMIControllerFactory.getInstance();


            //Binden des Objekts
            Naming.rebind("rmi://" + ip + ":1099/RMI", factory);
            System.out.println("RMIFactory bound in registry");
            System.out.println("Server ist running");

        } catch (RemoteException e) {
            System.out.println("RMI Server error: " + e.getMessage());
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("RMI Server error: " + e.getMessage());
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
