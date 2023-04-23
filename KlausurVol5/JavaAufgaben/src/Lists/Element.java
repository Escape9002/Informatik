package Lists;

public class Element<T> {
    public Element<T> next = null;
    public T val;
    public Element(T val){
        this.val = val;
    }

    void add(T val){
        if(next == null){
            next = new Element<T>(val);
        }else{
            next.add(val);
        }
    }
}
