
import java.util.*;
public class Assignment3
{
    static Scanner sc=new Scanner(System.in);
    static void addproducts(ArrayList<String> al,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter product name");
        String pn=sc.next();
        al.add(pn);
        System.out.println("Enter product quantity");
        int pq=sc.nextInt();
        System.out.println("Enter Specifications");
        sc.nextLine();
        String sp=sc.nextLine();
        System.out.println("Enter Cost");
        String c=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        pd.add(a);
        pc.add(pq);
    }
    static void viewproductdetails(ArrayList<String> al,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+"  ");
            String d="";
            for(int j=0;j<pd.get(i).size();j++)
            d+=pd.get(i).get(j)+" ";
            System.out.print(d);
            System.out.println();
        }
    }
    static void productlist(ArrayList<String> al,ArrayList<Integer> pc)
    {
        System.out.println("Enter productname to get count");
        String name=sc.next();
        int k=al.indexOf(name);
        System.out.println(al.get(k)+" "+pc.get(k));
    }
    static void editproduct(ArrayList<String> pl,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter productname to edit details");
        String p=sc.next();
        int k=pl.indexOf(p);
        System.out.println("Enter product quantity");
        int pq=sc.nextInt();
        System.out.println("Enter Specifications");
        sc.nextLine();
        String sp=sc.nextLine();
        System.out.println("Enter Cost");
        String c=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        pd.set(k, a);
        pc.set(k,pq);
    }
    static void productcount(ArrayList<String> al,ArrayList<Integer> pc)
    {
        System.out.println("Enter productname to get count");
        String pn=sc.next();
        int i=al.indexOf(pn);
        System.out.println(al.get(i)+"    "+pc.get(i));
    }
    static void updateinventory(ArrayList<String> al,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter 1 to add and 2 to delete product quantity");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter product name");
            String pn=sc.next();
            System.out.println("Enter no of items to add");
            int n=sc.nextInt();
            int i=al.indexOf(pn);
            pc.set(i,pc.get(i)+n);
            int m=pc.get(i);
            pd.get(i).set(2,Integer.toString(m));
        }
        else
        {
            System.out.println("Enter product name");
            String pn=sc.next();
            System.out.println("Enter no of items to add");
            int n=sc.nextInt();
            int i=al.indexOf(pn);
            pc.set(i,pc.get(i)-n);
            int m=pc.get(i);
            pd.get(i).set(2,Integer.toString(m));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        ArrayList<ArrayList<String>> pd=new ArrayList<>();
        ArrayList<Integer> pc=new ArrayList<>();
        System.out.println("Enter Number of items to be added");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        addproducts(al,pd,pc);
        viewproductdetails(al, pd, pc);     
    } 
}