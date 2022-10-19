public class CheckingAccount extends Account{
    private double overDraftLimit;
    public CheckingAccount (){
        super();
    }
    public CheckingAccount(int id, double initialBalance){
        super(id, initialBalance);
    }
    public void setOverDraftLimit(double overDraftLimit){
        this.overDraftLimit=overDraftLimit;
    }
    public void withdraw(double withdrawAmount){
        if(getBalance()>=withdrawAmount){
            setBalance(getBalance()-withdrawAmount);
        }
        else if(overDraftLimit+getBalance()>=withdrawAmount){
            setBalance(0);
            overDraftLimit+=getBalance();
            overDraftLimit-=withdrawAmount;
        }
        else{
            System.out.println("there is no amount in either your balance and over draft limit");
            System.out.println("your remaining balance is "+getBalance());
            System.out.println("over draft limit remaining is "+overDraftLimit);
        }
    }
    public String toString(){
        return super.toString()+"over draft limit is "+overDraftLimit+"\n";
    }
}