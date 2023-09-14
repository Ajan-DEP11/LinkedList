import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
         linkedList.add(20);
          linkedList.add(30);
           linkedList.add(30);
            linkedList.add(40);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.contains(30));
        System.out.println(linkedList.indexOf(30));
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList);
        linkedList.add(2, 23);
        System.out.println(linkedList);
    }
}
