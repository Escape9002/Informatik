package BinaryTree;

public class Test {

	public static void main(String[] args) {
		BuildTree bintree = new BuildTree(100);
		bintree.insert(75);
		bintree.insert(200);
		bintree.insert(60);
		bintree.insert(80);
		bintree.insert(90);
		
		//////////////////////////////////////////////////////
		
		bintree.root.show("root"); // 100
		bintree.root.left.show("left"); // 75
		bintree.root.right.show("right"); // 200
		bintree.root.left.left.show("left left"); // 60
		bintree.root.left.right.show("left right"); // 80
		
		//////////////////////////////////////////////////////
		
		System.out.println("depth: "+ bintree.depth());
		
		//////////////////////////////////////////////////////
		
		System.out.println("nodes: "+ bintree.count());
		
	}

}
