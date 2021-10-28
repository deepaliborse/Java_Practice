interface bicycle{
    int i = 10;  //Creating properties in interface is allowed

    void upHillSpeed(int speed);
    void downHillSpeed(int speed);
}

interface cars{
    void luxuryCar();
    void sportCar();
}

//While implementing methods in interfaces, we have to make them public otherwise it will throw error

class rangerCycle implements bicycle, cars{
    public void upHillSpeed(int speed){
        System.out.println("\nRiding up hill!");
    }

    public void downHillSpeed(int speed){
        System.out.println("\nRiding Down hill!");
    }

    public void luxuryCar(){
        System.out.println("\nLuxury car!");
    }

    public void sportCar(){
        System.out.println("\nSports car!");
    }
}


public class YT_Interface {
    public static void main(String[] args) {

        rangerCycle r = new rangerCycle();
        System.out.println(r.i);  // Allowed
        // r.1 = 120  --> We can't modify properties of interface as they are final

        r.upHillSpeed(10);
        r.downHillSpeed(10);
        r.luxuryCar();
        r.sportCar();
    }
}
