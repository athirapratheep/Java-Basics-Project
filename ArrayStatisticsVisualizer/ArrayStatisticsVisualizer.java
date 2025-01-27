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
        JTextArea resultArea=new JTextArea();
        resultArea.setEditable(false);
        f.setLayout(new BorderLayout());

        JPanel toppanel=new JPanel(new BorderLayout());
        toppanel.add(inputlabel,BorderLayout.NORTH);
        toppanel.add(inputfield,BorderLayout.CENTER);
        f.add(toppanel,BorderLayout.NORTH);

        f.add(calculate,BorderLayout.CENTER);
        f.add(new JScrollPane(resultArea),BorderLayout.SOUTH);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        f.setVisible(true);
        
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input=inputfield.getText();
                try{
                    int[] arr=  Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();

                    double mean=calculateMean(arr);
                    double median=calculateMedian(arr);
                    ArrayList<Integer> mode=calculateMode(arr);
                    int range=calculateRange(arr);
                    int max=calculateMax(arr);
                    int min=calculateMin(arr);

                    StringBuilder result= new StringBuilder();
                    result.append("Array Statistics: \n");
                    result.append("Mean: ").append(mean).append("\n"); //Mean: value
                    result.append("Median: ").append(median).append("\n");
                    result.append("Range: ").append(range).append("\n");
                    result.append("Max: ").append(max).append("\n");
                    result.append("Min: ").append(min).append("\n");
                    result.append("Mode: ").append(mode.isEmpty()? "No mode":mode).append("\n"); //ternary operator usage

                    resultArea.setText(result.toString());
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(f,"Invalid Input");
                }
            }
        });
    }
    private static int calculateMean(int[] arr)
    {
        return (int)(Arrays.stream(arr).average().orElse(0.0)); //average=sum of all elements/no.of elements
    }
    private static double calculateMedian(int[] arr)
    {
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0)
        {
            return ((arr[n/2-1]+arr[n/2])/2.0);
        }
        else{
            return arr[n/2];
        }
    }
    private static ArrayList<Integer> calculateMode(int[] arr)
    {
        Map<Integer,Integer> freqmap=new HashMap<>();
        for(int num:arr)
        {
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        int maxfreq=Collections.max(freqmap.values());
        if(maxfreq==1)
        {
            return new ArrayList<>(); //no mode. so returns an empty list
        }
        ArrayList<Integer> modes=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:freqmap.entrySet())
        {
            if(entry.getValue()==maxfreq)
            {
                modes.add(entry.getKey());
            }
        }
        return modes;

    }
    private static int calculateRange(int[] arr)
    {
        int min=Arrays.stream(arr).min().orElse(0);
        int max=Arrays.stream(arr).max().orElse(0);
        return max-min;
    }
    private static int calculateMax(int[] arr)
    {
        return Arrays.stream(arr).max().orElse(0);
    }
    private static int calculateMin(int[] arr)
    {
        return Arrays.stream(arr).min().orElse(0);
    }
}
