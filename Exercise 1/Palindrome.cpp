#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	char string1[20],string2[20];
	int i,j,length=0;
	int flag=0;
	
	cout<<"enter the string:";
	cin>>string1;
	
	 length=strlen(string1)-1;
for(i=length,j=0;i>=0;i--,j++)
	string2[j]=string1[i];
	if (strcmp(string1,string2))
			flag=1;
	if(flag==1)
	cout<<string1<<endl<<"string is not palindrom";
	else
	cout<<string2<<endl<<"string  is palindrom";
	return 0;
}
