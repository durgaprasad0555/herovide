
import java.util.*;

public class Dublicateinarray {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
TreeSet<Integer>th=new TreeSet<>();
for(int i=0;i<n;i++)
{
    th.add(arr[i]);
}
System.out.println(th);
sc.close();
}    
}
