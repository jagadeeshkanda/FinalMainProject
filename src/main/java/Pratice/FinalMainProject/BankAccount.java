package Pratice.FinalMainProject;

//👨‍🏫 Class that bundles data and behavior
public class BankAccount {
 // Data (fields)
 private double balance;

 // Constructor
 public BankAccount(double initialBalance) {
     balance = initialBalance;
 }

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
