class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phone;
    private String dob;
    protected long balance;



    //constructor
    public Account(String acc, String n,String add, String phone, String dob)
    {accNo=acc;
        name=n;
        address=add;
        this.phone=phone;
        this.dob=dob;
        balance=0;

    }



    //getter method


    public String  getAccNo()
    {
        return accNo;
    }
    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getDob()
    {
        return dob;
    }

    public long balance(){return balance;}

    public long getBalance() {
        return balance;
    }



    //setter method

    public void setAddress(String add)
    {
    address=add;

    }

    public void setPhone(String phone)
    {
        this.phone=phone;
    }

}


//inheritance
    class savingAccount extends Account
{
    public savingAccount(String acc, String n, String add, String phone, String dob) {
        super(acc, n, add, phone, dob);
    }

    public void deposit(long amt)
    {
        balance+=amt;
    }

    public void withdrawl (long amt)
    {
        if (balance >= amt) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class loanAccount extends  Account
{

    public loanAccount(String acc, String n, String add, String phone, String dob) {
        super(acc, n, add, phone, dob);
    }

    public void payEmi(long amt)
    {
        balance-=amt;
    }

    public void repay(long amt)
    {
        if (balance == amt) {
            balance = 0;
        } else {
            System.out.println("Amount does not match the outstanding balance");
        }
    }
}






public class StudentChallenge122
{
  public static void main(String[] args)
  {
      // Creating instances
      savingAccount savingAcc = new savingAccount("12345", "John Doe", "123 Elm St", "555-1234", "01-01-1990");
      loanAccount loanAcc = new loanAccount("54321", "Jane Doe", "456 Oak St", "555-5678", "02-02-1992");

      // Performing operations on saving account
      savingAcc.deposit(5000);
      System.out.println("Saving Account Balance after deposit: " + savingAcc.getBalance());
      savingAcc.withdrawl(2000);
      System.out.println("Saving Account Balance after withdrawal: " + savingAcc.getBalance());

      // Performing operations on loan account
      loanAcc.payEmi(1000);
      System.out.println("Loan Account Balance after EMI payment: " + loanAcc.getBalance());
      loanAcc.repay(loanAcc.getBalance());
      System.out.println("Loan Account Balance after repayment: " + loanAcc.getBalance());

      // Setting and getting phone and address
      savingAcc.setPhone("620310000");
      savingAcc.setAddress("A678jjkkb0");
      System.out.println("Saving Account Phone: " + savingAcc.getPhone());
      System.out.println("Saving Account Address: " + savingAcc.getAddress());



  }
}
