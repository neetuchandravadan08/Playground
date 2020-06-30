#include<iostream>
using namespace std;
int main()
{
  int a,b;
  int sum,difference,product,q,remainder;
  std::cin>>a>>b;
  sum=a+b;
  difference=a-b;
  product=a*b;
  q=a/b;
  remainder=a%b;
  cout<<"a+b="<<sum<<endl;
  cout<<"a-b="<<difference<<endl;
  cout<<"a*b="<<product<<endl;
  cout<<"a/b="<<q<<endl;
  cout<<"a%b="<<remainder<<endl;
  return 0;
}