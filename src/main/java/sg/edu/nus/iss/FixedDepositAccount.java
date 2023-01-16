package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {

    public static double interest = 3.0;
    public static double duration = 6.0;


    public FixedDepositAccount(String uuid, double initialBalance) {
        super(uuid, initialBalance);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void deposit(double amount){
        System.out.println("No Operation");
    }
    @Override
    public void withdraw(double amount){
        System.out.println("No Operation");
    }

    @Override
    public void showAccount(){
        System.out.println("Account No"+this.getAccountNo());
        System.out.println("Fullname "+this.getFullname());
        System.out.println("Balance"+this.getBalance()*(100+interest)/100);
    }
    
    }
    

