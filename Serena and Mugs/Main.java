#include<iostream>
using namespace std;
int main()
{
  int c,sum=0,n;
  cin>>n;
  cin>>c;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+arr[i];
  }
  if(sum<=c)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
  return 0;
}
          