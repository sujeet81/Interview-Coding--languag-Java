package CodingProblem.InterviewTimeCoding;


class Amount{
    private double balance;

    public double getBalance(){
        return balance;

    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }

    }
    public void withrdraw(double amount){
        if(amount>0 && amount < balance){
            balance -= amount;
        }
    }


}
public class UseAndDesignEncapsulations {
    public static void main(String[] args) {
        Amount amount = new Amount();
        amount.deposit(1000000);
        amount.withrdraw(500000);

        System.out.println("Your Balance Is Remaining  = " + amount.getBalance());
//        System.out.println("Your withdrwal your amount is ="  );
    }
}
