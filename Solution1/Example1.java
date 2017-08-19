import java.util.*;
class Example1
{
	public static void main(String[] args)
	{
	
	int i,sum=0,j;
	
	
	j=2;
System.out.println("Perfect Numbers:");
	while(j<=100)
	{
	i=1;
	sum=0;
	while(i<j)
	{
		if(j%i==0)
		{
		//System.out.println(i);
		sum+=i;
		}
		i++;
	}
	
	
	
	if(j==sum)
	System.out.println("Value="+j+"\tSum="+sum);
	j++;
}
	}
}