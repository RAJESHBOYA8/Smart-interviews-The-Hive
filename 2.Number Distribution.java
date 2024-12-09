import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int b=0,c=0,d=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for( int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                b+=1;
            }
            else if(a[i]>0)
            {
                c+=1;
            }
            else{
                d+=1;
            }
        } 
        System.out.print(b+" "+c+" "+d);
        sc.close();
    }
}
