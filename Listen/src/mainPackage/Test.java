package mainPackage;

public class Test {

	public static void main(String[] args) {
		/*
		 * Liste liste = new Liste(3); liste.add(5); liste.add(43); liste.add(9);
		 * liste.add(12); liste.add(13); liste.add(7);
		 * 
		 * System.out.println(liste);
		 * 
		 * liste.addHead(42);
		 * 
		 * System.out.println(liste);
		 * 
		 * 
		 * System.out.println(liste.counter());
		 * 
		 * liste.firstLast();
		 * 
		 * System.out.println("\n"+liste.find(4));
		 * 
		 * liste.remove(7); System.out.println(liste);
		 */
		//////////////////////////////////
		/*
		System.out.println(
				"Following Stack! --------------------------------------------------------------------------------");
		Stack stacky = new Stack(55);
		for (int i = 0; i < 50; i++) {
			stacky.push(i);
			System.out.println(stacky.toString());
		}
		
		System.out.println(stacky.toString());
		for (int i = 0; i < 30; i++) {
			stacky.pop();
			System.out.println(stacky.toString());
		}
		System.out.println(stacky.toString());

		///////////////////////////////////
		System.out.println(
				"Following queue! --------------------------------------------------------------------------------");
		Queue queue = new Queue(5);
		System.out.println(queue.toString());
		for (int i = 0; i < 20; i++) {
			queue.enqueue(i);
			System.out.println(queue.toString());
		}

		System.out.println(queue.toString());

		for (int i = 0; i < 20; i++) {
			queue.dequeue();
			System.out.println(queue.toString());
		}

		System.out.println(queue.toString());
*/
		///////////////////////////////////
		System.out.println("Following ArrayStack! --------------------------------------------------------------------------------");
		ArrayStack arStack = new ArrayStack();
		System.out.println(arStack.empty());
		for(int i=0; i<50; i++) {
			arStack.push(i);
			System.out.println(arStack.top());
		}
		System.out.println("FINISHED....................................................");
		/*
		for(int i=0; i<50; i++) {
			arStack.pop();
			System.out.println(arStack.top());
		}
		*/
		/*
		ArrayStack copL = new ArrayStack();
		copL.copyL(arStack,true);
		*/
		/*
		System.out.println("---------------------------------------------------------------------------");
		
		ArrayStack copH = new ArrayStack();
		copH.copyH(arStack, true);
		 
		System.out.println("---------------------------------------------------------------------------");
		*/
		ArrayStack appendL = new ArrayStack();
		appendL.push(5555);
		
		appendL.append(arStack);
		
		for(int i=0; i<50; i++) {
			appendL.pop();
			System.out.println(appendL.top());
		}
	}

}