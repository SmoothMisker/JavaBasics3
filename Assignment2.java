import java.util.*;
import java.io.*;

public class Assignment2{

	public static void main(String [] args){
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the absolute path of text file: ");
		String path = br.readLine();
		System.out.println("Enter the text you want to add: ");
		String text = br.readLine();
		append(path, text);
		br.close();
		}catch(IOException e){e.printStackTrace();}
	}

	public static void append(String path, String text){
		try{	
			File file = new File(path);
			if(file.exists() && file.canWrite()){
				FileWriter writer = new FileWriter(file, true);
				writer.append("\n" + text);
				writer.close();
			}else 
				System.out.println("Give me a text file!!");
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}
}
