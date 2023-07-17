
package bittu;

public class Banking {
    private String number;
    private double balance;
    private String name;

    private String phonenumber;

    public Banking(String number , double balance , String name, String phonenumber){
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.phonenumber = phonenumber;

    }
    public void accountnumber(String accountnumbers){
        this.number= accountnumbers;
        System.out.println("your account number is:" + " "+ this.number);
    }
    public void accountholdername(String accountholdersname){
       this.name = accountholdersname;
        System.out.println("Account holder name is: " + " "+ this.name);

    }

    public  void accoumthoderphonenumbers(String accountholdermobilenumber){
        this.phonenumber = accountholdermobilenumber;
        System.out.println("Account holder phone number is :" + " "+ this.phonenumber);
    }

    public void depositemoney(double depositedmoney){
        this.balance += depositedmoney;
        System.out.println("Deposit is successfull , new balance is " + " "+ this.balance);
    }
    public void withdraw(double withdrawmoney){
        if(this.balance-withdrawmoney<0){
            System.out.println("Withdraw is unsuccessfull - only this amount" + " " + this.balance + " " + "is left");

        }else{
            this.balance -= withdrawmoney;
            System.out.println("Withdrawl is successfull - your current balance is " + " " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
