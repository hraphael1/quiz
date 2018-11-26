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
import javax.swing.JButton;
import javax.swing.SwingUtilities;


public class QuizScreen extends JFrame {

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
    public QuizScreen(){

        this.setTitle("Quiz Screen");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

                      
        nxt = new JButton();
        nxt.setBounds(373,185,90,35);
        nxt.setBackground(new Color(214,217,223));
        nxt.setForeground(new Color(0,0,0));
        nxt.setEnabled(true);
        nxt.setFont(new Font("sansserif",0,12));
        nxt.setText("BEGIN");
        nxt.setVisible(true);
        //Set methods for mouse events
        //Call defined methods        
        nxt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                nexter(evt);
                
                new Question1().setVisible(true);
                dispose();
            }
        });
 
        q3 = new JLabel();
        q3.setBounds(176,17,134,22);
        q3.setBackground(new Color(214,217,223));
        q3.setForeground(new Color(0,0,0));
        q3.setEnabled(true);
        q3.setFont(new Font("SansSerif",0,18));
        q3.setText("AUTO PICTURE QUIZ");
        q3.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(nxt);
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
                new QuizScreen();
                    
               
            }
        });
    }

}