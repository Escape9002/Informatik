package LinkedList;

public interface ElementInterface {
    Element next = null;
    int data = 999;
    public int end();
    public int getData();
    public Element getNext();
    public void add(Element e);
    public boolean remove();
    public String toString();
}
