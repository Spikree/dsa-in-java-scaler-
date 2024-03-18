import java.util.ArrayList;

public class RemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // adding 

        list.add(5);
        list.add(10);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(21);
        list.add(3);
        list.add(2);

        System.out.println(list);

        RemoveItem(list);
        System.out.println(list);
    }
    public static void RemoveItem(ArrayList<Integer>list) {
        for(int i = list.size() - 1 ; i >= 0; i -- ) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
