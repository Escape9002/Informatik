package BinaryTree;

public class BuildTree{
   Element root;

   public BuildTree(int val)
   {
      root = new Element(val);
 
   }

public void  insert(int value) {
	  root.insert(value);
   }
   public int depth() {
	   return root.depth(0);
   }
   
   public int count() {
	   return root.count(0);
   }
}