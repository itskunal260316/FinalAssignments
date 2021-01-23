#include<iostream>
using namespace std;
int main(){
	char c;
	cout<<"enter char";
	cin>>c;
	if(c=='a'||c=='i'||c=='o'||c=='u'||c=='e'&&c=='A'||c=='I'||c=='O'||c=='U'||c=='E')
	{
		cout<<"vowel"<<endl;
	}
	else{
		cout<<"not vowel"<<endl;
	}
	return 0;
}
