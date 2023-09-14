public class Demo1 {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.size());
        System.out.println(list);
        list.clear();
        System.out.println(list.size());
        System.out.println(list);
        
    }
}

interface MyList{
    void add(int value);
    void add(int index, int value) throws ArrayIndexOutOfBoundsException;
    int remove(int index) throws ArrayIndexOutOfBoundsException;
    void clear();
    int size();
    int set(int index, int value) throws ArrayIndexOutOfBoundsException;
    boolean contains(int value);
    int indexOf(int value);
    int lastIndexOf(int value);
    

}

class MyLinkedList implements MyList{

    private int size;
    private MyNode head;
    private MyNode tail;

      public MyLinkedList(){

    }

    public MyLinkedList(int... value){

    }

   public static MyLinkedList of(int...value){
    return null;

    }
   

    @Override
public String toString() {
   
    return super.toString();
}

    @Override
    public void add(int value) {
        
        
    }

    @Override
    public void add(int index, int value) throws ArrayIndexOutOfBoundsException {
       
        
    }

    @Override
    public void clear() {
        size =0;
        head = null;
        tail = null;
      
        
    }

    @Override
    public boolean contains(int value) {
      
        return false;
    }

    @Override
    public int indexOf(int value) {
        
        return 0;
    }

    @Override
    public int lastIndexOf(int value) {
        
        return 0;
    }

    @Override
    public int remove(int index) throws ArrayIndexOutOfBoundsException {
        
        return 0;
    }

    @Override
    public int set(int index, int value) throws ArrayIndexOutOfBoundsException {
        
        return 0;
    }

    @Override
    public int size() {
        return this.size;

    }
    
  

}

class MyNode{
    MyNode previous;
    MyNode next;
    int value;

    public MyNode(int value,MyNode previous){
        this.value = value;
        this.previous = previous;
    }

    public MyNode(int value,MyNode previous,MyNode next){
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}