/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Question3 extends JFrame {

    private JMenuBar menuBar;
    private JCheckBox a;
    private JCheckBox b;
    private JCheckBox c;
    private JButton chk;
    private JCheckBox d;
    private JButton nxt;
    private JLabel q1;
    private JLabel q3;
    private JLabel ans;

    
    //Constructor 
    public Question3(){

        this.setTitle("Question 3");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        a = new JCheckBox();
        a.setBounds(17,289,90,35);
        a.setBackground(new Color(214,217,223));
        a.setForeground(new Color(0,0,0));
        a.setEnabled(true);
        a.setFont(new Font("sansserif",0,12));
        a.setText("A. Tesla");
        a.setVisible(true);
          
        ans = new JLabel();
        ans.setBounds(270,50,134,37);
        ans.setBackground(new Color(214,217,223));
        ans.setForeground(new Color(0,0,0));
        ans.setEnabled(true);
        ans.setFont(new Font("sansserif",0,16));
        ans.setText("?????????");
        ans.setVisible(true);
        
        b = new JCheckBox();
        b.setBounds(17,336,90,35);
        b.setBackground(new Color(214,217,223));
        b.setForeground(new Color(0,0,0));
        b.setEnabled(true);
        b.setFont(new Font("sansserif",0,12));
        b.setText("B. Tata");
        b.setVisible(true);

        c = new JCheckBox();
        c.setBounds(188,289,90,35);
        c.setBackground(new Color(214,217,223));
        c.setForeground(new Color(0,0,0));
        c.setEnabled(true);
        c.setFont(new Font("sansserif",0,12));
        c.setText("C. Lincoln");
        c.setVisible(true);

        chk = new JButton();
        chk.setBounds(373,120,90,35);
        chk.setBackground(new Color(214,217,223));
        chk.setForeground(new Color(0,0,0));
        chk.setEnabled(true);
        chk.setFont(new Font("sansserif",0,12));
        chk.setText("CHECK");
        chk.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        chk.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                checker(evt);
                
                if(a.isSelected() == true)
                {
                    ans.setText("Incorrect");
                }
                else if(b.isSelected() == true)
                {
                    ans.setText("Correct");
                }
                else if(c.isSelected() == true)
                {
                    ans.setText("Incorrect");
                }
                else if(d.isSelected() == true)
                {
                    ans.setText("Incorrect");
                }
                else 
                {
                    ans.setText("Error");
                }
            }
        });

        d = new JCheckBox();
        d.setBounds(188,333,90,35);
        d.setBackground(new Color(214,217,223));
        d.setForeground(new Color(0,0,0));
        d.setEnabled(true);
        d.setFont(new Font("sansserif",0,12));
        d.setText("D. Tuscan");
        d.setVisible(true);
                
        nxt = new JButton();
        nxt.setBounds(373,185,90,35);
        nxt.setBackground(new Color(214,217,223));
        nxt.setForeground(new Color(0,0,0));
        nxt.setEnabled(true);
        nxt.setFont(new Font("sansserif",0,12));
        nxt.setText("NEXT");
        nxt.setVisible(true);
        //Set methods for mouse events
    //Call defined methods
    nxt.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            nexter(evt);
 
            new Question4().setVisible(true);
            dispose();
        }
    });
               
        q1 = new JLabel();
        q1.setBounds(15,43,249,45);
        q1.setBackground(new Color(214,217,223));
        q1.setForeground(new Color(0,0,0));
        q1.setEnabled(true);
        q1.setFont(new Font("SansSerif",0,16));
        q1.setText("Question 1. Name this Auto Logo");
        q1.setVisible(true);

        q3 = new JLabel();
        q3.setBounds(176,17,134,22);
        q3.setBackground(new Color(214,217,223));
        q3.setForeground(new Color(0,0,0));
        q3.setEnabled(true);
        q3.setFont(new Font("SansSerif",0,18));
        q3.setText("PICTURE QUIZ");
        q3.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(a);
        contentPane.add(ans);
        contentPane.add(b);
        contentPane.add(c);
        contentPane.add(chk);
        contentPane.add(d);
        contentPane.add(nxt);
        contentPane.add(q1);
        contentPane.add(q3);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method mouseClicked for chk
    private void checker (MouseEvent evt) {
            //TODO
    }
    
    //Method mouseClicked for nxt
    private void nexter (MouseEvent evt) {
            //TODO
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Question3();
                    
               
            }
        });
    }

}
