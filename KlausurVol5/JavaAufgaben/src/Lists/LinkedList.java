package Lists;

public class LinkedList<T> {
    public Element start = null;
    public LinkedList(){

    }

    public void add(T val){
        if( start != null){
            start.add(val);
        }else{
            start = new Element<T>(val);
        }
    }

    public T remove(){
        Element iterator = start;
        while(iterator.next.next != null){
            iterator = iterator.next;
        }
        T tmp = (T) iterator.next.val;
        iterator.next = null;
        return tmp;
    }

    public T top(){
        return (T) start.val;
        
    }
}