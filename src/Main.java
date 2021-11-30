import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        frame f = new frame();

    }
}
class frame implements ActionListener {
    JButton b1;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JFrame f;
    JPEGImageReadParam i1;

    PrintStream Output = new PrintStream("C:\\Users\\acer292\\Desktop\\Output\\Output.txt");

    public frame() throws FileNotFoundException {
        f = new JFrame();

        l1 = new JLabel();
        l1.setBounds(350, 50, 100, 50);
        l1.setText("أدخل الإسم: ");
        l1.setForeground(Color.blue);

        t1 = new JTextField();
        t1.setBounds(50, 50, 250, 50);



        l2 = new JLabel();
        l2.setBounds(350, 150, 100, 50);
        l2.setText("أدخل العمر: ");
        l2.setForeground(Color.blue);

        t2 = new JTextField();
        t2.setBounds(50, 150, 250, 50);



        l3 = new JLabel();
        l3.setBounds(350, 250, 100, 50);
        l3.setText("أدخل المهنة: ");
        l3.setForeground(Color.blue);

        t3 = new JTextField();
        t3.setBounds(50, 250, 250, 50);


        l4=new JLabel();
        l4.setBounds(50,420,400,30);
        l4.setForeground(Color.green);

        l5=new JLabel();
        l5.setBounds(50,460,400,30);
        l5.setForeground(Color.green);

        l6=new JLabel();
        l6.setBounds(50,500,400,30);
        l6.setForeground(Color.green);

        l7=new JLabel();
        l7.setBounds(350,500,100,30);
        l7.setForeground(Color.red);


        b1 = new JButton("Click here to save this");
        b1.setBounds(100, 350, 300, 50);
        b1.addActionListener(this);




        f.add(b1);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);

        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Person p1 = new Person();
            p1.setName(t1.getText());
            if (t2.getText() == "") {
                t2.setText("1");
            }
            int x = Integer.parseInt(t2.getText());
            p1.setAge(x);
            p1.setJob(t3.getText());


            l4.setText("Name: " + t1.getText());

            l5.setText("Age: " + t2.getText());

            l6.setText("Job: " + t3.getText());

            l7.setText("Saved");


            Output.println("Name: " + t1.getText());
            Output.println("Age: " + t2.getText());
            Output.println("Job: " + t3.getText());
            Output.println("______________________________________");
        }catch (NumberFormatException e1){
            l4.setText("Enter True Values");
            l5.setText("Enter True Values");
            l6.setText("Enter True Values");
            l7.setText("not saved");
        }
    }
}
