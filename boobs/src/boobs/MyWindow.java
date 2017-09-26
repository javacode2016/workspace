
package boobs;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;




public class MyWindow extends JFrame { //Наследуя от JFrame мы получаем всю функциональность окна
    
    JTextArea display= new JTextArea();
   // JPanel buttonPanel = new JPanel(new GridLayout(5,3));

    
    
  public MyWindow(){//класс
    super("My First Window"); //Заголовок окна
    setBounds(200, 200, 500, 500);
    //setBounds(положение сбоку, положение сверху, ширина, высота);
    //setBounds(100, 100, 200, 200); //Если не выставить 
                                   //размер и положение 
                                   //то окно будет мелкое и незаметное

    setLayout(new BorderLayout());
    JPanel panel = new JPanel();
panel.setLayout(new BorderLayout());
JButton button = new JButton("Test button");
panel.add(button, BorderLayout.NORTH);
        //add(display, BorderLayout.NORTH);
        //add(display, BorderLayout.UP);
       // add(buttonPanel,BorderLayout.CENTER);
       //buttonPanel.add(button0);
       // buttonPanel.add(button1);
        
        
    
    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при 
    //setSize(sizeA, sizeB);                                                //закрытии окна закрывалась и программа,
                                                 //иначе она останется висеть в процессах
  }

  //public static void main(String[] args) { //эта функция может быть и в другом классе
    //MyWindowApp app = new MyWindowApp(); //Создаем экземпляр нашего приложения
    //app.setVisible(true); //С этого момента приложение запущено!
  //}
}