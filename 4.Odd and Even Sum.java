import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) 
{
Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        int odd=0,even=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even+=a[i];
            }
            else
            {
                odd+=a[i];
            }
        }
        System.out.print(odd+" "+even);
    }
}
