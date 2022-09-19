package mainPackage;

public class Test {

	public static void main(String[] args) {
		/*
		Liste liste = new Liste(3);
		liste.add(5);
		liste.add(43);
		liste.add(9);
		liste.add(12);
		liste.add(13);
		liste.add(7);
		
		System.out.println(liste);
		
		liste.addHead(42);
		
		System.out.println(liste);
		
		
		System.out.println(liste.counter());
		
		liste.firstLast();
		
		System.out.println("\n"+liste.find(4));
		
		liste.remove(7);
		System.out.println(liste);*/
		//////////////////////////////////
		/*
		Stack stacky = new Stack(55);
		for(int i= 0; i<50;i++) {
			stacky.push(i);
		}
		System.out.println(stacky.toString());
		for(int i = 0;i<30;i++) {
			stacky.pop();
		}
		System.out.println(stacky.toString());
		*/
		///////////////////////////////////
		Queue queue = new Queue(5);
		System.out.println(queue.toString());
		for(int i = 0; i < 20; i++) {
			queue.enqueue(i);
			System.out.println(queue.toString());
		}
		
		System.out.println(queue.toString());
		
		for(int i = 0; i < 20; i++) {
			queue.dequeue();	
		}
		
		System.out.println(queue.toString());
		
		
		
	}

}
