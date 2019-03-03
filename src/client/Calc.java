package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Calc extends JPanel
{
    JTextField txt1 = null;
    int res = 0;
    int res1 = 0;
    String op = "";
    CashCalc mc = new CashCalc();
    boolean clear=false;


     void ifClear(TextField txt)
    {
        if(clear)
        {
            txt.setText("");
            clear=false;
        }
    }


    public Calc()
    {


        try
        {
            setLayout(null);


            // Specifies the position of the element
            final TextField txt1 = new TextField();
            txt1.setBounds(10, 10, 235, 25);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 190, 75, 50);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 140, 50, 50);

            JButton b2 = new JButton("2");
            b2.setBounds(60, 140, 50, 50);

            JButton b3 = new JButton("3");
            b3.setBounds(110, 140, 50, 50);

            JButton b4 = new JButton("4");
            b4.setBounds(10, 90, 50, 50);

            JButton b5 = new JButton("5");
            b5.setBounds(60, 90, 50, 50);

            JButton b6 = new JButton("6");
            b6.setBounds(110, 90, 50, 50);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);

            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);

            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);

            JButton bRes = new JButton("=");
            bRes.setBounds(85, 190, 75, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            bRes.setFont(bigFont);

            JButton bPlus = new JButton("+");
            bPlus.setBounds(160, 40, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            bPlus.setFont(bigFontPlus);

            JButton bMinus = new JButton("-");
            bMinus.setBounds(160, 90, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            bMinus.setFont(bigFontMinus);

            JButton bMulti = new JButton("*");
            bMulti.setBounds(160, 140, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            bMulti.setFont(bigFontMulti);

            JButton bDivision = new JButton("/");
            bDivision.setBounds(160, 190, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            bDivision.setFont(bigFontDivision);

            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);




            b1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 1);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b2.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 2);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 3);
                    if (res==0) {

                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b4.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 4);
                    if (res==0)
                    {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b5.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 5);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b6.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 6);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b7.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 7);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b8.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 8);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b9.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 9);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b0.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    ifClear(txt1);
                    txt1.setText(txt1.getText() + 0);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            bPlus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });

            bMinus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });

            bMulti.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });

            bDivision.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });

            bRes.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    int num = Integer.valueOf(res);
                    int num1 = Integer.valueOf(res1);
                    String strOp = op;
                    clear=true;

                   // String strRes = String.valueOf(mc.cash(num, strOp, num1 ));
                  //  txt1.setText(strRes);
                  //  System.out.println("Ну я посчитал вот!");
                   // String res = mc.cash(num, strOp, num1 );
                    try {
                       // String  result=mc.cash(num, strOp, num1 );
                        txt1.setText(mc.cash(num, strOp, num1 ));
                       // System.out.println(mc.cash(num, strOp, num1 ));
                    } catch (IOException e) {
                    }

                }
            });
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Я не запустился(((");
        }
    }
}