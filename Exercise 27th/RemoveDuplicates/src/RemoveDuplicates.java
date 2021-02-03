import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	
	static String removeDuplicates(char str[], int n) 
    { 
        int index = 0; 
        for (int i = 0; i < n; i++) 
        { 
            int j; 
            for (j = 0; j < i; j++)   
                if (str[i] == str[j]) 
                    break;  
 
            if (j == i)  
                str[index++] = str[i];
        } 
        
        char str2[]=Arrays.copyOf(str, index);
        String result = String.valueOf(str2);
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String inputStr=sc.nextLine();
    	char str[] = inputStr.toCharArray();
        int n = str.length; 
        System.out.println(removeDuplicates(str, n));
    } 

}
