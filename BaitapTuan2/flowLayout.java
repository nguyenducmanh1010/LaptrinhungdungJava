/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Container;
/**
 *
 * @author DucManh
 */
public class flowLayout extends JFrame {
    public flowLayout(String title){
        super(title);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel pnFlow=new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.blue);
        JButton btn1=new JButton("FlowLayout");
        JButton btn2=new JButton("Add các control");
        JButton btn3=new JButton("Trên 1 dòng");
        JButton btn4=new JButton("Hết chỗ chứa");
        JButton btn5=new JButton("Thì xuống dòng");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con=getContentPane();
        con.add(pnFlow);
    }
    public static void main(String[] args){
        new flowLayout("Demo FlowLayout");
    }
}
