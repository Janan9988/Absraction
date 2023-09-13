abstract class Bike {
    abstract void Km();

    Bike() {
        System.out.println("The Bike was created ");
    }

    void gearShift() {
        System.out.println("We can able to shift the gear Total 6 gears are available ");
    }

    void gear() {
        System.out.println("The bike is moving in the 6th gear ");
    }
}

class Rc extends Bike {
    void Km() {
        System.out.println("The bike is moving at a speed of 148 Km/h ");
    }
}

public class Abstexp4 {
    public static void main(String[] args) {
        Rc b = new Rc();
        b.Km();
        b.gearShift();
        b.gear();
    }
}
