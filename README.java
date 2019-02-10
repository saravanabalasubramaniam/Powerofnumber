import java.io.*;
import java.util.*;
class Powerofnumber
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int num=a;
	int x=0;
	int y=0;
	while(num>1)
	{
		if(num%2==0)
		{
		  x++;	
		}
		else
		{
		  y++;
		}
	  num=num/2;	
	}
        if(y>0)
	{
            System.out.println("no");
	}
	else
	{
	    System.out.println("yes");
         }
}
}
