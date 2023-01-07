import java.util.Scanner;
class Strong_Number_Example
{
    public static int fact(int num)
    {
    	int f = 1;
    	for (int i=1;i<=num;i++) 
    	{
    		f = f*i;
    	}
    	return f;
    }


	public static void main(String[] args) 
	{
	   int num,num1,rem,sum=0;
	   System.out.println("enter any number");
	   Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        num1=num;
        while(num!=0)
        {
           rem = num%10;
           sum = sum+fact(rem);
           num = num/10;
        }
        if (sum==num1) 
        {
           System.out.println("strong number");	
        }
        else
        {
        	System.out.println("not strong number");
        }
	}
}