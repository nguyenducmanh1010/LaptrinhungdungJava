/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author DucManh
 */
public class GiaiPTBac2 extends JFrame {

    public GiaiPTBac2(String title) {
        setSize(500, 340);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.LIGHT_GRAY);
        pnNorth.setPreferredSize(new Dimension(0, 40));
        pnBorder.add(pnNorth, BorderLayout.NORTH);

        JLabel ten = new JLabel("Giải phương trình bậc 2");
        pnNorth.add(ten);
        Font sizeten = new Font("Arial", Font.BOLD, 20);
        ten.setFont(sizeten);
        JPanel pnGroup = new JPanel();
        pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.Y_AXIS));
        Border centerborder = BorderFactory.createLineBorder(Color.RED);
        TitledBorder centerTitleBorder = new TitledBorder(centerborder, "nhập a,b,c:");
        pnGroup.setBorder(centerTitleBorder);
        pnBorder.add(pnGroup);

        JPanel pnSouth = new JPanel();
        Border eastborder = BorderFactory.createLineBorder(Color.BLUE);
        pnSouth.setPreferredSize(new Dimension(0, 40));
        TitledBorder eastTitleBorder = new TitledBorder(eastborder, "Chọn thao tác");
        pnSouth.setBorder(eastTitleBorder);
        pnBorder.add(pnSouth, BorderLayout.SOUTH);

        JButton btnGiai = new JButton("Giải");
        pnSouth.add(btnGiai);
        JButton btnXoaTrang = new JButton("Xóa trắng");
        pnSouth.add(btnXoaTrang);
        JButton btnThoat = new JButton("Thoát");
        pnSouth.add(btnThoat);
        pnSouth.setPreferredSize(new Dimension(0, 60));
        JPanel pna = new JPanel();
        JLabel lbla = new JLabel("a:");
        final JTextField txtSoa = new JTextField(15);
        pna.add(lbla);
        pna.add(txtSoa);
        pnGroup.add(pna);

        JPanel pnb = new JPanel();
        JLabel lblb = new JLabel("b:");
        final JTextField txtSob = new JTextField(15);
        pnb.add(lblb);
        pnb.add(txtSob);
        pnGroup.add(pnb);

        JPanel pnc = new JPanel();
        JLabel lblc = new JLabel("c:");
        final JTextField txtSoc = new JTextField(15);
        pnc.add(lblc);
        pnc.add(txtSoc);
        pnGroup.add(pnc);

        JPanel pnketqua = new JPanel();
        JLabel lblketqua = new JLabel("Kết quả");
        pnketqua.add(lblketqua);
        pnGroup.add(pnketqua);

        JPanel pnketqua1 = new JPanel();
        final JTextField txtketqua1 = new JTextField(20);
        pnketqua1.add(txtketqua1);
        pnGroup.add(pnketqua1);
        getContentPane().add(pnBorder);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new GiaiPTBac2("");
        //new tinhtoan("");
    }
}
