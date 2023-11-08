interface Vehicle {
    void brake();
    void tyre();
    void move();
}

class Bike implements Vehicle {
    public void brake() {
        System.out.println("Brakes working");
    }

    public void tyre() {
        System.out.println("Tyre working");
    }

    public void move() {
        System.out.println("Bike moving");
    }
}

class Car implements Vehicle {
    public void brake() {
        System.out.println("Brakes working");
    }

    public void tyre() {
        System.out.println("Tyre working");
    }

    public void move() {
        System.out.println("Car moving");
    }
}

class Bicycle implements Vehicle {
    public void brake() {
        System.out.println("Brakes working");
    }

    public void tyre() {
        System.out.println("Tyre working");
    }

    public void move() {
        System.out.println("Bicycle moving");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Bike bi = new Bike();
        Car c = new Car();
        
        b.brake();
        b.tyre();
        b.move();
        
        bi.brake();
        bi.tyre();
        bi.move();
        
        c.brake();
        c.tyre();
        c.move();
    }
}
