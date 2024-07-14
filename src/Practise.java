class Account1{
    private  String accno;
    private String name;
    private  String dob;
    private  String address;
    private  String phone;
     double balance=0;

    //constructor
     public Account1(String acc,String name,String dob, String add, String phn)
     {
         accno=acc;
        this.name=name;
        this.dob=dob;
        address=add;
        phone=phn;
        balance=0;

     }


     //getter methods
     public String getAccno(){return accno;}
    public String getName(){return  name;}
    public  String getAddress(){return dob;}
    public String getPhone(){return phone;}
//    public double getBalance(){return balance;}


    //setter methods
    public  void setAddress( String add)
    {
        address=add;

    }

    public  void setBalance( double bal)
    {
        balance=bal;

    }
    public void setPhone(String phn)
    {
        phone=phn;
    }

}

//inheritance

class savingAccount1 extends  Account1
{
    public savingAccount1(String acc, String n, String add, String phone, String dob) {
        super(acc, n, add, phone, dob);
    }
    public void deposit(long amt)
    {
        balance+=amt;
        System.out.println("deposted the money");
    }

    public  void withdraw(long amt)
    {
//        if(balance()==0)
        {
            System.out.println("Your balance is 0 you can't withdraw ");
        }
//        else {
//            System.out.println("how much money you want to withdraw");
//        }
//        balance-=amt;
    }
}

        class loanAccount1 extends  Account1
{
    public loanAccount1(String acc, String n, String add, String phone, String dob) {
        super(acc, n, add, phone, dob);
    }
    public void payEmi(long amt)
    {
        balance-=amt;

    }
//    public class repay(long amt)
//    {
//        if (balance == amt) {
//        balance = 0;
//    } else {
//        System.out.println("Amount does not match the outstanding balance");
//    }
//    }
}



public class Practise
{
    public static  void main(String[] args)
    {


    }

}
