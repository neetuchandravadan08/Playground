#include<iostream>
using namespace std;
int main()
{
  int num=0,days,cycle=50;
  float sqrt=1;
  cin>>num;
  while(cycle>0)
  {
    sqrt=(sqrt+(num/sqrt))/2;
    --cycle;
  }
  days=num+(int(sqrt)+1);
  cout<<int(days);
  return 0;
}

