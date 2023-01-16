package sg.edu.nus.iss;

import java.util.Date;

public class BankAccount {
    private final String accountNo;
    //final the value cannot be changed anytime
    //there will not be set method (setter created)
    private String fullname;
    private double balance = 0.0;
    private boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;
    private String uuid;
    private String uuid2;
    private double initialbalance;
    
    public BankAccount(String accountNo, String fullname, double balance, boolean isActive, Date accountStartDate,
            Date accountEndDate) {
        this.accountNo = accountNo;
        this.fullname = fullname;
        this.balance = balance;
        this.isActive = isActive;
        this.accountStartDate = accountStartDate;
        this.accountEndDate = accountEndDate;
    }
    public BankAccount(String uuid, double initialBalance) {
        
        this.accountNo = uuid;
        double balance = initialBalance;
    }
    /**
     * @param uuid
     * @param initialBalance
    ja */
    
    public String getAccountNo() {
        return accountNo;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }
    public void showAccount(){
        System.out.println("Account No:"+accountNo);
        System.out.println("Full Name "+fullname);
        System.out.println("Balance : "+balance);

    }
    @Override
    public String toString() {
        return "BankAccount [accountNo=" + accountNo + ", fullname=" + fullname + ", balance=" + balance + ", isActive="
                + isActive + ", accountStartDate=" + accountStartDate + ", accountEndDate=" + accountEndDate + "]";
    }

    public void deposit(double amount){

        if(!isActive){
            throw new IllegalArgumentException("You cannot deposit to closed acc");
        }
        if(amount <0){
            throw new IllegalArgumentException("You cannot make ng dep");
        }
        if(amount>0){
            balance = balance+amount;
        }

    }
    public void withdraw(double amount)  {

        if(!isActive){
            throw new IllegalArgumentException("You cannot withdraw");
                    }
        if(balance<amount){
            throw new IllegalArgumentException("You bal is less than"+amount);
        }
        if(balance >amount){
            balance = balance-amount;
        }

    }
    
}
