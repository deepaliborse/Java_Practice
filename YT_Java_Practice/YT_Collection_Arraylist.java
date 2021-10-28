import java.util.*;

public class YT_Collection_Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);

        l2.add(2222);
        l2.add(3333);
        l2.add(4444);

        l1.add(1);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(2,100);
        l1.add(4,200);

        l1.addAll(2,l2);

        System.out.println(l1.indexOf(20));

        //l1.clear();

        //To create shallow copy of l1
        l1.clone();

        //to check whether element is in arraylist
        //System.out.println(l1.contains(1463));

//        for(int i=0; i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
    }
}
