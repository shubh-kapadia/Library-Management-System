//class add
package addressbook;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Add
{
public Add() throws Exception
{
final TextField tf1,tf2,tf3,tf4,tf5,tf6;
Label l1,l2,l3,l4,l5,l6,l7;
Button b1,b2,b3;
final JFrame f;

f= new JFrame("SHUBH'S ADDRESS BOOK");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(600,600);
f.getContentPane().setLayout(null);

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
final Connection con = DriverManager.getConnection("jdbc:odbc:student","","");

Font f1 = new Font("sansserif",Font.BOLD,30);

l6 = new Label("SHUBH'S ADDRESS BOOK");
l6.setBounds(100,10,800,40);
l6.setFont(f1);
f.getContentPane().add(l6);

l1 = new Label("NAME:");
l1.setBounds(100,150,100,30);
f.getContentPane().add(l1);

tf1 = new TextField();
tf1.setBounds(200,150,100,30);
f.getContentPane().add(tf1);

l2 = new Label("PHONE NO:");
l2.setBounds(100,300,100,30);
f.getContentPane().add(l2);

tf2 = new TextField();
tf2.setBounds(200,300,100,30);
f.getContentPane().add(tf2);

l3 = new Label("Address:");
l3.setBounds(100,250,100,30);
f.getContentPane().add(l3);

tf3 = new TextField();
tf3.setBounds(200,250,100,30);
f.getContentPane().add(tf3);

l4 = new Label("Email id:");
l4.setBounds(325,300,75,30);
f.getContentPane().add(l4);

tf4 = new TextField();
tf4.setBounds(400,300,150,30);
f.getContentPane().add(tf4);

l5 = new Label("Birth date:");
l5.setBounds(100,200,100,30);
f.getContentPane().add(l5);

tf5 = new TextField();
tf5.setBounds(200,200,100,30);
f.getContentPane().add(tf5);

l7 = new Label("City :");
l7.setBounds(325,250,75,30);
f.getContentPane().add(l7);

tf6 = new TextField();
tf6.setBounds(400,250,150,30);
f.getContentPane().add(tf6);


b1 = new Button("ENTER");
b1.setBounds(100,400,100,40);
b1.addActionListener( new ActionListener()
                    {public void actionPerformed(ActionEvent e){
                      	try{
                     	String s1,s2,s3,s4,s5,s6;
                     	s1 = tf1.getText();
                     	s2 = tf2.getText(); 
                     	s3 = tf3.getText();
                     	s4 = tf4.getText();
                     	s5 = tf5.getText();
			s6 = tf6.getText();
		PreparedStatement ps = con.prepareStatement("insert into addressb values(?,?,?,?,?,?)");
		ps.setString(1,s1);
		ps.setString(2,s2);
		ps.setString(3,s3);
		ps.setString(4,s4);
		ps.setString(5,s5);
		ps.setString(6,s6);
		int i = ps.executeUpdate();
		System.out.println("Row Updated : " + i);
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		}
catch(Exception e1){System.out.println("ERROR:"+e1);}
}
});

f.getContentPane().add(b1);

b2 = new Button("SEARCH");
b2.setBounds(225,400,100,40);
b2.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e2){
                     try{
			f.setVisible(false);
                     	Search b = new Search();
                     	}
                     catch(Exception e3){}
                     }
                     });
f.getContentPane().add(b2);

b3 = new Button("EXIT");
b3.setBounds(350,400,100,40);
b3.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e2){
                     try{
                     System.exit(0);
                     }
                     catch(Exception e3){}
                     }
                     });
f.getContentPane().add(b3);

f.setVisible(true);
}
}
