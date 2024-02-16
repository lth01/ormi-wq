package weekquiz.week4;

import java.util.Stack;

public class Week4 {
	public static void main(String[] args){
		System.out.println(isCorrectBraket("((())())"));
	}


	static boolean	CorrectCheckByRecursive(String originStr, String stackStr){
		if(originStr.length() == 0){
			return stackStr.indexOf('(') == -1;
		}else{
			char bracket = originStr.charAt(0);
			if(bracket == '('){
				return CorrectCheckByRecursive(originStr.substring(1), stackStr + String.valueOf('('));
			}else if(stackStr.length() != 1){
				return false;
			}else{
				return CorrectCheckByRecursive(originStr.substring(1), stackStr.substring(0, stackStr.length()));
			}
		}
	}

	static boolean CorrectCheckByStack(String originStr){
		Stack<Character> stack = new Stack<>();

		for(char character : originStr.chars().mapToObj(i ->(char)i).toArray(Character[]::new)){
			if(character == '('){
				stack.push(character);
			}else if(stack.size() == 0){
				 return false;
			}else{
				stack.pop();
			}
		}

		return stack.size() == 0;
	}

	static boolean isCorrectBraket(String originStr){
		// return CorrectCheckByRecursive(originStr, "");
		return CorrectCheckByStack(originStr);
	}
}
