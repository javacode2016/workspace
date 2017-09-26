package boobs;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame {
     public static void createGUI() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          JFrame frame = new JFrame("Test frame2");
          
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          JPanel panel = new JPanel();
          panel.setLayout(new BorderLayout());
          
        // JButton northButton = new JButton("NORTH (PAGE_START)");
          //panel.add(northButton, BorderLayout.NORTH);
          
          JButton southButton = new JButton("SOUTH (PAGE_END)");
         panel.add(southButton, BorderLayout.SOUTH);
          
          JButton eastButton = new JButton("EAST (LINE_START)");
         panel.add(eastButton, BorderLayout.EAST);
          
          //JButton westButton = new JButton("WEST (LINE_END)");
          //panel.add(westButton, BorderLayout.WEST);
          
         JButton centerButton = new JButton("CENTER");
          panel.add(centerButton, BorderLayout.CENTER);
          
          frame.getContentPane().add(panel);
          frame.setPreferredSize(new Dimension(550, 300));
          frame.pack();
          frame.setVisible(true);
          frame.setLocationRelativeTo(null);
     }
 public TestFrame() {
     javax.swing.SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                    createGUI();
               }
          });
 }
}