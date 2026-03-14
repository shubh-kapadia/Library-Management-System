///class search 
package addressbook;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.lang.Long;

public class DeleRec
{
public DeleRec()
{
final JFrame jf = new JFrame("Delete");
jf.setSize(900,650);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.getContentPane().setLayout(null);

Font f1 = new Font("sansserif",Font.BOLD,24);
Label l3 = new Label("SHUBH'S ADDRESS BOOK");
l3.setBounds(150,10,800,40);
l3.setFont(f1);
jf.getContentPane().add(l3);

final TextArea ta = new TextArea();
ta.setBounds(10,150,850,450);
ta.setEditable(false);
jf.getContentPane().add(ta);

Label l1 = new Label("Search by Name : ");
l1.setBounds(10,50,100,30);
jf.getContentPane().add(l1);

final TextField tf1 = new TextField();
tf1.setBounds(150,50,150,30);
jf.getContentPane().add(tf1);

Label l2 = new Label("Search by Telephone No. : ");
l2.setBounds(350,50,150,30);
jf.getContentPane().add(l2);

final TextField tf2 = new TextField();
tf2.setBounds(500,50,150,30);
jf.getContentPane().add(tf2);

Button b1 = new Button("DELETE");
b1.setBounds(150,90,100,40);
b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
        try{
        	String s7,s,s6,s1,s3,s4,s0="1233";
                Date d;
                long s2,s5;
                s = tf1.getText();
                s6 = tf2.getText();
              	if(s6.equals(""))
                	s5 = Long.parseLong(s0);
                else
                	s5 = Long.parseLong(tf1.getText());
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		final Connection con = DriverManager.getConnection("jdbc:odbc:student","","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select*From addressb");
		while(rs.next()) {
			s1 = rs.getString(1);
			s2 = rs.getLong(2);
			s3 = rs.getString(3);
			s4 = rs.getString(4);
			d = rs.getDate(5);
			s7 = rs.getString(6);
			System.out.println("Got String");
			if((s1.equals(s)))//||(s2==s5))
				{
				System.out.println("string equal and Record Deleted");
				ta.append("\n " +s1+"   "+s2+"   "+s3+"   "+s4+"   "+d+"   "+s7+"\n");
				ta.append("\n Record Deleted ");
				PreparedStatement ps = con.prepareStatement("delete From addressb where Name = ?");
				ps.setString(1,s);
				int i = ps.executeUpdate();
				System.out.println("Row Deleted : " + i);
				//ResultSet rs2 = st.executeUpdate("Delete From addressb where Name=s");
				}//eoif
			}//eowhile
		}
		catch(Exception e1){System.out.println("ERROR ="+e1);}
	}
});

jf.getContentPane().add(b1);

Button b2 = new Button("ADD");
b2.setBounds(275,90,100,40);
b2.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       try{
			jf.setVisible(false);
                       	Add a = new Add();
                       }
                       catch(Exception e2){}
                       }
                       });

jf.getContentPane().add(b2);

Button b3 = new Button("Exit");
b3.setBounds(400,90,100,40);
b3.addActionListener(new ActionListener(){
                       public void actionPerformed(ActionEvent e2){
                       try{
                       System.exit(0);
                       }
                       catch(Exception e3){}
                       }
                       });
jf.getContentPane().add(b3);
jf.setVisible(true);
}
}
