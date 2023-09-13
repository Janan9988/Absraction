abstract class A{
    abstract void bike();
}
class Abstexp1 extends A{
    void bike(){
        System.out.println("The bike is running in speed of 60 km");
    }
    public static void main (String[]args){
    Abstexp1 b= new Abstexp1();
    b.bike();
}
}