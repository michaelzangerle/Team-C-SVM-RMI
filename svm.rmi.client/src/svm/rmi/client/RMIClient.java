package svm.rmi.client;

import svm.logic.abstraction.jmsobjects.IMemberMessage;
import svm.logic.abstraction.jmsobjects.IMessageObserver;
import svm.logic.abstraction.jmsobjects.ISubTeamMessage;
import svm.logic.abstraction.transferobjects.ITransferAuth;
import svm.rmi.abstraction.controller.IRMILoginController;
import svm.rmi.abstraction.controller.IRMIMessageController;
import svm.rmi.abstraction.factory.IRMIControllerFactory;

import java.net.InetAddress;
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
                ip = InetAddress.getLocalHost().getHostAddress();
            }

            //Lookup Objekt    Holle ATM Fabrik
            IRMIControllerFactory factory = (IRMIControllerFactory) Naming.lookup("rmi://" + ip + ":1099/RMI");

            //Starte die Testmethoden
            System.out.println("Path: rmi://" + ip + ":1099/RMI");
            System.out.println("Client runs");
            //IRMIContestController contestController = factory.getRMIContestController();

            IRMILoginController lc = factory.getRMILoginController();
            lc.start();
            lc.loginWithoutLdap("tf-test", "Pak3bGEh");
            ITransferAuth user = lc.getMember();
            lc.abort();

            IRMIMessageController messageController = factory.getMessageController(user);
            messageController.addObserver(new IMessageObserver() {
                @Override
                public void updateMemberMessage(IMemberMessage iMemberMessage) {
                    System.out.println("NEW MemberMessage: " + iMemberMessage);
                }

                @Override
                public void updateSubTeamMessage(ISubTeamMessage iSubTeamMessage) {
                    System.out.println("NEW SubTeamMessage: " + iSubTeamMessage);
                }
            });
            messageController.start();
        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("RMI Client Remote Expetion " + e.getMessage());
        } catch (Exception e) {
            System.out.println("RMI Client errors: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
