import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
public class GUI implements ActionListener {
    Random randomCalc = new Random();
    JFrame frame;
    ArrayList<String> adjectiveList;
    ArrayList<String> nounList;

    JPanel panel;
    JLabel output;

    public GUI(ArrayList<String>a,ArrayList<String>n) {

        frame = new JFrame();
        adjectiveList = a;
        nounList = n;
        panel = new JPanel();
        output = new JLabel("");
        JButton button = new JButton("generate new name!");
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        frame.add(panel, BorderLayout.CENTER);
        panel.add(button);
        panel.add(output);
        frame.setTitle("name generator!");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent e){

        output.setText(adjectiveList.get(randomCalc.nextInt(adjectiveList.size())) + " " +nounList.get(randomCalc.nextInt(nounList.size())));
    }

}