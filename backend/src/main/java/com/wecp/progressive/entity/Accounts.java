// // // package com.wecp.progressive.entity;

// // // // import javax.persistence.Entity;
// // // // import javax.persistence.GeneratedValue;
// // // // import javax.persistence.GenerationType;
// // // // import javax.persistence.Id;
// // // // import javax.persistence.ManyToOne;

// // // //@Entity
// // // public class Accounts {

// // //     //@Id
// // //     //@GeneratedValue(strategy = GenerationType.IDENTITY)
// // //     private int accountId;
// // //     private int customerId;
// // //     private double balance;

// // //     //@ManyToOne
// // //     //private Customers customers;

// // //     public Accounts(){

// // //     }
    

// // //     public Accounts(int accountId, int customerId, double balance) {
// // //         this.accountId = accountId;
// // //         this.customerId = customerId;
// // //         this.balance = balance;
// // //     }


// // //     public int getAccountId() {
// // //         return accountId;
// // //     }

// // //     public void setAccountId(int accountId) {
// // //         this.accountId = accountId;
// // //     }

// // //     public int getCustomerId() {
// // //         return customerId;
// // //     }

// // //     public void setCustomerId(int customerId) {
// // //         this.customerId = customerId;
// // //     }

// // //     public double getBalance() {
// // //         return balance;
// // //     }

// // //     public void setBalance(double balance) {
// // //         this.balance = balance;
// // //     }
    
    

// // // //     public Accounts(Integer accountId, Integer customerId, Double balance) {
// // // //         this.accountId = accountId;
// // // //         this.customerId = customerId;
// // // //         this.balance = balance;
// // // //     }


// // // //     public Integer getAccountId() {
// // // //         return accountId;
// // // //     }

// // // //     public void setAccountId(Integer accountId) {
// // // //         this.accountId = accountId;
// // // //     }

// // // //     public Integer getCustomerId() {
// // // //         return customerId;
// // // //     }

// // // //     public void setCustomerId(Integer customerId) {
// // // //         this.customerId = customerId;
// // // //     }

// // // //     public Double getBalance() {
// // // //         return balance;
// // // //     }

// // // //     public void setBalance(Double balance) {
// // // //         this.balance = balance;
// // // //     }

// // // //     // public Customers getCustomers() {
// // // //     //     return customers;
// // // //     // }

// // // //     // public void setCustomers(Customers customers) {
// // // //     //     this.customers = customers;
// // // //     // }

    


    

// // //  }
// // package com.wecp.progressive.entity;

// // public class Accounts implements Comparable<Accounts> {

// //     private int accountId;
// //     private int customerId;
// //     private double balance;

// //     public Accounts() {
// //         // constrcutor
// //     }

// //     public Accounts(int accountId, int customerId, double balance) {
// //         this.accountId = accountId;
// //         this.customerId = customerId;
// //         this.balance = balance;
// // //     }

// // //     // Getters and setters
// // //     public int getAccountId() {
// // //         return accountId;
// // //     }

// // //     public void setAccountId(int accountId) {
// // //         this.accountId = accountId;
// // //     }

// // //     public int getCustomerId() {
// // //         return customerId;
// // //     }

// // //     public void setCustomerId(int customerId) {
// // //         this.customerId = customerId;
// // //     }

// // //     public double getBalance() {
// // //         return balance;
// // //     }

// // //     public void setBalance(double balance) {
// // //         this.balance = balance;
// // //     }

// // //     @Override
// // //     public int compareTo(Accounts otherAccounts) {
// // //         // Implement comparison logic based on account balance
// // //         return Double.compare(this.getBalance(), otherAccounts.getBalance());
// // //     }
// // // }

// // package com.wecp.progressive.entity;

// // public class Accounts implements Comparable<Accounts> {

// //     private int accountId;
// //     private int customerId;
// //     private double balance;

// //     public Accounts() {
// //         // constrcutor
// //     }

// //     public Accounts(int accountId, int customerId, double balance) {
// //         this.accountId = accountId;
// //         this.customerId = customerId;
// //         this.balance = balance;
// //     }

// //     // Getters and setters
// //     public int getAccountId() {
// //         return accountId;
// //     }

// //     public void setAccountId(int accountId) {
// //         this.accountId = accountId;
// //     }

// //     public int getCustomerId() {
// //         return customerId;
// //     }

// //     public void setCustomerId(int customerId) {
// //         this.customerId = customerId;
// //     }

// //     public double getBalance() {
// //         return balance;
// //     }

// //     public void setBalance(double balance) {
// //         this.balance = balance;
// //     }

// //     @Override
// //     public int compareTo(Accounts otherAccounts) {
// //         // Implement comparison logic based on account balance
// //         return Double.compare(this.getBalance(), otherAccounts.getBalance());
// //     }
// // }

// package com.wecp.progressive.entity;
 
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
 
// @Entity
// public class Accounts implements Comparable<Accounts> {
 
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int accountId;
//     private int customerId;
//     private double balance;
 
//     public Accounts() {
//         // constrcutor
//     }
 
//     public Accounts(int accountId, int customerId, double balance) {
//         this.accountId = accountId;
//         this.customerId = customerId;
//         this.balance = balance;
//     }
 
//     // Getters and setters
//     public int getAccountId() {
//         return accountId;
//     }
 
//     public void setAccountId(int accountId) {
//         this.accountId = accountId;
//     }
 
//     public int getCustomerId() {
//         return customerId;
//     }
 
//     public void setCustomerId(int customerId) {
//         this.customerId = customerId;
//     }
 
//     public double getBalance() {
//         return balance;
//     }
 
//     public void setBalance(double balance) {
//         this.balance = balance;
//     }
 
//     @Override
//     public int compareTo(Accounts otherAccounts) {
//         // Implement comparison logic based on account balance
//         return Double.compare(this.getBalance(), otherAccounts.getBalance());
//     }
// }

package com.wecp.progressive.entity;

import javax.persistence.*;

@Entity
public class Accounts implements Comparable<Accounts> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;
    @ManyToOne
    @JoinColumn(name = "customerId") // name refers to the column name in the Accounts table
    private Customers customer;

    private double balance;

    public Accounts() {
        // constrcutor
    }


    public Accounts(int accountId, int customerId, double balance) {
        this.accountId = accountId;
        this.customer.setCustomerId(customerId);
        this.balance=balance;
    }

    // Getters and setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Accounts otherAccounts) {
        // Implement comparison logic based on account balance
        return Double.compare(this.getBalance(), otherAccounts.getBalance());
    }
}