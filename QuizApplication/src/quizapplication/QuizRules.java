
package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class QuizRules extends JFrame implements ActionListener
{
    String namex;
    String Rollnox;
    JButton back,start;
    QuizRules(String namex,String Rollnox)
    {
        this.namex = namex;
        this.Rollnox = Rollnox;
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setSize(1200,700);
        setLocation(220,180);
        
        JLabel Heading = new JLabel("*** WELCOME TO QUIZ ***");
        Heading.setBounds(400,30,700,40);
        Heading.setFont(new Font("Arial",Font.BOLD,30));
        Heading.setForeground(Color.BLUE);
        add(Heading);
        
        JLabel Heading1 = new JLabel("DEAR STUDENT : "+namex+" ("+Rollnox+") "+" PLEASE FOLLOW INSTRUCTIONS");
        Heading1.setBounds(100,100,800,25);
        Heading1.setFont(new Font("Arial",Font.BOLD,20));
        Heading1.setForeground(Color.BLACK);
        add(Heading1);
        
        JLabel instruction = new JLabel();
        instruction.setBounds(20,150,700,350);
        instruction.setFont(new Font("Tahoma",Font.PLAIN,16));
        instruction.setText(
                "<html>"+
                        "1. The student should not use his or her textbook, course notes, or receive help from a proctor or any other outside source." + "<br><br>" +
                        "2. Do not use mobiles,tabs,pcs, to cheat in exam we are watching every movement about you..." + "<br><br>" +
                        "3. Students must complete the 10-question multiple-choice Quiz within the 10-minute time frame allotted for the exam." + "<br><br>" +
                        "4. Each question needs to be answered within 1-minute time duration. Otherwise when timer ends, next question will be displayed." + "<br><br>" +
                        " Number of Questions: 10" + "<br><br>" +
                        " Exam Duration: 10 minutes" + "<br><br>" +
                        " All the Best !" + "<br><br>" +
                        "<html>"
        );
        add(instruction);
        
        back = new  JButton ("Back");         
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);         
        add(back);


        start = new  JButton ("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start){

            setVisible(false);
            new Quiz(namex);

        }else {
            setVisible(false);
            new LoginPageOfQuiz();
        }

    }
    public static void main(String Arg[])
    {
       new QuizRules("rrd","123");
    }
    
}
