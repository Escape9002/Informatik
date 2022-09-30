package BinaryTree;

public class BuildTree {
	Element root;

	public BuildTree() {
		root = new Element(100);
		root.left = new Element(50);
		root.right = new Element(150);
		root.insert(75);

	}
	/*
public class BuildTree {
	Element root;

	public BuildTree(int val) {
		root = new Element(val);

	}*/
	
	public void nullVar() {
		Element.count = 0;
		Element.depthMax = 0;
		Element.msg = "";
	}

	public int depth() {
		nullVar();
		
		return root.depth(0);
	}

	public int count() {
		nullVar();
		
		return root.count();
	}

	public void insert(int value) {
		root.insert(value);
    }
	public String preOrder() {
		nullVar();
		
		return root.preOrder();
	}
	
	public String inOrder() {
		nullVar();
		
		return root.inOrder();
	}
	
	public String postOrder() {
		nullVar();
		
		return root.postOrder();
	}
}