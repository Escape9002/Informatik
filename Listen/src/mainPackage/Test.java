package mainPackage;

public class Test {

	public static void main(String[] args){
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
		 *
		 *	System.out.println("---------------------------------------------------------------------------");
		 */
		
		/*
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

		
		System.out.println("---------------------------------------------------------------------------");
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
		/*
		System.out.println("---------------------------------------------------------------------------");
		ArrayStack arStack = new ArrayStack();
		System.out.println(arStack.empty());
		for(int i=0; i<50; i++) {
			arStack.push(i);
			System.out.println(arStack.top());
		}
		System.out.println("FINISHED Creating and filling ArrayStacks!");
		*/
		
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
		/*
		ArrayStack appendL = new ArrayStack();
		appendL.push(5555);
		
		appendL.append(arStack);
		
		for(int i=0; i<50; i++) {
			appendL.pop();
			System.out.println(appendL.top());
		}
		
		System.out.println("---------------------------------------------------------------------------");
		*/
		
		ArrayQueue queue = new ArrayQueue();
		ArrayQueue muhahahaha = new ArrayQueue();
		
		for(int i = 0; i<=25; i++) {
			queue.enqueue(i);
			muhahahaha.enqueue(i%2);
		}
		System.out.println(queue.toString());
		
		System.out.println("---------------------------------------------------------------------------");
		
		// queue.concat(muhahahaha);
		
		System.out.println("AHHH");
		for(int i = 0; i<45; i++) {
			//System.out.println("AHHHHHHHHHHHH");
			queue.dequeue();
			System.out.println(queue.front());
		}
		
		/*
		System.out.println("value 24 is: " + queue.search(24));
		System.out.println("value 55 is: " + queue.search(55));
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(queue.toString());*/
		
		System.out.println("---------------------------------------------------------------------------");
		/*
		priorityQueue Krankenhaus = new priorityQueue();
		Krankenhaus.insert(1, priority.doom);
		Krankenhaus.insert(2, priority.is);
		Krankenhaus.insert(3, priority.eternal);
		Krankenhaus.insert(4, priority.doom);
		Krankenhaus.insert(5, priority.is);
		
		while(!Krankenhaus.empty()) {
			// System.out.println(Krankenhaus.max());
			System.out.println("Anruf: "+Krankenhaus.maxAnruf());
			Krankenhaus.delete();
		}
		*/
	}

}