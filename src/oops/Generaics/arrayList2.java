import java.util.ArrayList;

public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);

        l1.addAll(0,l2);
        System.out.println(l1);
    }
}
