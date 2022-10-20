package LinkedList;

public class QueueWithList implements Queue {
    Element head;

    public QueueWithList(int data){
        head = new Element(data);
    }

    public void enqueue(int data){
        head.add(new Element(data));
    }

    public void dequeue(){
        head.remove();
        
    }

    public int getData(){
        return head.end();
    }

    public String toString(){
        return head.toString();
    }
    
}
