/*
Kevin Damazyn
We have two monkeys, a and b, and the parameters aSmile and bSmile 
indicate if each is smiling. We are in trouble if they are both smiling 
or if neither of them is smiling. Return true if we are in trouble. 

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
*/

public class monkeyTrouble {

	public static void main(String[] args) {
		System.out.println(monkeyTrouble(false, false));
		System.out.println(monkeyTrouble(true, false));
		System.out.println(monkeyTrouble(false, true));
		System.out.println(monkeyTrouble(true, true));
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  		if(!aSmile && !bSmile) {
    		return true;
  		}
  		if(aSmile && bSmile) {
    		return true;
  		}
  		return false; 
	}
}