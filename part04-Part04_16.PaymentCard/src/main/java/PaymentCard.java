/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salah-Eddine
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        
    }
    
    public String toString(){
        
       System.out.println("The card has a balance of " + this.balance + " euros");
             
    }
    
}
