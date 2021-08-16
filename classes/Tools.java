package classes;

import java.io.IOException;

import java.util.*;





public class Tools {
	
	public static Scanner input = new Scanner(System.in);
	public static void clear() {
		/*
		 * This method will clear the whole screen.
		 */
	
		 try {
			// new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // for windows

			Runtime.getRuntime().exec("clear");  


		}  catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void sleepFor(String message, int sec){
		/*
		 * This method will show a message for certain time by stopping main thread.
		 */
		try{
			Tools.clear();
			System.out.print("\n\n\n\n" +message);
			for(int i = 0; i < sec; i++){
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Tools.clear();
		}catch(Exception e){
			// pass
		}
	}
	
	public static void etoc() {
		/*
		 * This method will stop the screen and wait for press enter button
		 */
		System.out.println("Press enter to continue. . .");
		Tools.input.nextLine();
	}
	
	public static void clearPrintHold(String message) {
		Tools.clear();
		System.out.println(message);
		Tools.etoc();
	}
}
