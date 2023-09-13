 interface Besant {
    void course();    
}
class Besant1 implements Besant {
   public void  course (){
        System.out.println("The Besant Technology provide all the IT & Salesfource course");

    }
}
public  class Abst_Interface_exp1{
    public static void main(String[]args){
        Besant1 b ;
        b =new Besant1();
        b.course();
    }
}