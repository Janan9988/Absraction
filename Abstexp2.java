abstract class Shape {
    abstract void  draw();    
}
class Circle1 extends Shape{
    void draw(){
        System.out.println("The Circle look like a round shape");
    }
}
class Sqaure extends Shape{
    void draw(){
        System.out.println("The Sqaure all Side are same ");
    }
}
class Abstexp2{
    public static void main (String[]args){
        Shape c = new Circle1();
        Shape s = new Sqaure();
        c.draw();
        s.draw(); 
    }
}