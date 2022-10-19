public class TestProblem1{
    public static void main(String[] args) {
        Account account=new Account(2020,15000);
        account.setAnnualIntrestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.toString());
        
        Account savingAccount=new SavingsAccount(2019,7500.0);
        savingAccount.setAnnualIntrestRate(3.5);
        savingAccount.withdraw(2500);
        savingAccount.deposit(3000);
        System.out.println(savingAccount.toString());

        CheckingAccount checkingAccount=new CheckingAccount(2021,22000.0);
        checkingAccount.setAnnualIntrestRate(3.5);
        checkingAccount.setOverDraftLimit(80000);
        checkingAccount.withdraw(2000);
        checkingAccount.deposit(3000);
        System.out.println(checkingAccount.toString());

    }
}