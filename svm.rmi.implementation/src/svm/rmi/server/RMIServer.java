package svm.rmi.server;

import svm.rmi.abstraction.factory.IRMIControllerFactory;
import svm.rmi.implementation.rmiControllerFactory.RMIControllerFactory;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Projectteam : Team C
 * Date: 01.11.12
 */
public class RMIServer {
    public static void main(String[] args) {
        try {

            //Hole Argument (IP)
            String ip = "";
            if (args.length > 0) {
                ip = args[0];
            } else {
                ip = InetAddress.getLocalHost().getHostAddress();
            }

            //LocateRegistry.createRegistry(1099);
            // LOCAL String codebase = RMIServer.class.getProtectionDomain().getCodeSource().getLocation().toString();
            String codebase = "http://" + ip + "/svm/Team-C-SVM-RMI-Server.jar";
            System.setProperty("java.rmi.server.codebase", codebase);
            System.out.println("CodeBase: " + codebase);
            String policy = PolicyFileLocator.getLocationOfPolicyFile();
            System.setProperty("java.security.policy", policy);
            System.out.println("Policy: " + policy);

            System.setSecurityManager(new SecurityManager());

            //Erzeugen eines SayHello Objektes
            IRMIControllerFactory factory = RMIControllerFactory.getInstance();


            //Binden des Objekts
            Naming.rebind("rmi://" + ip + ":1099/RMI", factory);
            System.out.println("Path: rmi://" + ip + ":1099/RMI");
            System.out.println("RMIFactory bound in registry");
            System.out.println("Server ist running");

        } catch (RemoteException e) {
            System.out.println("RMI Server error: " + e.getMessage());
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("RMI Server error: " + e.getMessage());
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnknownHostException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
