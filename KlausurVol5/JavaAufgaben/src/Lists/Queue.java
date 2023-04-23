package Lists;

public class Queue<T> extends LinkedList<T> {
    LinkedList lel = new LinkedList<>();
    public Queue(){

    }

    public void enqueue(T val){
        lel.add(val);
    }

    public T dequeue(){
        return (T)lel.remove();
    }

}
