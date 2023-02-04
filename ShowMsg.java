/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ShowMsg extends JDialog implements ActionListener
{
    JButton bt;
    public ShowMsg(String msg)
    {
        this.setLayout(new FlowLayout());
        JLabel lb=new JLabel(msg);
        bt=new JButton("Ok");
        bt.addActionListener(this);
        add(lb);
        add(bt);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt)
        {
            this.setVisible(false);
        }
    }
    public static void main(String args[])
    {
        ShowMsg sm=new ShowMsg("Hi");
        sm.setSize(200,200);
        sm.setVisible(true);
    }
}
