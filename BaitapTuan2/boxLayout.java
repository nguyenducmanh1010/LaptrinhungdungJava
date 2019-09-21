/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Container;
/**
 *
 * @author DucManh
 */
public class boxLayout extends JFrame {
    public boxLayout(String title){
        super(title);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnBox=new JPanel();
        //pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.X_AXIS));
        pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.Y_AXIS));
        JButton btn1=new JButton("BoxLayout");
        btn1.setForeground(Color.red);
        Font font=new Font("Arial",Font.BOLD / Font.ITALIC,25);
        btn1.setFont(font);
        pnBox.add(btn1);
        JButton btn2=new JButton("X_AXIS");
        btn2.setForeground(Color.blue);
        btn2.setFont(font);
        pnBox.add(btn2);
        JButton btn3=new JButton("Y_AXIS");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);
        pnBox.add(btn3);
        Container con=getContentPane();
        con.add(pnBox);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new boxLayout("Học BoxLayout");
    }
}
