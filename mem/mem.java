public class mem{
	public static void main(String[] args){
		Runtime x = Runtime.getRuntime();
		Runtime.Version v = Runtime.version();

		long g = (1024*1024);
		
		// g variable conatins the value to make the conversion 
		//from the bytes that is returned from the Runtime memory functions
		//by default .. so now we devide the values on the g value to convert to 
		//kb -> mb -> gb 
		//1024 * 1024 * 1024

		long mm = x.maxMemory()/g;
		long fm = x.freeMemory()/g;
		long tm = x.totalMemory()/g;

		System.out.println("Memory display v 1.0 ");
		System.out.println();
		System.out.println("Max memory is "+ mm+" mb");
		System.out.println("Free memory is "+ fm+" mb");
		System.out.println("Total memory is "+ tm+" mb");
		System.out.println();
		System.out.println("The Runtime version is "+ v);
		System.out.println("=====> Done .");
	}

}
