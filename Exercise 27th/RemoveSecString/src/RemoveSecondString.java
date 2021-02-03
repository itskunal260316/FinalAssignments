import java.util.ArrayList;
import java.util.Scanner;

public class RemoveSecondString {
	
	static void removeElements(String f, String s) {
		char[] fChar = f.toCharArray();
		char[] sChar = s.toCharArray();
		char[] newChar = new char[f.length()];
		
		for(int i=0;i<sChar.length;i++) {
			for(int j=0;j<fChar.length;j++) {
				if(fChar[j]==sChar[i]) {
					fChar[j]=' ';
				}
			}
		}
		
		int index=0;
		for(char c:fChar) {
			if(c!=' ') {
				newChar[index]=c;
				System.out.print(newChar[index]);
				index++;
			} 			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string : ");
		String first = sc.nextLine();
		first=first.toLowerCase();
		System.out.println("Enter second string : ");
		String second = sc.nextLine();
		second=second.toLowerCase();
		removeElements(first, second);
	}

}
