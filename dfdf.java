import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner se=new Scanner(System.in);
    int n=se.nextInt();
    int check=0;
    int i=2;
    int isprime=0;
  for(i=2;i<=n;i++)
  {
    int lnum=i/2;
    for(int j=0;j<lnum-1;j++)
    {
    	if(i%(j+1)==0)
      {
      	isprime=isprime+1;
      }
    }
    if(isprime==0)
    {
		System.out.print(i+" ");
      isprime=0;
  }}
}
}