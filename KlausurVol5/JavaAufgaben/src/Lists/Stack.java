package Lists;

public class Stack<T> extends LinkedList<T>{
    LinkedList lel = new LinkedList<>();
    public Stack(){

    }

    public void push(T val){
        lel.add(val);
    }

    public T pop(){
        T tmp = (T)lel.top();
        lel.start = lel.start.next;
        return (T)tmp;
    }
}