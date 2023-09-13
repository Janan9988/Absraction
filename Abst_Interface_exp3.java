interface Instagram {
    void reels();
    void post();
}
interface Thread{
    void post();
    void reels();
}
class Kevin_Systrom implements Instagram,Thread {
    public void reels(){
        System.out.println("We can post all the vedio and content in reels ");
    }

public void post (){
    System.out.println("We can only post the photo are content not a vedio ");
}
}
class Rousseau implements Instagram,Thread{
    public void reels (){
        System.out.println("The reels are not possible in thread");
    }
    public void post(){
        System.out.println("We can post daily activities on the thread ");
    }
}
public class Abst_Interface_exp3 {
    public static void main(String[]args ){
        Instagram i  = new Kevin_Systrom();
        Thread t = new  Rousseau() ;
          i.reels();
          i.post();
        t.reels();
          t.post();
           
        
    }
}