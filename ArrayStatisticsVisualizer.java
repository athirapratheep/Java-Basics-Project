import java.util.*;
import javax.swing.*;
public class ArrayStatisticsVisualizer {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(400,300);
        f.setLayout(null);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("-Array Statistics Visualizer-");
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" Menu:");

    }
}   
