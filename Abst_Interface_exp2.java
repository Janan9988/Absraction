interface  Dwarable {
    void draw();
   
    
}
class vaseem implements Dwarable {
    public void draw(){
System.out.println("The vaseem draw 1 st picture of Ronaldo ");
    }
}
class Vs_edit implements Dwarable{
    public  void draw(){
        System.out.println("vaseem draw  the Rj Vignesh");
    }
}
public class Abst_Interface_exp2 {
    public static void main (String[]args){
    Dwarable d;
    d = new Vs_edit();
    d.draw();
    
   d = new vaseem();
   d.draw();
}

}



















//Abst_Interface_exp2