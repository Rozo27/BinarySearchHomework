import java.util.Scanner;

public class BinarySearch {
    public static int getPosition(int[] a, int key){
        int st=0,dr=a.length-1,m;
        while(st<=dr){
            m=(st+dr)/2;
            if(key==a[m])
                return m;
            else if(key>a[m])
                st=m+1;
                else dr=m-1;
        }
        System.out.println("Elementul nu s-a gasit, dar ar trebui inserat pe pozitia:");
        return st;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int key,n;
        System.out.println("Introduceti numarul de elemente ale vectorului sortat:");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Introduceti elementele vectorului sortat:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Introduceti valoarea cautata:");
        key=sc.nextInt();
        System.out.println(getPosition(a,key));
        sc.close();
    }
}
