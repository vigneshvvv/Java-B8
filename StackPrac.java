package sample;

import java.util.Stack;

public class StackPrac {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.push(102);
		stack.push(103);
		stack.push(104);
		stack.push(105);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.search(102));
	}

}
