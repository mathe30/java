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
public class PassingVarsToMethodsByReference {
	public static void pl(String s) {
		System.out.println(s);
	}
	// if you wanna this to change the value of the array i
	// you need to send the array to the function and retrive it in the function as 
	// an array not a primitive data type .. 
	// the code will looks like this 
	/*
	 * 
	 * 	public static void funcy(int[] val) {
	 *		System.out.println("Value retrived : "+val[0]);
	 *		val[0] = val[0]+3;
	 *		System.out.println("Value after increment : "+ val[0]);
	 *		
	 *	}
	 *	public static void main(String[] args) {
	 *		int[] i = new int[] {10,11,12};
	 *		i[0] = i[0]+4;
	 *		pl("the normal i value: "+i[0]);
	 *		pl("Sending i to the function funcy() to make its modifications ..");
	 *		funcy(i);
	 *		pl("funcy() work , finished .. ");
	 *		pl("Variable i value is , "+i[0]);
	 *		pl("thanks for your attention , the function pl() was here !");
	 *		
	 *	}
	 * 
	 *  It will just change it and all will works fine , but remember this:
	 *  
	 *  1) The String object will still be treated as a primitive data type 
	 *  	in this case . read the (2) now to see whats next
	 *  2) go to (3)
	 *  
	 *  3) go to (1) and stick there .. 
	 *  
	 *  4) please if you didn't stick with (1) and you re-read this again , 
	 *  	"sudo stickthere">/dev/null 
	 *  5) fine , if you are a windows user , go out ,.. go .. just go .. 
	 *  	don't wanna see you here .
	 *  
	 *  
	 * 
	 * 
	 * 
	 *  	jk , have fun ;)
	 * 
	 * */
	
	public static void funcy(int val) {
		System.out.println("Value retrived : "+val);
		val = val+3;
		System.out.println("Value after increment : "+ val);
		
	}
	public static void main(String[] args) {
		int[] i = new int[] {10,11,12};
		i[0] = i[0]+4;
		pl("the normal i value: "+i[0]);
		pl("Sending i to the function funcy() to make its modifications ..");
		funcy(i[0]);
		pl("funcy() work , finished .. ");
		pl("Variable i value is , "+i[0]);
		pl("thanks for your attention , the function pl() was here !");
		
	}

}
