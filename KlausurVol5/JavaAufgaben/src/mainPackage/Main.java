package mainPackage;

import Lists.LinkedList;
import Lists.Queue;
import Lists.Stack;
import Lists.Element;
import SchnelleTests.BinTree;
import SchnelleTests.fakult;


public class Main<T> {

	public static void main(String[] args) {

		BinTree baum2 = new BinTree(5);
		baum2.add(0);
		baum2.add(10);

		fakult fak = new fakult();
		System.out.println(fak.fak(5));

		LinkedList oh = new LinkedList<Integer>();
		oh.add(5);
		oh.add(55);	

		System.out.println(printList(oh));
		
		Queue hell = new Queue<Integer>();
		hell.enqueue(5);
		System.out.println(printList(hell));
		hell.enqueue(55);
		System.out.println(printList(hell));

		System.out.println(hell.dequeue());
		System.out.println(hell.dequeue());

		Stack no = new Stack<Integer>();
		no.push(5);
		System.out.println(printList(no));
		no.push(55);
		System.out.println(printList(no));

		System.out.println(no.pop());
		System.out.println(no.pop());

	}

	public static String printList(LinkedList list){
		Element tmp = list.start;
		String msg = "";
		while(tmp != null){
			msg = msg + " | " +  tmp.val;
			tmp = tmp.next;
		}
		return msg;
	}

}