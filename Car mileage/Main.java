#include<iostream>
using namespace std;
int main()
{
  int petrol,dist,possibledist;
  float milage;
  std::cin>>milage>>petrol>>dist;
  possibledist=milage*petrol;
  if(possibledist>=dist)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
  return 0;
}