/*Suppose for a unit rise in temperature, the solubility of sugar in water increases by Bg100 mL.
Chef does an experiment to check how much sugar (in g) he can dissolve given that he initially has 1 liter of water at X degrees and the solubility of sugar at this temperature is Ag100 mL. Also, Chef doesn't want to lose any water so he can increase the temperature to at most 100 degrees.
Assuming no loss of water takes place during the process, find the maximum amount of sugar (in g) can be dissolved in 1 liter of water under the given conditions.*/



#include <iostream>

using namespace std;

int main() 
{
    int t,x,a,b,i,amt;

    cin>>t;

    for(i=0; i<t; i++)
    {
        cin>>x >>a >>b;

        amt=(a+(100-x)*b)*10;
        
        cout<<amt<<"\n";
    }
    
    return 0;
} 