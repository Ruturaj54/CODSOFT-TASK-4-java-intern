
package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements ActionListener 
{

    Result(String name, int score)
    {

        setBounds(400, 150,750, 550);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/result.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);     
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        setVisible(true);


        JLabel heading = new JLabel("Thank You " + name + " for taking Our Technical Quiz");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Arial", Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score +"/ 100");
        lblscore.setBounds(350,200,400,30);
        lblscore.setFont(new Font("Arial", Font.BOLD,30));
        add(lblscore);


        JButton submit = new JButton("Try Once More");
        submit.setBounds(380,270,120,40);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);

    }


    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new LoginPageOfQuiz();

    }

    public static void main(String[] args) 
    {

        new Result("User", 0);        
    }
}

