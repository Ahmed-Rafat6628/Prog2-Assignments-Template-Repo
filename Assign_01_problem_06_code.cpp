//Ahmed Rafat Abdelrehem
//20216628
#include <iostream>
using namespace std;
int  main() {
int num1;
cin>>num1;
while(num1>=10){
num1/=10;}
if(num1%2==0)
    cout<<"EVEN"<<endl;
else
    cout<<"ODD"<<endl;
    return 0;
}