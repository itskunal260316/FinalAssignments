#include <iostream>  
using namespace std;  
int main()  
{  
int n1,n2,r,sum=0,temp,flag=1,n;    
    
 
cout<<"two num";
cin>>n1>>n2; 
while(n>n1&&n<n2)
{    
r=n%10;    
sum=sum+(r*r*r);    
n=n/10;    
}    
if(temp==sum)    
cout<<n;   
else    
cout<<"Not Armstrong Number."<<endl;   
return 0;  
}  
