#include <iostream>
    #include <math.h>
    using namespace std;
   
   
    int convert(long binary)
    {
        int octal = 0, decimal = 0, i = 0,rem;
       
        while(binary != 0)
        {
            rem = binary % 10;
            int res = rem * pow(2,i);
            decimal =decimal+res;
            i++;
            binary=binary/10;
        }
        i = 1;
     
        while (decimal != 0)
        {
            rem = decimal % 8;
            octal += rem * i;
            decimal /= 8;
            i *= 10;
        }
        
        return octal;
    }
   
          int main()
    {
        long binary;
        cout<<"Enter a binary number:";
       
        cin >> binary;
        
        int octal=convert(binary);
       
        cout << binary <<" " << octal <<  " in octal";
        return 0;
    }
   
