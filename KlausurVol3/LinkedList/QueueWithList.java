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
       
        Element tmp = head.next;
        head = tmp;
        
    }

    public int getData(){
        return head.end();
    }

    public String toString(){
        return head.toString();
    }
    
}
