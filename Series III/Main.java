#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  int s=5,sum=6;
  
  for(i=0;i<n;i++)
  {
    sum=s*i+sum;
    cout<<sum<<" ";
  }
}