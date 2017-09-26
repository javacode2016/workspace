package com.thebyteguru.display;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

public abstract class Display {
    
    private static boolean created = false; //создалось окно или нет, проверка создано или нет
    private static JFrame window;           //рамка, окно
    private static Canvas content;          //лист, на котором будем рисовать
    
    
   public static void create(int width, int height, String title) {//создание окна
       if(created) //если окно создано, то выход
           return;
       
       window = new JFrame(title);
            //создание окна/рамки с именем
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //завершение процесса по закрытию окна
       content = new Canvas() {
           @Override
           public void paint(Graphics g) {
               super.paint(g);
               render(g);           
           }       
       };      
            //создание листа/ 
       Dimension size = new Dimension(width, height);
            //в Canvas размер листа передается не совсем стандартным 
            //образом, через специальный объект Дименшн
       content.setBackground(Color.black);
            //фоновый цвет
       content.setPreferredSize(size);
            //передаем контенту размер объекстом демешн
       window.setResizable(false);
            //пользователь не может менять размер окна
       window.getContentPane().add(content);
            //добавляем лист в рамку, во внутреннюю часть окна
       window.pack();
            //поскольку мы задали размер Канвасу и добавили в наше окно, то виндовз.пак изменит размер окна, так чтобы он подходил под размер контент, без потери информации
       window.setLocationRelativeTo(null);
            //меняет позицию окна на экране в зависимости от компонента, если нет компонента,то null - посередине
       window.setVisible(true);
   }
   public static void render() {
       content.repaint();
   }
   private static void render(Graphics g) {
       g.setColor(Color.white);
       g.fillOval(400 - 50, 300 - 50, 100, 100);
   }
   
   
   
   
}
