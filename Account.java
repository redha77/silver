import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualIntrestRate;
    private Date dateCreated;

    Account() {
        dateCreated=new Date();
    }
    Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
        dateCreated = new Date();
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setAnnualIntrestRate(double annualIntrestRate) {
        this.annualIntrestRate = annualIntrestRate;
    }
    public double getAnnualIntrestRate() {
        return annualIntrestRate;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMonthlyInterestRate(){
        return annualIntrestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double withdrawAmount){
        if(this.balance>=withdrawAmount){
            this.balance-=withdrawAmount;
        }
        else{
            System.out.println("there is no amount in your balance ");
            System.out.println("your remaining balance is "+ getBalance());
        }
        
        //return this.getBalance();
    }
    public void deposit(double depositAmount){
        this.balance=+depositAmount;
        //return this.getBalance();
    }
    public String toString(){
        return "Id "+id+"\n"+"Balance is "+balance+"\n"+"Annual Interest Rate is "+annualIntrestRate+"\n"+"Created Date is "+dateCreated+"\n";
    }
}