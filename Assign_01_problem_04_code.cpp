//Ahmed Rafat Abdelrehem 
//20216628
#include <iostream>
using namespace std;
int main() {
    int num1, num2, num3;
    cin >> num1 >> num2 >> num3;
    int min_num = num1;
    if (num2 < min_num) {
        min_num = num2;
    }
    if (num3 < min_num) {
        min_num = num3;
    }
    int max_num = num1;
    if (num2 > max_num) {
        max_num = num2;
    }
    if (num3 > max_num) {
        max_num = num3;
    }
    int mid_num = num1 + num2 + num3 - min_num - max_num;
    cout << min_num <<endl;
    cout << mid_num <<endl;
    cout << max_num << endl;
    cout<<endl; 
    cout << num1 <<endl; 
    cout<< num2 <<endl; 
    cout<< num3 << endl;
    return 0;}