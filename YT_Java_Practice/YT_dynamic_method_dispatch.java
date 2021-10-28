public class YT_dynamic_method_dispatch {
    public static void main(String args[])
    {
        System.out.println("Obj of phone referring to phone");
        Phone ph1 = new Phone();
        ph1.on();
        ph1.Time();
        System.out.println();


        System.out.println("Obj of Smartphone referring to phone");
        Phone ph2 = new SmartPhone();
        ph2.on();
        ph2.Time();
        //ph2.Music();   ->Not allowed, since object is referring to Phone class and it doesn't have music method.
        System.out.println();

        System.out.println("Obj of smartphone referring to smartphone");
        SmartPhone sp1 = new SmartPhone();
        sp1.on();
        sp1.Music();
        sp1.Time();     // Since sp1 is referring to smartphone, and it contains all methods of phone class.

        System.out.println();
        // SmartPhone sp2 = new Phone();     -> Not allowed
    }
}


class Phone{
    public void Time(){
        System.out.println("It's 1 pm now!");
    }

    public void on(){
        System.out.println("Turning on phone!");
    }
}

class SmartPhone extends Phone{
    public void Music(){
        System.out.println("Playing music!");
    }

    public void on(){
        System.out.println("Turning on SmartPhone!");
    }
}