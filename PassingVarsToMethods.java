package helloObjectsAndStuff;
/*
 * Hey there :) 
 * this application express the operation of 
 * passing the primitive data types to the functions by
 * value 
 * and to notice that it just copy the variable value
 * without any effects on the sent variable itself 
 * This is just an example , its public domain , no license 
 * fuck up with it as you want :D 
 * 
 * */
public class PassingVarsToMethods {
	public static void pl(String s) {
		System.out.println(s);
	}
	public static void funcy(int val) {
		System.out.println("Value retrived : "+val);
		val = val+3;
		System.out.println("Value after increment : "+ val);
		
	}
	public static void main(String[] args) {
		Integer i = 10;
		i = i+4;
		pl("the normal i value: "+i);
		pl("Sending i to the function funcy() to make its modifications ..");
		funcy(i);
		pl("funcy() work , finished .. ");
		pl("Variable i value is , "+i);
		pl("thanks for your attention , the function pl() was here !");
		
	}

}
