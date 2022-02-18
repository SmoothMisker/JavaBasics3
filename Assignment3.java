import java.util.*;
import java.io.*;

public class Assignment3{
	static int counter = 0;

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of the file: ");
		File file = new File(sc.nextLine());
		System.out.println("Enter the character you want to count: ");
		char ch = sc.nextLine().charAt(0);
		count(file, ch);
	}

	public static void count(File file, char ch){
		try{
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				for(char i : sc.nextLine().toCharArray()){
					if(i == ch){
						counter++;
					}
				}
				

			}
		}catch(IOException e){e.printStackTrace();}

		System.out.println(counter + " Occurences");

	}
}
