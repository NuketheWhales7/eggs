package eggs;
import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	
	    System.out.println("How many eggs?"); // Ask user how many eggs
	
	    int eggs = scan.nextInt(); //Gets input from user as variable eggs
	
	    int dozens = eggs / 12, ind = eggs - (dozens*12); // sets amount of dozens and finds remainder
	    
	    System.out.println(" You ordered " + eggs + " eggs total. At $3.25 a dozen for " + dozens +" dozens and " + ind + " loose eggs at 45 cents each for total of $"+ ((dozens*3.25)+(ind*0.45))+".");
	}
}
