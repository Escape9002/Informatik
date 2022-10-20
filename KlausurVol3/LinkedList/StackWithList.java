package LinkedList;

public class StackWithList implements Stack {
    Element head;
    int data;

    public StackWithList(int data){
        this.data = data;
        head = new Element(data);
    }
    
    public void push(int data) {
        head.add(new Element(data));
        
    }

    public Element pop() {
        Element data = head;
        head.remove();
        return data;
    }

    public String toString(){
        return head.toString();
    }
    
}
