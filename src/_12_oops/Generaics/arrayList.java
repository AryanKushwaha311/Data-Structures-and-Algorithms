import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        System.out.println(list.get(0));
        list.set(1,50);
        list.remove(0);
        list.remove(0);

        System.out.println(list.size());

        System.out.println(list.isEmpty());
        System.out.println(list.contains(5));

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
