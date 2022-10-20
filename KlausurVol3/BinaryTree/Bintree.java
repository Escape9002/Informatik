package BinaryTree;

public class Bintree {
    int data;
    Element root;

    public Bintree(int data){
        root = new Element(data);
    }

    public void insert(int data){
        root.insert(data);
    }

    public String preOrder(){
        Element.msg = "";
        return root.preOrder();
    }

}
