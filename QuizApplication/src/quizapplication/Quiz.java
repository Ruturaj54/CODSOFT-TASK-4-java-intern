
package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];       //2D array to store questions, 10 questions and 5 rows
    String answers[][] = new String[10][2];     //2D aaray to store answers

    String useranswers[][]= new String[10][1];  // for tracking answers of users

    JLabel qno, question;

    JRadioButton opt1, opt2, opt3, opt4;

    public static int timer = 59;       //For timer 59sec

    public static  int ans_given = 0;

    public static int count = 0;

    ButtonGroup groupoptions;

    JButton next,submit;
    String name;

    public  static  int score =0;
    Quiz(String name){
        this.name = name;
        

        getContentPane().setBackground(Color.WHITE);
        setSize(1440,850);
        setLocation(220,180);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz2.jpg"));
       
        JLabel image = new JLabel(i1); 
        image.setSize(800,400);
        image.setBounds(0,0,1440,392);
        add(image);

        setVisible(true);


        qno = new JLabel();              
        qno.setBounds(100,450,50,30);
        qno.setFont(new Font("Tahoma", Font.PLAIN,24));
        add(qno);

        question = new JLabel();     
        question.setBounds(150,450,900,30);
        question.setFont(new Font("Tahoma", Font.PLAIN,24));
        add(question);


        questions[0][0] = "Who is the Creater of C language ? ";
        questions[0][1] = "Bjarne Stroustup";
        questions[0][2] = "Dennis Ritche";
        questions[0][3] = "Mark Kerninghan";
        questions[0][4] = "Jems Thompson";

        questions[1][0] = "Which Languge is called as the Pure Object Oriented programming Language?";
        questions[1][1] = "C";
        questions[1][2] = "C++";
        questions[1][3] = "Java";
        questions[1][4] = "Python";

        questions[2][0] = "What is use of this pointer in c++?";
        questions[2][1] = "To create new object";
        questions[2][2] = "To share the address of Object to constructor";
        questions[2][3] = "To Remove the Compiler errors";
        questions[2][4] = "To activate the printf and scanf functions";

        questions[3][0] = "Which package includes Scanner class in java?";
        questions[3][1] = "java.utils";
        questions[3][2] = "javax.swing";
        questions[3][3] = "java.awt.*";
        questions[3][4] = "java.lang";

        questions[4][0] = "Which Organization is Good for freshers for Job?";
        questions[4][1] = "Microsoft";
        questions[4][2] = "CodSoft";
        questions[4][3] = "Google";
        questions[4][4] = "Amazon";

        questions[5][0] = "Which symbol is used to call destructor in c++?";
        questions[5][1] = "`";
        questions[5][2] = "!";
        questions[5][3] = "~";
        questions[5][4] = "#";

        questions[6][0] = "What is meaning of System.in in java?";
        questions[6][1] = "import";
        questions[6][2] = "input device initialization";
        questions[6][3] = "Output device initialization";
        questions[6][4] = "export";

        questions[7][0] = "Which organization is current owner of java language?";
        questions[7][1] = "Sun microsystems";
        questions[7][2] = "Oracle";
        questions[7][3] = "Google";
        questions[7][4] = "Microsoft";

        questions[8][0] = "Artificial Intelligence is about?";
        questions[8][1] = "Playing a game on Computer";
        questions[8][2] = "Making a machine Intelligent";
        questions[8][3] = "Programming on Machine with your Own Intelligence";
        questions[8][4] = "Putting your intelligence in Machine";

        questions[9][0] = "Who is known as the -Father of AI ?";
        questions[9][1] = "Fisher Ada";
        questions[9][2] = "Alan Turing";
        questions[9][3] = "John McCarthy";
        questions[9][4] = "Allen Newell";



        answers[0][1] = "Bjarne Stroustup";
        answers[1][1] = "Java";
        answers[2][1] = "To share the address of Object to constructor";
        answers[3][1] = "java.utils";
        answers[4][1] = "CodSoft";
        answers[5][1] = "~";
        answers[6][1] = "input device initialization";
        answers[7][1] = "Oracle";
        answers[8][1] = "Making a machine Intelligent";
        answers[9][1] = "Alan Turing";


        opt1 = new JRadioButton();                             
        opt1.setBounds(170,520,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170,560,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);


        opt3 = new JRadioButton();
        opt3.setBounds(170,600,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);


        opt4 = new JRadioButton();
        opt4.setBounds(170,640,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);

        groupoptions = new ButtonGroup(); 
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);


        next = new JButton("Next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);       
        add(next);



        submit = new JButton("Submit");
        submit.setBounds(1100,710,200,40);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);       
        submit.addActionListener(this);
        add(submit);


        start(count);       


    }

    public void actionPerformed (ActionEvent ae){

        if(ae.getSource() == next)
        {        
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);


            ans_given = 1;
            if(groupoptions.getSelection() == null ) 
            {     
                useranswers[count][0] = "";            
            }
            else
            {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();   
            }


            if(count == 8)
            {                 
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        }
        
        else if (ae.getSource() == submit)
        {
                ans_given = 1;

            if(groupoptions.getSelection() == null)
            {
                useranswers[count][0] = "";
            }
            else 
            {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for(int i=0; i < useranswers.length;i++)
            {
                if(useranswers[i][0].equals(answers[i][1]))
                {
                    score = score + 10;
                }
                else 
                {
                    score = score + 0;
                }
            }

            setVisible(false);

            new Result(name, score);     

        }

    }


    public void paint(Graphics g)
    {       
        super.paint(g);

        String time = "Time left -  " + timer + " seconds";          
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD,25));

        if(timer > 0){
            g.drawString(time, 1100, 500);
        }else {
            g.drawString("Times Up!!", 1100, 500);      
        }

        timer--;            

        try {                   
            Thread.sleep(1000);             
            repaint();                      
        }catch (Exception e){
            e.printStackTrace();
        }


        if(ans_given == 1)
        {         
            ans_given = 0;      
            timer = 59;         
        } 
        else if (timer < 0) 
        {
            timer = 59;
            opt1.setEnabled(true);      
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);


            if(count == 8)
            {             
                next.setEnabled(false);
                submit.setEnabled(false);
            }

            if(count == 9)
            {         

                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";         
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();     
                }

                for(int i=0; i < useranswers.length;i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score +=10;
                    }else {
                        score += 0;
                    }
                }
                setVisible(false);

                //Score
                new Result(name, score);


            }
            else 
            {   

                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";        
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();     
                }
                count++;   
                start(count);     
            }
        }

    }
    public void start (int count)
    {
        qno.setText("" + (count + 1) + ". ");         
        question.setText(questions[count][0]);      
        opt1.setText(questions[count][1]);             
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();      
    }

    public static void main(String[] args) {

        new Quiz("User");
    }
}
