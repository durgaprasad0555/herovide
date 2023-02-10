import java.util.*;
import java.util.Collections;

public class Missing {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();
     }
     ArrayList<Integer>al=new ArrayList<>();
     ArrayList<Integer>al2=new ArrayList<>();
     for(int e:arr)
     {
        al.add(e);
     }
     int c=Collections.max(al);
     for(int i=1;i<=c;i++)
     {
        if(!al.contains(i))
        {
           al2.add(i);
        }
     }
     System.out.println(al2);
     sc.close();
}    
}
