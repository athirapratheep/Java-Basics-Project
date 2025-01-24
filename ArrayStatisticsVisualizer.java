import java.util.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
public class ArrayStatisticsVisualizer {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        JFrame f=new JFrame("Array Statistics Visualizer");
        f.setSize(400,300);

        JLabel inputlabel = new JLabel("Enter array elements");
        JTextField inputfield= new JTextField();
        JButton calculate = new JButton("Calculate statistics");
        JTextArea result=new JTextArea();
        result.setEditable(false);
        f.setLayout(new BorderLayout());

        JPanel toppanel=new JPanel(new BorderLayout());
        toppanel.add(inputlabel,BorderLayout.NORTH);
        toppanel.add(inputfield,BorderLayout.CENTER);
        f.add(toppanel,BorderLayout.NORTH);

        f.add(calculate,BorderLayout.CENTER);
        f.add(new JScrollPane(result),BorderLayout.SOUTH);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        f.setVisible(true);
        
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input=inputfield.getText();
                try{
                    
                }
        });
        // Scanner sc=new Scanner(System.in);
        // System.out.println("-Array Statistics Visualizer-");
        // System.out.println("Enter the size of the array:");
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // System.out.println("Enter the elements of the array:");
        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(" Menu:");

    }
}   
