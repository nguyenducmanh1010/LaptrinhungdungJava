/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
/**
 *
 * @author DucManh
 */
public class borderLayout extends JFrame {
    public borderLayout(String title){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnBorder=new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth=new JPanel();
        pnNorth.setBackground(Color.red);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnSouth=new JPanel();
        pnSouth.setBackground(Color.red);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest=new JPanel();
        pnWest.setBackground(Color.blue);
        pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.blue);
        pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.yellow);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        pnNorth.setPreferredSize(new Dimension(0, 40));
        pnSouth.setPreferredSize(new Dimension(0, 40));
        pnEast.setPreferredSize(new Dimension(40, 0));
        pnWest.setPreferredSize(new Dimension(40, 0));
        getContentPane().add(pnBorder);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new borderLayout("BorderLayout");
    }
}
