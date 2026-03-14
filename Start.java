//class start
package addressbook;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import address.*;

public class Start
{
public Start() throws Exception
{
Button b1,b2,b3,b4;
final JFrame jf;

jf = new JFrame("START");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(600,500);
jf.getContentPane().setLayout(null);

Font f1 = new Font("sansserif",Font.BOLD,24);
Label l3 = new Label("SUBH'S ADDRESS BOOK");
l3.setBounds(150,10,800,40);
l3.setFont(f1);
jf.getContentPane().add(l3);

b1 = new Button("ADD");
b1.setBounds(250,150,100,40);
b1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                      try{
			jf.setVisible(false);
                     	Add a = new Add();
                     	}
                     catch(Exception e2){}
                     }
                     });
b2 = new Button("SEARCH");
b2.setBounds(250,100,100,40);
b2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e1){
                      try{
                     	jf.setVisible(false);
			Search b = new Search();
                     	}
                     catch(Exception e3){}
                     }
                     });

b4 = new Button("DELETE");
b4.setBounds(250,200,100,40);
b4.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e1){
                      try{
                     	jf.setVisible(false);
			DeleRec b = new DeleRec();
                     	}
                     catch(Exception e3){}
                     }
                     });

b3 = new Button("CLOSE");
b3.setBounds(250,250,100,40);
b3.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent e)
{
try{
System.exit(0);
}
catch(Exception e1){System.out.println("ERROR 1"+e1);}
}
});

jf.getContentPane().add(b1);
jf.getContentPane().add(b2);
jf.getContentPane().add(b3);
jf.getContentPane().add(b4);

jf.setVisible(true);
}
}
