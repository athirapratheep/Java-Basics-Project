import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;
public class StringPatternSearch {
    public static void main(String[] args)
    {
        JFrame f=new JFrame("String Pattern Searcher");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        f.setSize(500,400);
        f.setLayout(new BorderLayout());

        JLabel stringLabel = new JLabel("Enter the string");
        JTextArea stringTextArea=new JTextArea(5,30);
        stringTextArea.setLineWrap(true);
        stringTextArea.setWrapStyleWord(true);

        JLabel patternLabel=new JLabel("Enter the pattern");
        JTextField patternField = new JTextField(30);
        JButton searchButton = new JButton("Search");

        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        JScrollPane stringScrollPane = new JScrollPane(stringTextArea);
        JScrollPane resultScrollPane = new JScrollPane(resultArea);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(stringLabel);
        inputPanel.add(stringScrollPane);
        inputPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        inputPanel.add(patternLabel);
        inputPanel.add(patternField);

        f.add(inputPanel, BorderLayout.NORTH);
        f.add(searchButton, BorderLayout.CENTER);
        f.add(resultScrollPane, BorderLayout.SOUTH);
        f.setVisible(true);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mainString = stringTextArea.getText();
                String pattern = patternField.getText();

                if (mainString.isEmpty() || pattern.isEmpty()) {
                    resultArea.setText("Both the main string and the pattern must be filled out.");
                    return;
                }

                ArrayList<Integer> matches = searchPattern(mainString, pattern);
                if (matches.isEmpty()) {
                    resultArea.setText("No matches found.");
                } else {
                    resultArea.setText("Pattern found at indices: " + matches.toString());
                }
            }
        });
    }
        private static ArrayList<Integer> searchPattern(String mainString, String pattern) {
            ArrayList<Integer> indices = new ArrayList<>();
            int index = mainString.indexOf(pattern);
    
            while (index != -1) {
                indices.add(index);
                index = mainString.indexOf(pattern, index + 1);
            }
    
            return indices;
        }
    
    }
