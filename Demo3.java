import java.util.LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.offer(10);
        myList.offer(20);
        myList.offer(30);
        myList.offer(40);
        System.out.println(myList);
        myList.poll();
        System.out.println(myList);
    }
}
