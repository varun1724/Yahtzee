import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class GameScore extends JPanel implements MouseListener {

    private int dice1 = 0;
    private int dice2 = 0;
    private int dice3 = 0;
    private int dice4 = 0;
    private int dice5 = 0;

    private int rollsLeft = 3;
    private int sum = 0;
    private int total = 0;
    private int curPlayer = 1; // 1 is Player 1, -1 is player 2

    private boolean dice1Lock = false; // Locks for the dice
    private boolean dice2Lock = false;
    private boolean dice3Lock = false;
    private boolean dice4Lock = false;
    private boolean dice5Lock = false;

    JButton roll = new JButton("Roll"); // Adds the buttons to roll and lock dice
    JButton lock1 = new JButton("Lock");
    JButton lock2 = new JButton("Lock");
    JButton lock3 = new JButton("Lock");
    JButton lock4 = new JButton("Lock");
    JButton lock5 = new JButton("Lock");

    private Color color1 = Color.WHITE; // Starting background colors for the dice
    private Color color2 = Color.WHITE;
    private Color color3 = Color.WHITE;
    private Color color4 = Color.WHITE;
    private Color color5 = Color.WHITE;

    private JButton p1Ones = new JButton(); // Adds all of the buttons
    private JButton p2Ones = new JButton();
    private JButton p1Twos = new JButton();
    private JButton p2Twos = new JButton();
    private JButton p1Threes = new JButton();
    private JButton p2Threes = new JButton();
    private JButton p1Fours = new JButton();
    private JButton p2Fours = new JButton();
    private JButton p1Fives = new JButton();
    private JButton p2Fives = new JButton();
    private JButton p1Sixes = new JButton();
    private JButton p2Sixes = new JButton();
    private JButton p1Sum = new JButton();
    private JButton p2Sum = new JButton();
    private JButton p1Bonus = new JButton();
    private JButton p2Bonus = new JButton();
    private JButton p1TOK = new JButton();
    private JButton p2TOK = new JButton();
    private JButton p1FOK = new JButton();
    private JButton p2FOK = new JButton();
    private JButton p1FH = new JButton();
    private JButton p2FH = new JButton();
    private JButton p1SS = new JButton();
    private JButton p2SS = new JButton();
    private JButton p1BS = new JButton();
    private JButton p2BS = new JButton();
    private JButton p1Chance = new JButton();
    private JButton p2Chance = new JButton();
    private JButton p1Yahtzee = new JButton();
    private JButton p2Yahtzee = new JButton();
    private JButton p1Total = new JButton();
    private JButton p2Total = new JButton();

    private boolean p1OnesPressed = false; // Adds all of the buttons
    private boolean p2OnesPressed = false;
    private boolean p1TwosPressed = false;
    private boolean p2TwosPressed = false ;
    private boolean p1ThreesPressed = false;  
    private boolean p2ThreesPressed = false; 
    private boolean p1FoursPressed = false;
    private boolean p2FoursPressed = false;
    private boolean p1FivesPressed = false;
    private boolean p2FivesPressed = false;
    private boolean p1SixesPressed = false; 
    private boolean p2SixesPressed = false; 
    private boolean p1TOKPressed = false;
    private boolean p2TOKPressed = false;
    private boolean p1FOKPressed = false;
    private boolean p2FOKPressed = false;
    private boolean p1FHPressed = false;
    private boolean p2FHPressed = false;
    private boolean p1SSPressed = false;
    private boolean p2SSPressed = false; 
    private boolean p1BSPressed = false;
    private boolean p2BSPressed = false; 
    private boolean p1ChancePressed = false;
    private boolean p2ChancePressed = false;
    private boolean p1YahtzeePressed = false; 
    private boolean p2YahtzeePressed = false; 

    private String Ones = "Ones:"; // Strings used to describe scoring possibilities
    private String Twos = "Twos:";
    private String Threes = "Threes:";
    private String Fours = "Fours:";
    private String Fives = "Fives:";
    private String Sixes = "Sixes:";
    private String Sum = "Sum:";
    private String Bonus = "Bonus:";
    private String TOK = "Three of a Kind:";
    private String FOK = "Four of a Kind:";
    private String FH = "Full House:";
    private String SS = "Small Straight:";
    private String BS = "Big Straight:";
    private String Chance = "Chance:";
    private String Yahtzee = "Yahtzee:";
    private String P1 = "P1:";
    private String P2 = "P2:";
    private String Total = "Total:";

    private int p1OneValue = 0; // Keeps track of the score 
    private int p2OneValue = 0;
    private int p1TwoValue = 0;
    private int p2TwoValue = 0;
    private int p1ThreeValue = 0;
    private int p2ThreeValue = 0;
    private int p1FourValue = 0;
    private int p2FourValue = 0;
    private int p1FiveValue = 0;
    private int p2FiveValue = 0;
    private int p1SixValue = 0;
    private int p2SixValue = 0;
    private int p1TOKValue = 0;
    private int p2TOKValue = 0;
    private int p1FOKValue = 0;
    private int p2FOKValue = 0;
    private int p1FHValue = 0;
    private int p2FHValue = 0;
    private int p1SSValue = 0;
    private int p2SSValue = 0;
    private int p1BSValue = 0;
    private int p2BSValue = 0;
    private int p1ChanceValue = 0;
    private int p2ChanceValue = 0;
    private int p1YahtzeeValue = 0;
    private int p2YahtzeeValue = 0;

    // Constructor
    public GameScore() 
    {
        roll.addMouseListener(this); // Adds all  buttons and mouse listeners needed
        lock1.addMouseListener(this);
        lock2.addMouseListener(this);
        lock3.addMouseListener(this);
        lock4.addMouseListener(this);
        lock5.addMouseListener(this);
        p1Ones.addMouseListener(this);
        p1Twos.addMouseListener(this);
        p1Threes.addMouseListener(this);
        p1Fours.addMouseListener(this);
        p1Fives.addMouseListener(this);
        p1Sixes.addMouseListener(this);
        p1TOK.addMouseListener(this);
        p1FOK.addMouseListener(this);
        p1FH.addMouseListener(this);
        p1SS.addMouseListener(this);
        p1BS.addMouseListener(this);
        p1Chance.addMouseListener(this);
        p1Yahtzee.addMouseListener(this);

        p2Ones.addMouseListener(this);
        p2Twos.addMouseListener(this);
        p2Threes.addMouseListener(this);
        p2Fours.addMouseListener(this);
        p2Fives.addMouseListener(this);
        p2Sixes.addMouseListener(this);
        p2TOK.addMouseListener(this);
        p2FOK.addMouseListener(this);
        p2FH.addMouseListener(this);
        p2SS.addMouseListener(this);
        p2BS.addMouseListener(this);
        p2Chance.addMouseListener(this);
        p2Yahtzee.addMouseListener(this);

        p1Sum.setEnabled(false);
        p2Sum.setEnabled(false);
        p1Bonus.setEnabled(false);
        p2Bonus.setEnabled(false);
        p1Total.setEnabled(false);
        p2Total.setEnabled(false);

        p2Ones.setEnabled(false);
        p2Twos.setEnabled(false);
        p2Threes.setEnabled(false);
        p2Fours.setEnabled(false);
        p2Fives.setEnabled(false);
        p2Sixes.setEnabled(false);
        p2TOK.setEnabled(false);
        p2FOK.setEnabled(false);
        p2FH.setEnabled(false);
        p2SS.setEnabled(false);
        p2BS.setEnabled(false);
        p2Chance.setEnabled(false);
        p2Yahtzee.setEnabled(false);
        add(p1Ones);
        add(p2Ones);
        add(p1Twos);
        add(p2Twos);
        add(p1Threes);
        add(p2Threes);
        add(p1Fours);
        add(p2Fours);
        add(p1Fives);
        add(p2Fives);
        add(p1Sixes);
        add(p2Sixes);
        add(p1Sum);
        add(p2Sum);
        add(p1Bonus);
        add(p2Bonus);
        add(p1TOK);
        add(p2TOK);
        add(p1FOK);
        add(p2FOK);
        add(p1FH);
        add(p2FH);
        add(p1SS);
        add(p2SS);
        add(p1BS);
        add(p2BS);
        add(p1Chance);
        add(p2Chance);
        add(p1Yahtzee);
        add(p2Yahtzee);	
        add(p1Total);
        add(p2Total);
    }

    public void paintComponent(Graphics g) {

        super.paintComponents(g);

        int screenWidth = getWidth(); // Sets up scalable dimensions
        int screenHeight = getHeight();
        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;

        g.setColor(Color.LIGHT_GRAY); // Clears the screen everytime before adding new buttons
        g.fillRect(0, 0, screenWidth, screenHeight);

        int xCorner = xCenter + xCenter/2; // Corners used for the table
        int yCorner = yCenter - yCenter/2 - yCenter/4 - yCenter/8;
        int widthTable = xCenter/4 + xCenter/8 + xCenter/16;
        int heightTable = yCenter + yCenter/2 + yCenter/4 + yCenter/16;

        g.setColor(Color.GREEN);
        g.fillRect(xCorner, yCorner, widthTable, heightTable + yCenter/32);

        g.setColor(Color.BLACK);
        g.fillRect(xCorner + xCenter/4, yCorner, 2, heightTable);
        g.fillRect(xCorner + xCenter/4 + xCenter/10, yCorner, 2, heightTable);

        g.fillRect(xCorner, yCorner + (yCorner * 7)/8 - 1, widthTable, 1); // Adds the rectangles in the scoreboard
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*2 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*3 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*4 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*5 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*6 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*7 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*8 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*9 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*10 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*11 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*12 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*13 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*14 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*15 - 1, widthTable, 1);
        g.fillRect(xCorner, yCorner + ((yCorner * 7)/8)*16 - 1, widthTable, 1);

        p1Twos.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*2, xCenter/10, yCenter/10); // Adds the buttons on the scoreboard
        p2Twos.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*2, xCenter/12, yCenter/10);
        p1Ones.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8), xCenter/10, yCenter/10);
        p2Ones.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8), xCenter/12, yCenter/10);
        p1Threes.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*3, xCenter/10, yCenter/10);
        p2Threes.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*3, xCenter/12, yCenter/10);
        p1Fours.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*4, xCenter/10, yCenter/10);
        p2Fours.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*4, xCenter/12, yCenter/10);
        p1Fives.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*5, xCenter/10, yCenter/10);
        p2Fives.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*5, xCenter/12, yCenter/10);
        p1Sixes.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*6, xCenter/10, yCenter/10);
        p2Sixes.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*6, xCenter/12, yCenter/10);
        p1Sum.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*7, xCenter/10, yCenter/10);
        p2Sum.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*7, xCenter/12, yCenter/10);
        p1Bonus.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*8, xCenter/10, yCenter/10);
        p2Bonus.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*8, xCenter/12, yCenter/10);
        p1TOK.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*9, xCenter/10, yCenter/10);
        p2TOK.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*9, xCenter/12, yCenter/10);
        p1FOK.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*10, xCenter/10, yCenter/10);
        p2FOK.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*10, xCenter/12, yCenter/10);
        p1FH.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*11, xCenter/10, yCenter/10);
        p2FH.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*11, xCenter/12, yCenter/10);
        p1SS.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*12, xCenter/10, yCenter/10);
        p2SS.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*12, xCenter/12, yCenter/10);
        p1BS.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*13, xCenter/10, yCenter/10);
        p2BS.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*13, xCenter/12, yCenter/10);
        p1Chance.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*14, xCenter/10, yCenter/10);
        p2Chance.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*14, xCenter/12, yCenter/10);
        p1Yahtzee.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*15, xCenter/10, yCenter/10);
        p2Yahtzee.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*15, xCenter/12, yCenter/10);	
        p1Total.setBounds(xCorner + xCenter/4 + 1, yCorner + ((yCorner * 7)/8)*16, xCenter/10, yCenter/10);
        p2Total.setBounds(xCorner + xCenter/4 + xCenter/10 + 2, yCorner + ((yCorner * 7)/8)*16, xCenter/12, yCenter/10);

        Font myFont = new Font("Serif", Font.BOLD, heightTable/30); // Sets the font used for the score names
        g.setFont(myFont);

        g.drawString(Ones, xCorner, yCorner + ((yCorner * 7)/8)*2 - 1 - yCenter/32); // Adds the names of the different possible scores
        g.drawString(Twos, xCorner, yCorner + ((yCorner * 7)/8)*3 - 1 - yCenter/32);
        g.drawString(Threes, xCorner, yCorner + ((yCorner * 7)/8)*4 - 1 - yCenter/32);
        g.drawString(Fours, xCorner, yCorner + ((yCorner * 7)/8)*5 - 1 - yCenter/32);
        g.drawString(Fives, xCorner, yCorner + ((yCorner * 7)/8)*6 - 1 - yCenter/32);
        g.drawString(Sixes, xCorner, yCorner + ((yCorner * 7)/8)*7 - 1 - yCenter/32);
        g.drawString(Sum, xCorner, yCorner + ((yCorner * 7)/8)*8 - 1 - yCenter/32);
        g.drawString(Bonus, xCorner, yCorner + ((yCorner * 7)/8)*9 - 1 - yCenter/32);
        g.drawString(TOK, xCorner, yCorner + ((yCorner * 7)/8)*10 - 1 - yCenter/32);
        g.drawString(FOK, xCorner, yCorner + ((yCorner * 7)/8)*11 - 1 - yCenter/32);
        g.drawString(FH, xCorner, yCorner + ((yCorner * 7)/8)*12 - 1 - yCenter/32);
        g.drawString(SS, xCorner, yCorner + ((yCorner * 7)/8)*13 - 1 - yCenter/32);
        g.drawString(BS, xCorner, yCorner + ((yCorner * 7)/8)*14 - 1 - yCenter/32);
        g.drawString(Chance, xCorner, yCorner + ((yCorner * 7)/8)*15 - 1 - yCenter/32);
        g.drawString(Yahtzee, xCorner, yCorner + ((yCorner * 7)/8)*16 - 1 - yCenter/32);
        g.drawString(P1, xCorner + xCenter/4 + xCenter/32, yCorner + yCenter/16);
        g.drawString(P2, xCorner + xCenter/4 + xCenter/10 + xCenter/32, yCorner + yCenter/16);
        g.drawString(Total, xCorner, yCorner + ((yCorner * 7)/8)*17 - 3 - yCenter/32);

        String p1Value = p1OneValue + ""; 
        if (!p1OnesPressed)
        {
            p1Ones.setFont(myFont);
            p1Ones.setText(p1Value);
        }
        if (!p1TwosPressed)
        {
            p1Value = p1TwoValue + "";
            p1Twos.setFont(myFont);
            p1Twos.setText(p1Value);
        }
        if (!p1ThreesPressed)
        {
            p1Value = p1ThreeValue + "";
            p1Threes.setFont(myFont);
            p1Threes.setText(p1Value);
        }
        if (!p1FoursPressed)
        {
            p1Value = p1FourValue + "";
            p1Fours.setFont(myFont);
            p1Fours.setText(p1Value);
        }
        if (!p1FivesPressed)
        {
            p1Value = p1FiveValue + "";
            p1Fives.setFont(myFont);
            p1Fives.setText(p1Value);
        }
        if (!p1SixesPressed)
        {
            p1Value = p1SixValue + "";
            p1Sixes.setFont(myFont);
            p1Sixes.setText(p1Value);
        }
        if (!p1TOKPressed)
        {
            p1Value = p1TOKValue + "";
            p1TOK.setFont(myFont);
            p1TOK.setText(p1Value);
        }
        if (!p1FOKPressed)
        {
            p1Value = p1FOKValue + "";
            p1FOK.setFont(myFont);
            p1FOK.setText(p1Value);
        }
        if (!p1FHPressed)
        {
            p1Value = p1FHValue + "";
            p1FH.setFont(myFont);
            p1FH.setText(p1Value);
        }
        if (!p1SSPressed)
        {
            p1Value = p1SSValue + "";
            p1SS.setFont(myFont);
            p1SS.setText(p1Value);
        }
        if (!p1BSPressed)
        {
            p1Value = p1BSValue + "";
            p1BS.setFont(myFont);
            p1BS.setText(p1Value);
        }
        if (!p1ChancePressed)
        {
            p1Value = p1ChanceValue + "";
            p1Chance.setFont(myFont);
            p1Chance.setText(p1Value);
        }
        if (!p1YahtzeePressed)
        {
            p1Value = p1YahtzeeValue + "";
            p1Yahtzee.setFont(myFont);
            p1Yahtzee.setText(p1Value);
        }
        String p2Value = p2OneValue + ""; 
        if (!p2OnesPressed)
        {
            p2Ones.setFont(myFont);
            p2Ones.setText(p2Value);
        }
        if (!p2TwosPressed)
        {
            p2Value = p2TwoValue + "";
            p2Twos.setFont(myFont);
            p2Twos.setText(p2Value);
        }
        if (!p2ThreesPressed)
        {
            p2Value = p2ThreeValue + "";
            p2Threes.setFont(myFont);
            p2Threes.setText(p2Value);
        }
        if (!p2FoursPressed)
        {
            p2Value = p2FourValue + "";
            p2Fours.setFont(myFont);
            p2Fours.setText(p2Value);
        }
        if (!p2FivesPressed)
        {
            p2Value = p2FiveValue + "";
            p2Fives.setFont(myFont);
            p2Fives.setText(p2Value);
        }
        if (!p2SixesPressed)
        {
            p2Value = p2SixValue + "";
            p2Sixes.setFont(myFont);
            p2Sixes.setText(p2Value);
        }
        if (!p2TOKPressed)
        {
            p2Value = p2TOKValue + "";
            p2TOK.setFont(myFont);
            p2TOK.setText(p2Value);
        }
        if (!p2FOKPressed)
        {
            p2Value = p2FOKValue + "";
            p2FOK.setFont(myFont);
            p2FOK.setText(p2Value);
        }
        if (!p2FHPressed)
        {
            p2Value = p2FHValue + "";
            p2FH.setFont(myFont);
            p2FH.setText(p2Value);
        }
        if (!p2SSPressed)
        {
            p2Value = p2SSValue + "";
            p2SS.setFont(myFont);
            p2SS.setText(p2Value);
        }
        if (!p2BSPressed)
        {
            p2Value = p2BSValue + "";
            p2BS.setFont(myFont);
            p2BS.setText(p2Value);
        }
        if (!p2ChancePressed)
        {
            p2Value = p2ChanceValue + "";
            p2Chance.setFont(myFont);
            p2Chance.setText(p2Value);
        }
        if (!p2YahtzeePressed)
        {
            p2Value = p2YahtzeeValue + "";
            p2Yahtzee.setFont(myFont);
            p2Yahtzee.setText(p2Value);
        }

        if (p1OnesPressed == true && p1TwosPressed == true && p1ThreesPressed == true &&
                p1FoursPressed == true && p1FivesPressed == true && p1SixesPressed == true)
        {
            String bonus = "0";
            if (sum >= 63)
            {
                total += 35;
                bonus = "35";
            }
            String newSum = sum + "";
            p1Sum.setFont(myFont);
            p1Sum.setText(newSum);
            p1Bonus.setFont(myFont);
            p1Bonus.setText(bonus);
        } 

        if (p1OnesPressed == true && p1TwosPressed == true && p1ThreesPressed == true &&
                p1FoursPressed == true && p1FivesPressed == true && p1SixesPressed == true &&
                p1TOKPressed == true && p1FOKPressed == true && p1FHPressed == true && 
                p1SSPressed == true && p1BSPressed == true && p1ChancePressed == true &&
                p1YahtzeePressed == true)
        {
            total += sum;
            String newTotal = total + "";
            p1Total.setFont(myFont);
            p1Total.setText(newTotal);
            roll.setEnabled(false);
            reset();
        }

        int width = getWidth()/7; // Uses these dimensions for adding scalable buttons and dice
        int height = width;
        int dotWidth = (int)(width/10);
        int increment = dotWidth;
        g.setColor(color1); // Clears the dice before drawing the new dots
        g.fillRect(0, 0, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width, height);

        roll.setBounds(2*width, width+4*increment, width, 2*increment); // Adds the scalable buttons
        add(roll);
        lock1.setBounds(0, width, width, increment*2);
        add(lock1);
        lock2.setBounds(width, width, width, increment*2);
        add(lock2);
        lock3.setBounds(width*2, width, width, increment*2);
        add(lock3);
        lock4.setBounds(width*3, width, width, increment*2);
        add(lock4);
        lock5.setBounds(width*4, width, width, increment*2);
        add(lock5);
        if (curPlayer == 1)
        {
            g.drawString("Current Player: 1", 2*width, width+10*increment);
        }
        else
        {
            g.drawString("Current Player: 2", 2*width, width+10*increment);
        }

        switch(dice1) // Draws the dots accordingly, draws dice 1
        {
        case 1:
            g.fillOval((int)(increment*4.5), (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 2:
            g.fillOval((int)(increment*6.5), (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5), (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 3:
            g.fillOval((int)(increment*6.5), (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5), (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5), (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 4:
            g.fillOval((int)(increment*2.5), (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5), (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5), (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5), (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 5:
            g.fillOval((int)(increment*2.5), (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5), (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5), (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5), (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5), (int)(increment*7.5), dotWidth, dotWidth);
            break;
        case 6:
            g.fillOval((int)(increment*2.5), (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5), (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5), (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5), (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5), (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5), (int)(increment*7.5), dotWidth, dotWidth);
            break;
        }

        g.setColor(color2); // Clears the dots, changes color based on locked or not, draws the second dice
        g.fillRect(width, 0, width, width);
        g.setColor(Color.BLACK);
        g.drawRect(width, 0, width, width);
        switch(dice2) // Draws the dots accordingly
        {
        case 1:
            g.fillOval((int)(increment*4.5)+width, (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 2:
            g.fillOval((int)(increment*6.5)+width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+width, (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 3:
            g.fillOval((int)(increment*6.5)+width, (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5)+width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+width, (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 4:
            g.fillOval((int)(increment*2.5)+width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+width, (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+width, (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 5:
            g.fillOval((int)(increment*2.5)+width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5)+width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+width, (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+width, (int)(increment*7.5), dotWidth, dotWidth);
            break;
        case 6:
            g.fillOval((int)(increment*2.5)+width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+width, (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+width, (int)(increment*7.5), dotWidth, dotWidth);
            break;
        }

        g.setColor(color3); // Clears the dots, changes color based on locked or not, draws the third dice
        g.fillRect(2*width, 0, width, width);
        g.setColor(Color.BLACK);
        g.drawRect(2*width, 0, width, width);
        switch(dice3) // Draws the dots accordingly
        {
        case 1:
            g.fillOval((int)(increment*4.5)+2*width, (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 2:
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 3:
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5)+2*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 4:
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 5:
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5)+2*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*7.5), dotWidth, dotWidth);
            break;
        case 6:
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+2*width, (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+2*width, (int)(increment*7.5), dotWidth, dotWidth);
            break;
        }

        g.setColor(color4); // Clears the dots, changes color based on locked or not, draws the fourth dice
        g.fillRect(3*width, 0, width, width);
        g.setColor(Color.BLACK);
        g.drawRect(3*width, 0, width, width);
        switch(dice4) // Draws the dots accordingly
        {
        case 1:
            g.fillOval((int)(increment*4.5)+3*width, (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 2:
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 3:
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5)+3*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 4:
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 5:
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5)+3*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*7.5), dotWidth, dotWidth);
            break;
        case 6:
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+3*width, (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+3*width, (int)(increment*7.5), dotWidth, dotWidth);
            break;
        }

        g.setColor(color5); // Clears the dice before drawing the new dots, draws the fifth dice
        g.fillRect(4*width, 0, width, width);
        g.setColor(Color.BLACK);
        g.drawRect(4*width, 0, width, width);
        switch(dice5) // Draws the dots accordingly
        {
        case 1:
            g.fillOval((int)(increment*4.5)+4*width, (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 2:
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*4.5), dotWidth, dotWidth);
            break;
        case 3:
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5)+4*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 4:
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*2.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*6.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*6.5), dotWidth, dotWidth);
            break;
        case 5:
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*4.5)+4*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*7.5), dotWidth, dotWidth);
            break;
        case 6:
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*2.5)+4*width, (int)(increment*7.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*1.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*4.5), dotWidth, dotWidth);
            g.fillOval((int)(increment*6.5)+4*width, (int)(increment*7.5), dotWidth, dotWidth);
            break;
        }

    }

    public void roll() // Rolls the dice if they are unlocked (currently bugged)
    {
        if (dice1Lock == false && rollsLeft > 0) // Rolls the dice
        {
            dice1 = (int)(Math.random()* 6 +1); // Gets a random number for the dice
        }
        if (dice2Lock == false && rollsLeft > 0)
        {
            dice2 = (int)(Math.random()* 6 +1); // Gets a random number for the dice
        }
        if (dice3Lock == false && rollsLeft > 0)
        {
            dice3 = (int)(Math.random()* 6 +1); // Gets a random number for the dice
        }
        if (dice4Lock == false && rollsLeft > 0)
        {
            dice4 = (int)(Math.random()* 6 +1); // Gets a random number for the dice
        }
        if (dice5Lock == false && rollsLeft > 0)
        {
            dice5 = (int)(Math.random()* 6 +1); // Gets a random number for the dice
        }
        if (rollsLeft == 1)
        {
            roll.setEnabled(false);
        }
    }

    public int getValue(int i) // Accessor methods for the  dice
    {
        int dieValue = 0;
        if (i == 0)
        {
            dieValue = dice1;
        }
        if (i == 1)
        {
            dieValue = dice2;
        }
        if (i == 2)
        {
            dieValue = dice3;
        }
        if (i == 3)
        {
            dieValue = dice4;
        }
        if (i == 4)
        {
            dieValue = dice5;
        }
        return dieValue;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) // Checks which button has been clicked
    {
        if (arg0.getSource() == roll) // If roll button is clicked
        {
            roll();
            if (rollsLeft > 0) // Only get 3 rolls
            {
                rollsLeft--;
            }
            ones();
            twos();
            threes();
            fours();
            fives();
            sixes();
            TOK();
            FOK();
            SS();
            BS();
            FH();
            chance();
            yahtzee();
        }
        else if (arg0.getSource() == lock1) // Locks the dice from further rolls
        {
            if (dice1Lock == false)
            {
                if (rollsLeft != 3)
                {
                    color1 = Color.RED;
                    dice1Lock = true;
                }
            }
            else
            {
                color1 = Color.WHITE;
                dice1Lock = false;
            }
        }
        else if (arg0.getSource() == lock2) // Locks the dice from further rolls
        {
            if (dice2Lock == false)
            {
                if (rollsLeft != 3)
                {
                    color2 = Color.RED;
                    dice2Lock = true;
                }
            }
            else
            {
                color2 = Color.WHITE;
                dice2Lock = false;
            }
        }
        else if (arg0.getSource() == lock3) // Locks the dice from further rolls
        {
            if (dice3Lock == false)
            {
                if (rollsLeft != 3)
                {
                    color3 = Color.RED;
                    dice3Lock = true;
                }
            }
            else
            {
                color3 = Color.WHITE;
                dice3Lock = false;
            }
        }
        else if (arg0.getSource() == lock4) // Locks the dice from further rolls
        {
            if (dice4Lock == false)
            {
                if (rollsLeft != 3)
                {
                    color4 = Color.RED;
                    dice4Lock = true;
                }
            }
            else
            {
                color4 = Color.WHITE;
                dice4Lock = false;
            }
        }
        else if (arg0.getSource() == lock5) // Locks the dice from further rolls
        {
            if (dice5Lock == false)
            {
                if (rollsLeft != 3)
                {
                    color5 = Color.RED;
                    dice5Lock = true;
                }
            }
            else
            {
                color5 = Color.WHITE;
                dice5Lock = false;
            }
        }
        // if the buttons clicked are scoring buttons, these are performed
        else if (arg0.getSource() == p1Ones && curPlayer == 1) 
        {
            sum += p1OneValue;
            String value = p1OneValue + "";
            p1Ones.setText(value);

            if (p1OneValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1OnesPressed)
                    {
                        p1OnesPressed = true;
                        p1Ones.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1OnesPressed)
                {
                    p1OnesPressed = true;
                    p1Ones.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1Twos && curPlayer == 1)
        {
            sum += p1TwoValue;
            String value = p1TwoValue + "";
            p1Twos.setText(value);

            if (p1TwoValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1TwosPressed)
                    {
                        p1TwosPressed = true;
                        p1Twos.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1TwosPressed)
                {
                    p1TwosPressed = true;
                    p1Twos.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1Threes && curPlayer == 1)
        {
            sum += p1ThreeValue;
            String value = p1ThreeValue + "";
            p1Threes.setText(value);

            if (p1ThreeValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1ThreesPressed)
                    {
                        p1ThreesPressed = true;
                        p1Threes.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1ThreesPressed)
                {
                    p1ThreesPressed = true;
                    p1Threes.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1Fours && curPlayer == 1)
        {
            sum += p1FourValue;
            String value = p1FourValue + "";
            p1Fours.setText(value);

            if (p1FourValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1FoursPressed)
                    {
                        p1FoursPressed = true;
                        p1Fours.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1FoursPressed)
                {
                    p1FoursPressed = true;
                    p1Fours.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1Fives && curPlayer == 1)
        {
            sum += p1FiveValue;
            String value = p1FiveValue + "";
            p1Fives.setText(value);

            if (p1FiveValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1FivesPressed)
                    {
                        p1FivesPressed = true;
                        p1Fives.setEnabled(false);
                        reset();
                    }
                }
            }
            else {	
                if (!p1FivesPressed)
                {
                    p1FivesPressed = true;
                    p1Fives.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1Sixes && curPlayer == 1)
        {
            sum += p1SixValue;
            String value = p1SixValue + "";
            p1Sixes.setText(value);

            if (p1SixValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1SixesPressed)
                    {
                        p1SixesPressed = true;
                        p1Sixes.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1SixesPressed)
                {
                    p1SixesPressed = true;
                    p1Sixes.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1TOK && curPlayer == 1)
        {
            total += p1TOKValue;
            String value = p1TOKValue + "";
            p1TOK.setText(value);

            if (p1TOKValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1TOKPressed)
                    {
                        p1TOKPressed = true;
                        p1TOK.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1TOKPressed)
                {
                    p1TOKPressed = true;
                    p1TOK.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1FOK && curPlayer == 1)
        {
            total += p1FOKValue;
            String value = p1FOKValue + "";
            p1FOK.setText(value);

            if (p1FOKValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1FOKPressed)
                    {
                        p1FOKPressed = true;
                        p1FOK.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1FOKPressed)
                {
                    p1FOKPressed = true;
                    p1FOK.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1FH && curPlayer == 1)
        {
            total += p1FHValue;
            String value = p1FHValue + "";
            p1FH.setText(value);

            if (p1FHValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1FHPressed)
                    {
                        p1FHPressed = true;
                        p1FH.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1FHPressed)
                {
                    p1FHPressed = true;
                    p1FH.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1SS && curPlayer == 1)
        {
            total += p1SSValue;
            String value = p1SSValue + "";
            p1SS.setText(value);

            if (p1SSValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1SSPressed)
                    {
                        p1SSPressed = true;
                        p1SS.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1SSPressed)
                {
                    p1SSPressed = true;
                    p1SS.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1BS && curPlayer == 1)
        {
            total += p1BSValue;
            String value = p1BSValue + "";
            p1BS.setText(value);

            if (p1BSValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1BSPressed)
                    {
                        p1BSPressed = true;
                        p1BS.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1BSPressed)
                {
                    p1BSPressed = true;
                    p1BS.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1Chance && curPlayer == 1)
        {
            total += p1ChanceValue;
            String value = p1ChanceValue + "";
            p1Chance.setText(value);

            if (p1ChanceValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1ChancePressed)
                    {
                        p1ChancePressed = true;
                        p1Chance.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1ChancePressed)
                {
                    p1ChancePressed = true;
                    p1Chance.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p1Yahtzee && curPlayer == 1)
        {
            total += p1YahtzeeValue;
            String value = p1YahtzeeValue + "";
            p1Yahtzee.setText(value);

            if (p1YahtzeeValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {
                    if (!p1YahtzeePressed)
                    {
                        p1YahtzeePressed = true;
                        p1Yahtzee.setEnabled(false);
                        reset();
                    }
                }
            }
            else {
                if (!p1YahtzeePressed)
                {
                    p1YahtzeePressed = true;
                    p1Yahtzee.setEnabled(false);
                    reset();
                }
            }
        }
        else if (arg0.getSource() == p2Ones && curPlayer == -1) 
        {
            sum += p2OneValue;
            String value = p2OneValue + "";
            p2Ones.setText(value);

            if (p2OneValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2OnesPressed = true;
                    p2Ones.setEnabled(false);
                    reset();
                }
            }
            else {

                p2OnesPressed = true;
                p2Ones.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2Twos && curPlayer == -1)
        {
            sum += p2TwoValue;
            String value = p2TwoValue + "";
            p2Twos.setText(value);

            if (p2TwoValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2TwosPressed = true;
                    p2Twos.setEnabled(false);
                    reset();
                }
            }
            else {

                p2TwosPressed = true;
                p2Twos.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2Threes && curPlayer == -1)
        {
            sum += p2ThreeValue;
            String value = p2ThreeValue + "";
            p2Threes.setText(value);

            if (p2ThreeValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2ThreesPressed = true;
                    p2Threes.setEnabled(false);
                    reset();
                }
            }
            else {

                p2ThreesPressed = true;
                p2Threes.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2Fours && curPlayer == -1)
        {
            sum += p2FourValue;
            String value = p2FourValue + "";
            p2Fours.setText(value);

            if (p2FourValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2FoursPressed = true;
                    p2Fours.setEnabled(false);
                    reset();
                }
            }
            else {

                p2FoursPressed = true;
                p2Fours.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2Fives && curPlayer == -1)
        {
            sum += p2FiveValue;
            String value = p2FiveValue + "";
            p2Fives.setText(value);

            if (p2FiveValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2FivesPressed = true;
                    p2Fives.setEnabled(false);
                    reset();
                }
            }
            else {

                p2FivesPressed = true;
                p2Fives.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2Sixes && curPlayer == -1)
        {
            sum += p2SixValue;
            String value = p2SixValue + "";
            p2Sixes.setText(value);

            if (p2SixValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2SixesPressed = true;
                    p2Sixes.setEnabled(false);
                    reset();
                }
            }
            else {

                p2SixesPressed = true;
                p2Sixes.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2TOK && curPlayer == -1)
        {
            total += p2TOKValue;
            String value = p2TOKValue + "";
            p2TOK.setText(value);

            if (p2TOKValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2TOKPressed = true;
                    p2TOK.setEnabled(false);
                    reset();
                }
            }
            else {

                p2TOKPressed = true;
                p2TOK.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2FOK && curPlayer == -1)
        {
            total += p2FOKValue;
            String value = p2FOKValue + "";
            p2FOK.setText(value);

            if (p2FOKValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2FOKPressed = true;
                    p2FOK.setEnabled(false);
                    reset();
                }
            }
            else {

                p2FOKPressed = true;
                p2FOK.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2FH && curPlayer == -1)
        {
            total += p2FHValue;
            String value = p2FHValue + "";
            p2FH.setText(value);

            if (p2FHValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2FHPressed = true;
                    p2FH.setEnabled(false);
                    reset();
                }
            }
            else {

                p2FHPressed = true;
                p2FH.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2SS && curPlayer == -1)
        {
            total += p2SSValue;
            String value = p2SSValue + "";
            p2SS.setText(value);

            if (p2SSValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2SSPressed = true;
                    p2SS.setEnabled(false);
                    reset();
                }
            }
            else {

                p2SSPressed = true;
                p2SS.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2BS && curPlayer == -1)
        {
            total += p2BSValue;
            String value = p2BSValue + "";
            p2BS.setText(value);

            if (p2BSValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2BSPressed = true;
                    p2BS.setEnabled(false);
                    reset();
                }
            }
            else {

                p2BSPressed = true;
                p2BS.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2Chance && curPlayer == -1)
        {
            total += p2ChanceValue;
            String value = p2ChanceValue + "";
            p2Chance.setText(value);

            if (p2ChanceValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2ChancePressed = true;
                    p2Chance.setEnabled(false);
                    reset();
                }
            }
            else {

                p2ChancePressed = true;
                p2Chance.setEnabled(false);
                reset();
            }
        }
        else if (arg0.getSource() == p2Yahtzee && curPlayer == -1)
        {
            total += p2YahtzeeValue;
            String value = p2YahtzeeValue + "";
            p2Yahtzee.setText(value);

            if (p2YahtzeeValue == 0) {
                JOptionPane pane = new JOptionPane();
                int reply = pane.showConfirmDialog(null,"You will get 0 points for this move. Are you sure?", "Move Status", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {

                }
                else {

                    p2YahtzeePressed = true;
                    p2Yahtzee.setEnabled(false);
                    reset();
                }
            }
            else {

                p2YahtzeePressed = true;
                p2Yahtzee.setEnabled(false);
                reset();
            }
        }
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {		
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    @Override
    public void mousePressed(MouseEvent arg0) {		
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {		
    }

    public void ones() // Calculates the score of ones for player 1
    {
        int onesThisTurn = 0;
        for (int i = 0; i < 5; i++)
        {
            if (getValue(i) == 1)
            {
                onesThisTurn++;
            }
        }
        if (curPlayer == 1)
        {
            p1OneValue = onesThisTurn;
        }
        else
        {
            p2OneValue = onesThisTurn;
        }
    }

    public void twos() // Calculates the score of twos for player 1
    {
        int twosThisTurn = 0;
        for (int i = 0; i < 5; i++)
        {
            if (getValue(i) == 2)
            {
                twosThisTurn += 2;
            }
        }
        if (curPlayer == 1)
        {
            p1TwoValue = twosThisTurn;
        }
        else
        {
            p2TwoValue = twosThisTurn;
        }
    }

    public void threes() // Calculates the score of threes for player 1
    {
        int threesThisTurn = 0;
        for (int i = 0; i < 5; i++)
        {
            if (getValue(i) == 3)
            {
                threesThisTurn += 3;
            }
        }
        if (curPlayer == 1)
        {
            p1ThreeValue = threesThisTurn;
        }
        else
        {
            p2ThreeValue = threesThisTurn;
        }
    }

    public void fours() // Calculates the score of fours for player 1
    {
        int foursThisTurn = 0;
        for (int i = 0; i < 5; i++)
        {
            if (getValue(i) == 4)
            {
                foursThisTurn += 4;
            }
        }
        if (curPlayer == 1)
        {
            p1FourValue = foursThisTurn;
        }
        else
        {
            p2FourValue = foursThisTurn;
        }
    }

    public void fives() // Calculates the score of fives for player 1
    {
        int fivesThisTurn = 0;
        for (int i = 0; i < 5; i++)
        {
            if (getValue(i) == 5)
            {
                fivesThisTurn += 5;
            }
        }
        if (curPlayer == 1)
        {
            p1FiveValue = fivesThisTurn;
        }
        else
        {
            p2FiveValue = fivesThisTurn;
        }
    }

    public void sixes() // Calculates the score of sixes for player 1
    {
        int sixesThisTurn = 0;
        for (int i = 0; i < 5; i++)
        {
            if (getValue(i) == 6)
            {
                sixesThisTurn += 6;
            }
        }
        if (curPlayer == 1)
        {
            p1SixValue = sixesThisTurn;
        }
        else
        {
            p2SixValue = sixesThisTurn;
        }
    }

    public void TOK() // Calculates Three of a Kind for Player 1
    {
        int[] copyArray = {dice1, dice2, dice3, dice4, dice5};
        Arrays.sort(copyArray);
        boolean isTOK = true;
        for (int i = 1; i < 3; i++)
        {
            if (copyArray[i] != copyArray[i-1])
            {
                isTOK = false;
            }
        }

        if (isTOK)
        {
            if (curPlayer == 1)
            {
                p1TOKValue = calculateSum();
            }
            else
            {
                p2TOKValue = calculateSum();
            }
            return;
        }

        isTOK = true;
        for (int i = 2; i < 4; i++)
        {
            if (copyArray[i] != copyArray[i-1])
            {
                isTOK = false;
            }
        }

        if (isTOK)
        {
            p1TOKValue = calculateSum();
            return;
        }

        isTOK = true;
        for (int i = 3; i < 5; i++)
        {
            if (copyArray[i] != copyArray[i-1])
            {
                isTOK = false;
            }
        }

        if (isTOK)
        {
            if (curPlayer == 1)
            {
                p1TOKValue = calculateSum();
            }
            else
            {
                p2TOKValue = calculateSum();
            }
            return;
        }

    }

    public void FOK() // Calculates Four of a Kind for Player 1
    {
        int[] copyArray = {dice1, dice2, dice3, dice4, dice5};
        Arrays.sort(copyArray);
        boolean isFOK = true;
        for (int i = 1; i < 4; i++)
        {
            if (copyArray[i] != copyArray[i-1])
            {
                isFOK = false;
            }
        }

        if (isFOK)
        {
            if (curPlayer == 1)
            {
                p1FOKValue = calculateSum();
            }
            else
            {
                p2FOKValue = calculateSum();
            }
            return;
        }

        isFOK = true;
        for (int i = 2; i < 5; i++)
        {
            if (copyArray[i] != copyArray[i-1])
            {
                isFOK = false;
            }
        }

        if (isFOK)
        {
            if (curPlayer == 1)
            {
                p1FOKValue = calculateSum();
            }
            else
            {
                p2FOKValue = calculateSum();
            }
            return;
        }
    }

    public void FH()
    {
        int[] copyArray = {dice1, dice2, dice3, dice4, dice5};
        Arrays.sort(copyArray);
        if (copyArray[0] == copyArray[1] && copyArray[2] == copyArray[3] && copyArray[3] == copyArray[4])
        {
            if (curPlayer == 1)
            {
                p1FHValue = 25;
            }
            else
            {
                p2FHValue = 25;
            }
            return;
        }
        if (copyArray[0] == copyArray[1] && copyArray[1] == copyArray[2] && copyArray[3] == copyArray[4])
        {
            if (curPlayer == 1)
            {
                p1FHValue = 25;
            }
            else
            {
                p2FHValue = 25;
            }
            return;
        }
    }

    public void SS() // Calculates Small Straight of a Kind for Player 1
    {
        int[] copyArray = new int[] {dice1, dice2, dice3, dice4, dice5};
        Arrays.sort(copyArray);
        for (int i = 1; i < 5; i++)
        {
            if (copyArray[i] == copyArray[i-1])
            {
                copyArray[i] = -1;
            }
        }

        Arrays.sort(copyArray);
        boolean isSS = true;
        for (int i = 1; i < 4; i++)
        {
            if (copyArray[i] != (copyArray[i-1]+1))
            {
                isSS = false;
            }
        }

        if (isSS == true)
        {
            if (curPlayer == 1)
            {
                p1SSValue = 30;
            }
            else
            {
                p2SSValue = 30;
            }
            return;
        }

        isSS = true;
        for (int i = 2; i < 5; i++)
        {
            if (copyArray[i] != (copyArray[i-1]+1))
            {
                isSS = false;
            }
        }

        if (isSS == true)
        {
            if (curPlayer == 1)
            {
                p1SSValue = 30;
            }
            else
            {
                p2SSValue = 30;
            }
            return;
        }
    }

    public void BS() // Calculates Large Straight of a Kind for Player 1
    {
        int[] copyArray = {dice1, dice2, dice3, dice4, dice5};
        Arrays.sort(copyArray);
        boolean isBS = true;
        for (int i = 1; i < 5; i++)
        {
            if (copyArray[i] != (copyArray[i-1]+1))
            {
                isBS = false;
            }
        }

        if (isBS)
        {
            if (curPlayer == 1)
            {
                p1BSValue = 40;
            }
            else
            {
                p2BSValue = 40;
            }
            return;
        }
    }

    public void chance() // Calculates Chance for Player 1
    {
        if (curPlayer == 1)
        {
            p1ChanceValue = calculateSum();
        }
        else
        {
            p2ChanceValue = calculateSum();
        }
    }

    public void yahtzee() // Calculates Yahtzee for Player 1
    {		
        int[] copyArray = {dice1, dice2, dice3, dice4, dice5};
        if(copyArray[0] == copyArray[1]  && copyArray[1]  == copyArray[2]  && copyArray[2]  
                == copyArray[3]  && copyArray[3]  == copyArray[4])
        {
            if (curPlayer == 1)
            {
                p1YahtzeeValue = 50;
            }
            else
            {
                p2YahtzeeValue = 50;
            }
        }
    }

    private int calculateSum() // Helper function
    {
        int totalSum = 0;
        for (int i = 0; i < 5; i++)
        {
            totalSum += getValue(i);
        }
        return totalSum;
    }

    private void reset()
    {
        dice1 = 0;
        dice2 = 0;
        dice3 = 0;
        dice4 = 0;
        dice5 = 0;

        rollsLeft = 3;
        roll.setEnabled(true);

        dice1Lock = false;
        dice2Lock = false;
        dice3Lock = false;
        dice4Lock = false;
        dice5Lock = false;

        if (!p1OnesPressed)
        {
            p1OneValue = 0; 
        }
        if (!p1TwosPressed)
        {
            p1TwoValue = 0;
        }
        if (!p1ThreesPressed)
        {
            p1ThreeValue = 0;
        }
        if (!p1FoursPressed)
        {
            p1FourValue = 0;
        }
        if (!p1FivesPressed)
        {
            p1FiveValue = 0;
        }
        if (!p1SixesPressed)
        {
            p1SixValue = 0;
        }
        if (!p1TOKPressed)
        {
            p1TOKValue = 0;
        }
        if (!p1FOKPressed)
        {
            p1FOKValue = 0;
        }
        if (!p1FHPressed)
        {
            p1FHValue = 0;
        }
        if (!p1SSPressed)
        {
            p1SSValue = 0;
        }
        if (!p1BSPressed)
        {
            p1BSValue = 0;
        }
        if (!p1ChancePressed)
        {
            p1ChanceValue = 0;
        }
        if (!p1YahtzeePressed)
        {
            p1YahtzeeValue = 0;
        }
        if (!p2OnesPressed)
        {
            p2OneValue = 0; 
        }
        if (!p2TwosPressed)
        {
            p2TwoValue = 0;
        }
        if (!p2ThreesPressed)
        {
            p2ThreeValue = 0;
        }
        if (!p2FoursPressed)
        {
            p2FourValue = 0;
        }
        if (!p2FivesPressed)
        {
            p2FiveValue = 0;
        }
        if (!p2SixesPressed)
        {
            p2SixValue = 0;
        }
        if (!p2TOKPressed)
        {
            p2TOKValue = 0;
        }
        if (!p2FOKPressed)
        {
            p2FOKValue = 0;
        }
        if (!p2FHPressed)
        {
            p2FHValue = 0;
        }
        if (!p2SSPressed)
        {
            p2SSValue = 0;
        }
        if (!p2BSPressed)
        {
            p2BSValue = 0;
        }
        if (!p2ChancePressed)
        {
            p2ChanceValue = 0;
        }
        if (!p2YahtzeePressed)
        {
            p2YahtzeeValue = 0;
        }

        color1 = Color.WHITE;
        color2 = Color.WHITE;
        color3 = Color.WHITE;
        color4 = Color.WHITE;
        color5 = Color.WHITE;

        curPlayer *= -1;
        if (curPlayer == 1) // Change setEnabled to add and remove
        {
            p2Ones.setEnabled(false);
            p2Twos.setEnabled(false);
            p2Threes.setEnabled(false);
            p2Fours.setEnabled(false);
            p2Fives.setEnabled(false);
            p2Sixes.setEnabled(false);
            p2TOK.setEnabled(false);
            p2FOK.setEnabled(false);
            p2FH.setEnabled(false);
            p2SS.setEnabled(false);
            p2BS.setEnabled(false);
            p2Chance.setEnabled(false);
            p2Yahtzee.setEnabled(false);

            if (!p1OnesPressed)
            {
                p1Ones.setEnabled(true); 
            }
            if (!p1TwosPressed)
            {
                p1Twos.setEnabled(true);
            }
            if (!p1ThreesPressed)
            {
                p1Threes.setEnabled(true);
            }
            if (!p1FoursPressed)
            {
                p1Fours.setEnabled(true);
            }
            if (!p1FivesPressed)
            {
                p1Fives.setEnabled(true);
            }
            if (!p1SixesPressed)
            {
                p1Sixes.setEnabled(true);
            }
            if (!p1TOKPressed)
            {
                p1TOK.setEnabled(true);
            }
            if (!p1FOKPressed)
            {
                p1FOK.setEnabled(true);
            }
            if (!p1FHPressed)
            {
                p1FH.setEnabled(true);
            }
            if (!p1SSPressed)
            {
                p1SS.setEnabled(true);
            }
            if (!p1BSPressed)
            {
                p1BS.setEnabled(true);
            }
            if (!p1ChancePressed)
            {
                p1Chance.setEnabled(true);
            }
            if (!p1YahtzeePressed)
            {
                p1Yahtzee.setEnabled(true);
            }
        }
        else
        {
            p1Ones.setEnabled(false);
            p1Twos.setEnabled(false);
            p1Threes.setEnabled(false);
            p1Fours.setEnabled(false);
            p1Fives.setEnabled(false);
            p1Sixes.setEnabled(false);
            p1TOK.setEnabled(false);
            p1FOK.setEnabled(false);
            p1FH.setEnabled(false);
            p1SS.setEnabled(false);
            p1BS.setEnabled(false);
            p1Chance.setEnabled(false);
            p1Yahtzee.setEnabled(false);
            if (!p2OnesPressed)
            {
                p2Ones.setEnabled(true); 
            }
            if (!p2TwosPressed)
            {
                p2Twos.setEnabled(true);
            }
            if (!p2ThreesPressed)
            {
                p2Threes.setEnabled(true);
            }
            if (!p2FoursPressed)
            {
                p2Fours.setEnabled(true);
            }
            if (!p2FivesPressed)
            {
                p2Fives.setEnabled(true);
            }
            if (!p2SixesPressed)
            {
                p2Sixes.setEnabled(true);
            }
            if (!p2TOKPressed)
            {
                p2TOK.setEnabled(true);
            }
            if (!p2FOKPressed)
            {
                p2FOK.setEnabled(true);
            }
            if (!p2FHPressed)
            {
                p2FH.setEnabled(true);
            }
            if (!p2SSPressed)
            {
                p2SS.setEnabled(true);
            }
            if (!p2BSPressed)
            {
                p2BS.setEnabled(true);
            }
            if (!p2ChancePressed)
            {
                p2Chance.setEnabled(true);
            }
            if (!p2YahtzeePressed)
            {
                p2Yahtzee.setEnabled(true);
            }
        }
    }
} 	