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

    public String inOrder(){
        Element.msg = "";
        return root.inOrder();
    }

    public String postOrder(){
        Element.msg = "";
        return root.postOrder();
    }

}
