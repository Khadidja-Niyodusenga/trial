package java_assignment;
import java.awt.*;
import java.awt.event.*;
public class PracticeAwt extends WindowAdapter implements ActionListener{
    Frame frame;
    MenuBar mB;
    Menu m1,m2,m3;
    MenuItem loginItem,studentItem;
    Panel p1,p2,p3,p4,p5;
    Label label;
   PracticeAwt(){
    frame=new Frame();
    mB=new MenuBar();
    m1=new Menu("Pages");
    m2=new Menu("Edit");
    m3=new Menu("Help");
    loginItem=new MenuItem("login");
     studentItem=new MenuItem("student");
     studentItem.addActionListener(this);
    label=new Label("EXAMPLE JAVA AWT LAYOUT");
    Label l=new Label("LOGIN PAGE");
Label lbl1=new Label("USername");
TextField tf1=new TextField();
Label lbl2=new Label("Password");
TextField tf2=new TextField();
Button btn1=new Button("LOGIN");
     p1=new Panel();
       p2=new Panel();
         p3=new Panel();
           p4=new Panel();
             p5=new Panel();
             frame.setMenuBar(mB);
             mB.add(m1);
              mB.add(m2);
               mB.add(m3);
               m1.add(loginItem);
               m1.add(studentItem);
       p1.add(label);
       p1.setBackground(Color.BLUE);
        p1.setForeground(Color.WHITE);
       p2.setBackground(Color.blue);
       p3.setBackground(Color.PINK);
       p4.setBackground(Color.PINK);
       p5.add(lbl1);
         p5.add(lbl2);
           p5.add(tf1);
           p5.add(tf2);
           p5.add(btn1);
           p5.setBackground(Color.LIGHT_GRAY);
      frame.add(p1,BorderLayout.NORTH);
      frame.add(p2,BorderLayout.SOUTH);
      frame.add(p3,BorderLayout.EAST);
      frame.add(p4,BorderLayout.WEST);
      frame.add(p5,BorderLayout.CENTER);
      frame.setSize(500, 300);
      frame.setTitle("AWT MENU Practice");
     frame.setVisible(true);
      frame.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
      System.exit(0);
      }
      });
    }
    public static void main(String[] args) {
        new PracticeAwt();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==studentItem){
   Label label1=new Label("FirstName");
 Label label2=new Label("LastName");
TextField txtfld1=new TextField();
TextField txtfld2=new TextField();
    }
    }
    
}
