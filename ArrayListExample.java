import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add / adds to the end of the list
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // add at a index 
        list.add(0,40);

        //get 
        System.out.println(list.get(2));

        //set 
        list.set(3, 50);
        System.out.println(list.get(3));

        // Remove
        list.remove(2);
        System.out.println(list);

        // Size 
        System.out.println(list.size());
    }
}
