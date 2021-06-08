/*Chefland has 2 different types of coconut, type A and type B. 
Type A contains only xa milliliters of coconut water and type B contains only 
xb grams of coconut pulp.Chef's nutritionist has advised him to consume Xa milliliters 
of coconut water and Xb grams of coconut pulp every week in the summer. 
Find the total number of coconuts (type A + type B) that Chef should buy each week 
to keep himself active in the hot weather.*/

#include <iostream>
using namespace std;

int main() {
    
    int t, xa, xb, ya, yb, a, b;
    cin>> t;
    for(int i=1; i<=t; i++)
    {
        cin>>xa >> xb >> ya >> yb;
        a= (ya/xa);
        b= (yb/xb);
        
        cout<< "\n" << (a+b); 
    }
	
	return 0;
}
