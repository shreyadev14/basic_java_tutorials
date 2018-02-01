public class CommandLineArguments{
	public static void main(String args[]){
		System.out.println("Total "+args.length+" arguments passed from command line.");
		//for each loop
		for(String arg:args){
			System.out.print(arg+" ");
		}
		//System.out.println(args[1]);
		
	}
}