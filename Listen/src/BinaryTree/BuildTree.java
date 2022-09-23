package BinaryTree;

public class BuildTree{
   Element root;

   public BuildTree()
   {
      root = new Element(100);
      root.left = new Element(50);
      root.right = new Element(150);  
      root.insert(75);
      
   }
   
   public void  insert(int value) {
	  root.insert(value);
   }
}