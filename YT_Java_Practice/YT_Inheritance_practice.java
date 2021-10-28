public class YT_Inheritance_practice {
    public static void main(String[] args) {

        circle c2 =new circle();

        circle c1 =new circle(10);
        System.out.println("\nArea of circle: "+c1.area());

        System.out.println("\nGetter method in circle: " + c1.getRadius());

        System.out.println("\nSetter method in circle: " + c1.setRadius(20));

        System.out.println("\nArea of circle: "+c1.area()); //setting radius from 10 to 20 and then calculating area and volume

        cylinder cd1=new cylinder(10,2);
        System.out.println("\nVolume of Cylinder: "+cd1.volume());
    }
}


class circle{
    int radius;

    circle(){
        System.out.println("Non parameterised constructor");
    }

    circle(int a){
        this.radius=a;
        //System.out.println("Parameterised constructor");
    }

    public int getRadius(){
        return this.radius;
    }

    public int setRadius(int r){
        return this.radius = r;
    }

    double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class cylinder extends circle{
    int height;

    cylinder(int r, int h){
        super(r);
        this.height=h;
        //System.out.println("Inside cylinder constructor");
    }

    double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}


