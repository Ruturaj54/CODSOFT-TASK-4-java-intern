
package quizapplication;


import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;



public class LoginPageOfQuiz extends JFrame implements ActionListener
{
    JTextField TextBoxname,TextBoxRoll;
    JButton Next,Instructions,Exit;

    LoginPageOfQuiz()
    {
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setSize(1200,700);
        setLocation(220,180);
        

        ImageIcon Img1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.jpg"));
        JLabel image1 = new JLabel(Img1);      
        image1.setBounds(0,0,950,350);  
        add(image1); 
        ImageIcon Img2 = new ImageIcon(ClassLoader.getSystemResource("icons/light-bulb.jpg"));
        JLabel image2 = new JLabel(Img2);      
        image2.setBounds(950,0,250,350);   
        add(image2); 

        JLabel heading = new JLabel("ENJOY QUIZ !!! ");
        heading.setBounds(450,380,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));      
        add(heading);

        JLabel name = new JLabel("Enter Name Here : ");
        name.setBounds(100,450,300,30);
        name.setFont(new Font("Arial",Font.BOLD,30));   
        add(name);

        JLabel Roll = new JLabel("Enter Roll No : ");
        Roll.setBounds(100,500,300,30);
        Roll.setFont(new Font("Arial",Font.BOLD,30));
        add(Roll);

        TextBoxname = new JTextField();
        TextBoxname.setBounds(370, 450, 550, 40);
        TextBoxname.setFont(new Font("Arial",Font.BOLD,20));
        add(TextBoxname);

        TextBoxRoll = new JTextField();
        TextBoxRoll.setBounds(370,500,300,40);
        TextBoxRoll.setFont(new Font("Arial",Font.BOLD,20));
        add(TextBoxRoll);

        Instructions = new JButton("Instructions");
        Instructions.setFont(new Font("Arial",Font.BOLD,16));;
        Instructions.setBounds(350,580,150,30);
        Instructions.setForeground(Color.YELLOW);
        Instructions.setBackground(Color.blue);
        Instructions.addActionListener(this);
        add(Instructions);

        Exit = new JButton("Exit");
        Exit.setFont(new Font("Arial",Font.BOLD,16));
        Exit.setBounds(520,580,80,30);
        Exit.setForeground(Color.YELLOW);
        Exit.setBackground(Color.blue);
        Exit.addActionListener(this);
        add(Exit);

        Next = new JButton("Next");
        Next.setFont(new Font("Arial",Font.BOLD,16));
        Next.setBounds(620,580,80,30);
        Next.setForeground(Color.YELLOW);
        Next.setBackground(Color.blue);
        Next.addActionListener(this);
        add(Next);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == Instructions)
        {
            String name = TextBoxname.getText();
            String Rollno = TextBoxRoll.getText();
            setVisible(false);
            new QuizRules(name,Rollno);
        }
        else if(event.getSource() == Exit)
        {
            setVisible(false);
        }
        else if(event.getSource() == Next)
        {
            String name = TextBoxname.getText();
            String Rollno = TextBoxRoll.getText();
            setVisible(false);
            new QuizRules(name,Rollno);
        }
    }
    public static void main(String Args[])
    {
        new LoginPageOfQuiz();
    }
}
