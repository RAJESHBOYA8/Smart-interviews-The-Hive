import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[100];
        for(int i=1;i<=99;i++)
        {
            a[i]=sc.nextInt();

        }
        int sum=0;
        for(int i=1;i<=99;i++)
        {
            sum+=a[i];
        }
        System.out.print(5050-sum);
    }
}
