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
        System.out.println(list.remove(3));
        System.out.println(list);
        
    }
}

interface MyList{
    void add(int value);
    void add(int index, int value) throws ArrayIndexOutOfBoundsException;
    int remove(int index) throws ArrayIndexOutOfBoundsException;
    void clear();
    int size();
    int get(int index)throws ArrayIndexOutOfBoundsException;
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
   
    String str = "[";
    MyNode temp = head;
    while(temp != null){
        str += temp.value + (temp.next != null ? ",":"");
        temp = temp.next;
    }
    str +="]";
    return str;
}

    @Override
    public void add(int value) {
        if(size==0){
            head =new MyNode(value, null);
            tail =head;
        }else{
           tail.next= new MyNode( value,tail);
           tail = tail.next;
        }
        
        size++;
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
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException("Invalid index" + index);
            int value1;
            if(index==0){
                value1 = head.value;
                head = head.next;
                head.previous = null;
            }else if(index ==(size-1)){
                 value1 = tail.value;

                tail =tail.previous;
                tail.next = null;
            }else{
                MyNode temp = head;
            
                for(int i = 0;i<index -1;i++){
                    temp = temp.next;
                }
                value1 = temp.next.value;
                
                temp.next.next.previous = temp;
                temp.next = temp.next.next;
            }
            size--;
            
            return value1;
        }
            
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