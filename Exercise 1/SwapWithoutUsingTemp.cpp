#include<iostream>
using namespace std;
int main(){
	int a=11;
	int b=20;
	int c;
	cout<<"before swapping"<<endl;
		cout<<"a="<<a<<endl;
		cout<<"b="<<b<<endl;
	c=a+b;
	a=c-a;
	b=c-b;
	cout<<"after swapping"<<endl;
	cout<<"a="<<a<<endl;
		cout<<"b="<<b<<endl;
	return 0;
}
