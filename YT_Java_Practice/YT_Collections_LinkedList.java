import java.util.ArrayList;
import java.util.LinkedList;

public class YT_Collections_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();

        l2.add(2222);
        l2.add(3333);
        l2.add(4444);

       l1.addLast(00);
       l1.addLast(99);

        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(2,100);
        l1.add(4,200);

        l1.addAll(2,l2);

        System.out.println("Index of 20: "+l1.indexOf(20));

        //l1.clear();

        //To create shallow copy of l1
        l1.clone();

        //to check whether element is in arraylist
        System.out.println("Is 1463 in linkedlist? "+ l1.contains(1463));

        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i)+", ");
        }
    }
}
