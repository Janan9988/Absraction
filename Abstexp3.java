abstract class Bank {
    abstract int get_Rate_of_Intrest();
    
}
class SBI extends Bank{
  int  get_Rate_of_Intrest(){
return 7;
    }
}
class Axis extends Bank{
    int get_Rate_of_Intrest(){
    return 9;}
}
 public class Abstexp3 {
    public static void main (String[]args){
    Bank b ;
    b = new SBI();
    System.out.println("The Sbi instert is:"+ b.get_Rate_of_Intrest());
    b = new Axis();
     System.out.println("The Axis instert is:"+ b.get_Rate_of_Intrest());
}
}