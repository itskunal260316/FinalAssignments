#include<iostream>
using namespace std;
int main()
{
	int temp,i;
	int arr[4]={2,6,7,9};
	cout<<"array is"<<endl;
	for(i;i<4;i++)
	cout<<arr[i]<<endl;
	
	if(arr[i]>arr[i+1])
	{
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
		cout<<"array is"<<endl;
	for(int i;i<=4;i++)
	cout<<arr[i]<<endl;
	return 0;
	
	
}
