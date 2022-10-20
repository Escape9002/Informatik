package BinaryTree;

public class Element {
    Element left, right = null;
    int data;
    static String msg = "";

    public Element(int data) {
        this.data = data;
    }

    public int show(){
        return data;
    }

    public void insert(int value) {
		if (value >= this.data) {
			if (right == null) {

				right = new Element(value);
			} else {
				right.insert(value);
			}

		} else {
			if (left == null) {
				left = new Element(value);
			} else {
				left.insert(value);
			}
		}
	}

    // WLR
    public String preOrder(){
        msg = msg + data + " | ";
        if(left != null){
            left.preOrder();
        }

        if(right != null){
            right.preOrder();
        }

        return msg;
    }

}
