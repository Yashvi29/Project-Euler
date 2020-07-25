//solution to Q1 on Project Euler

import java.util.*;
class sum1
{
    public static void main(String args[])
    {
        int sum=0;
        for(int i=0;i<1000;i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
