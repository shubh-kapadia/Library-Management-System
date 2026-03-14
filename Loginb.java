package addressbook;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Loginb
{
public static void main(String arg[])
{
try{
final TextField tf1,tf2;
Label l1,l2,l3;
Button b1,b2;

final JFrame f = new JFrame("Shubh's Address Book");

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500,500);
f.getContentPane().setLayout(null);

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
final Connection con = DriverManager.getConnection("jdbc:odbc:student","","");//student is the(data source name)
/*producere:go to cntrlpanel,then select administrative services,then select or add the dsn.*/

final Statement st = con.createStatement();

Font f1 = new Font("sansserif",Font.BOLD,24);
l3 = new Label("SHUBH'S ADDRESS BOOK");
l3.setBounds(75,10,800,40);
l3.setFont(f1);
f.getContentPane().add(l3);

l1=new Label("USER NAME : ");
l1.setBounds(100,200,100,30);
f.getContentPane().add(l1);

tf1 = new TextField();
tf1.setBounds(200,200,100,30);
f.getContentPane().add(tf1);

l2 = new Label("PASSWORD:");
l2.setBounds(100,250,100,30);
f.getContentPane().add(l2);

tf2 = new TextField();
tf2.setEchoChar('*');
tf2.setBounds(200,250,100,30);
f.getContentPane().add(tf2);

b1 = new Button("LOGIN");
b1.setBounds(150,350,50,30);
f.getContentPane().add(b1);

b1.addActionListener( new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{
String s1 = tf1.getText();
String s2 = tf2.getText();
System.out.println("Got data");
ResultSet rs = st.executeQuery("Select * from login");
System.out.println("Table select");

while(rs.next())
{
String s3 = rs.getString(1);
String s4 = rs.getString(2);
System.out.println("Data entered"+s1+"   "+s2);
System.out.println("Inside while"+s3+"   "+s4);

if(s3.equals(s1) && s4.equals(s2))
{
try{
f.setVisible(false);
Start s = new Start();
}
catch(Exception e3){}
}
}
tf1.setText("");
tf2.setText("");
}
catch(Exception e1){System.out.println("ERROR 1"+e1);}
}
});

b2 = new Button("CLOSE");
b2.setBounds(250,350,50,30);
f.getContentPane().add(b2);

b2.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent e)
{
try{
System.exit(0);
}
catch(Exception e1){System.out.println("ERROR 1"+e1);}
}
});
f.setVisible(true);
}
catch(Exception e2){System.out.println("ERROR 2"+e2);}
}
}

