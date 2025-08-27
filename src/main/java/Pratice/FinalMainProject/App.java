package Pratice.FinalMainProject;

import Testdata.DataLoader;
import browsers.AbstractBrowserDriver;
import browsers.ChromeBrowserDriver;
import config.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	BankAccount ba = new BankAccount(500);
    	ba.withdraw(450);
    	System.out.println(ba.getBalance());
    	BankAccount2 ba2 = new BankAccount2();
    	ba2.withdraw(450);
    	System.out.println(ba2.getBalance());
    }
}
