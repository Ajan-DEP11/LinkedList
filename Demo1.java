public class Demo1 {
    public static void main(String[] args) {
        
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
     
        return 0;
    }
    
  

}