import java.util.LinkedList;

public class Demo4 {
    public static void main(String[] args) {
        LinkedList<Integer> myStack = new LinkedList<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        System.out.println(myStack);
        myStack.pop();
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.peek());
    }
}
