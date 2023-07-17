package bittu;

public class account {
    public static void main(String[] args){
        Banking bittusaccount = new Banking("115657345" , 0.0 ,"Bittu Singh" ,   "9728711365");
        bittusaccount.accountnumber(bittusaccount.getNumber());
        bittusaccount.accountholdername(bittusaccount.getName());
        bittusaccount.accoumthoderphonenumbers(bittusaccount.getPhonenumber());
        bittusaccount.depositemoney(500);
        bittusaccount.depositemoney(400);
        bittusaccount.depositemoney(500);
        bittusaccount.withdraw(600);
        bittusaccount.withdraw(500);

    }
}
