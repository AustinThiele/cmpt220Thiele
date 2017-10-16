/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.Date;

/**
 *
 * @author austinthiele
 */
public class Account {
//Declare variables
private int id = 0;
private double balance = 0;
private double annualInterestRate = 0;
private Date dateCreated = new Date();

//construct no arg
public Account() {
   
}
//make account to store values
public Account(int id, double balance) {
    this.id = id;
    this.balance= balance;
}
//get id 
public int getID() {
    return id;
}
//set ID for account
public void setID(int id) {
    this.id = id;
}
//get balance 
public double getBalance(){
    return balance;
}
//set balance
public void setBalance(double balance) {
this.balance = balance;
	}
//get interest
public double getAnnualInterestRate() {
		return annualInterestRate;
	}
//set interest
public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
//get date created
public Date getDateCreated() {
		return dateCreated;
	}
//get monthly interest using annual interest rate
public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) / 100;
	}
//return monthly interest
public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
//subtract withdrawal amount from the account
public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
	}
//add deposit amount to the account
public void deposit(double depositAmount) {
		balance += depositAmount;
	}

}






    




