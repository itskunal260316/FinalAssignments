import java.util.HashMap;
import java.util.Scanner;

public class AllDuplicateChars {

	
	static void getAllDuplicate(String str) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] stringChar = str.toCharArray();
		
		for(char c:stringChar) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		map.forEach((k,v)->{
			if(map.get(k)>1) {
				System.out.print(k);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to analyse : ");
		String str = sc.nextLine();
		getAllDuplicate(str);	
	}

}
