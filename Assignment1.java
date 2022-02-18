import java.util.*;
import java.io.*;

public class Assignment1{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the absolute path to a directory: ");
		String path = sc.nextLine();
		findAll(path);
	}

	public static void findAll(String path){
		File file = new File(path);
		for(String s: file.list()){
			System.out.println(s);
			if(new File(path + "/" + s).isDirectory()){
				findAll(path + "/" + s );
			}
		}

	}

}
