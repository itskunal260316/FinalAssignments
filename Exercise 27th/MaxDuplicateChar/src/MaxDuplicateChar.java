import java.io.ObjectInputStream.GetField;
import java.util.Scanner;



public class MaxDuplicateChar {
	
	
	 
	
	static char getMaxChar(String str) {
		
		//set up 256 char array for ascci values
		int count[]= new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
		
		for(int i=0;i<str.length();i++) {
			if(max<count[str.charAt(i)]) {
				max=count[str.charAt(i)];
				result=str.charAt(i);
				continue;
			}
		}
		
		return result;
	 }
	
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		System.out.println("Max character is "+getMaxChar(str));

	}

}
