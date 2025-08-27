package Pratice.FinalMainProject;

//👨‍🏫 Class that bundles data and behavior
public class BankAccount2 {
 // Data (fields)
 private double balance = 0;

 
 // Behavior (methods)
 public void deposit(double amount) {
     balance += amount;
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
     } else {
         System.out.println("Insufficient funds");
     }
 }

 public double getBalance() {
     return balance;
 }
}
