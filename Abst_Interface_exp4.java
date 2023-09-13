interface Bike  {
    void adv();
    
}
interface Model extends Bike {
    void rc();
}
class Ktm implements Model {
  public   void adv(){
        System.out.println("The are two type of model in adv only 250,390");
    }
    public void rc(){
        System.out.println("The are three type of Rc Model 125,200,390");
    }
}
public class Abst_Interface_exp4{
    public static void main (String []args){
        Ktm k = new Ktm();
        k.rc();
        k.adv();
    }
}

