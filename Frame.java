import java.awt.event.*;
import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{

    private static final long serialVersionUID =1L;
    private SortingPanel panel = new SortingPanel();
    //JButton button ;
    public Frame(){
        this.setTitle("Bubble Sort");
        this.getContentPane().setPreferredSize(new Dimension(1200 , 600));
        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public SortingPanel getPanel(){
        return this.panel;

    }
}