package mainPackage;

public class ArrayStack {
	private int[] stack;
	private int tos;

	public ArrayStack() {
		stack = new int[100];
		tos = -1;
	}

	public void push(int x) {
		if (tos < 99) {
			tos++;
			stack[tos] = x;
		}
	}

	public int pop() {
		if (!empty()) {
			int val = (int)top();
			tos--;
			return val;
		}
		return -1;
			
	}

	public boolean empty() {
		return (tos == -1);
	}

	public Object top() {
		if (!empty())
			return stack[tos];
		else
			return null;
	}

	public ArrayStack copyL(ArrayStack stacky, boolean debug) {
	
		ArrayStack stack = new ArrayStack();
		for (int i = 0; i <= stacky.stack.length; i++) {
			stack.push(stacky.stack[i]);
			
			if (debug) {
				System.out.println(stacky.top());
				System.out.println(stack.top());
				System.out.println("next value");
			}
		}
		return stack;
	}

	public void copyH(ArrayStack stacky, boolean debug) {
		ArrayStack tmp = new ArrayStack();
		
		while (!stacky.empty()) {
			tmp.push((int) stacky.top());
			if (debug) {
				System.out.println(stacky.top());
			}
			stacky.pop();
		}

		while (!tmp.empty()) {
			stacky.push((int) tmp.top());
			this.push((int) tmp.top());
			if (debug) {
				System.out.println(this.top());
			}
			tmp.pop();
		}

	}
	
	public void copyH(ArrayStack stacky) {
		ArrayStack tmp = new ArrayStack();
		
		while (!stacky.empty()) {
			tmp.push(stacky.pop());
		}

		while (!tmp.empty()) {
			stacky.push((int) tmp.top());
			this.push((int) tmp.pop());
		}

	}
	
	public void append(ArrayStack stacky) {
		ArrayStack tmp = new ArrayStack();
		
		while(!stacky.empty()) {
			tmp.push(stacky.pop());
		}
		
		while(!tmp.empty()) {
			this.push((int)tmp.top());
			stacky.push(tmp.pop());
			
		}
		
	}

}