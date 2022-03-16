
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculator implements ActionListener {
    
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton buttonAdd;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton buttonMulti;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonDevide;
    JButton buttonDot;
    JButton button0;
    JButton buttonEqual;
    JButton buttonMines;
    JButton buttonBackspc;
    JButton buttonClear;
    JTextField textfield;
    String opr = "";
    double firstInput = 0.0;
    double secondInput = 0.0;
    
    public void showFrame() {
        frame = new JFrame("calculator");
        frame.setSize(350, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(null);
        
    }
    
    public void buttonCreater() {
        
        textfield = new JTextField();
        textfield.setBounds(30, 40, 280, 40);
        frame.add(textfield);
        
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        buttonAdd = new JButton("+");
        button1.setBounds(40, 100, 50, 40);
        button2.setBounds(110, 100, 50, 40);
        button3.setBounds(180, 100, 50, 40);
        buttonAdd.setBounds(250, 100, 50, 40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        buttonAdd.addActionListener(this);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(buttonAdd);
        
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        buttonMulti = new JButton("*");
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        buttonMulti.addActionListener(this);
        button4.setBounds(40, 170, 50, 40);
        button5.setBounds(110, 170, 50, 40);
        button6.setBounds(180, 170, 50, 40);
        buttonMulti.setBounds(250, 170, 50, 40);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(buttonMulti);
        
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonDevide = new JButton("/");
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonDevide.addActionListener(this);
        button7.setBounds(40, 240, 50, 40);
        button8.setBounds(110, 240, 50, 40);
        button9.setBounds(180, 240, 50, 40);
        buttonDevide.setBounds(250, 240, 50, 40);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonDevide);
        
        buttonDot = new JButton(".");
        button0 = new JButton("0");
        buttonEqual = new JButton("=");
        buttonMines = new JButton("-");
        buttonDot.addActionListener(this);
        button0.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonMines.addActionListener(this);
        buttonDot.setBounds(40, 310, 50, 40);
        button0.setBounds(110, 310, 50, 40);
        buttonEqual.setBounds(180, 310, 50, 40);
        buttonMines.setBounds(250, 310, 50, 40);
        frame.add(buttonDot);
        frame.add(button0);
        frame.add(buttonEqual);
        frame.add(buttonMines);
        
        buttonBackspc = new JButton("backspc");
        buttonClear = new JButton("clear");
        buttonBackspc.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonBackspc.setBounds(60, 380, 100, 40);
        buttonClear.setBounds(180, 380, 100, 40);
        frame.add(buttonBackspc);
        frame.add(buttonClear);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            textfield.setText(textfield.getText().concat("1"));
            
        }
        if (e.getSource() == button2) {
            textfield.setText(textfield.getText().concat("2"));
        }
        if (e.getSource() == button3) {
            textfield.setText(textfield.getText().concat("3"));
        }
        if (e.getSource() == buttonAdd) {
            firstInput = Double.parseDouble(textfield.getText());
            opr = "+";
            textfield.setText("");
        }
        
        if (e.getSource() == button4) {
            textfield.setText(textfield.getText().concat("4"));
        }
        
        if (e.getSource() == button5) {
            textfield.setText(textfield.getText().concat("5"));
        }
        
        if (e.getSource() == button6) {
            textfield.setText(textfield.getText().concat("6"));
        }
        if (e.getSource() == buttonMulti) {
            firstInput = Double.parseDouble(textfield.getText());
            opr = "*";
            textfield.setText("");
        }
        if (e.getSource() == button7) {
            textfield.setText(textfield.getText().concat("7"));
        }
        if (e.getSource() == button8) {
            textfield.setText(textfield.getText().concat("8"));
        }
        
        if (e.getSource() == button9) {
            textfield.setText(textfield.getText().concat("9"));
        }
        if (e.getSource() == buttonDevide) {
            firstInput = Double.parseDouble(textfield.getText());
            opr = "/";
            textfield.setText("");
        }
        
        if (e.getSource() == buttonDot) {
            textfield.setText(textfield.getText().concat("."));
        }
        
        if (e.getSource() == button0) {
            opr = "=";
        }
        if (e.getSource() == buttonEqual) {
            secondInput = Double.parseDouble(textfield.getText());
            if (opr.equals("+")) {
                double result = firstInput + secondInput;
                textfield.setText(result + "");
            }
            if (opr.equals("*")) {
                double result = firstInput * secondInput;
                textfield.setText(result + "");                
            }
            if (opr.equals("/")) {
                double result = firstInput / secondInput;
                textfield.setText(result + "");
            }
            if (opr.equals("-")) {
                double result = firstInput - secondInput;
                textfield.setText(result + "");
            }
            
        }
        if (e.getSource() == buttonMines) {
            firstInput = Double.parseDouble(textfield.getText());
            opr = "-";
            textfield.setText("");
        }
        if (e.getSource() == buttonBackspc) {
            String str = textfield.getText();
            textfield.setText("");
            for (int i = 0; i < str.length() - 1; i++) {
                textfield.setText(textfield.getText() + str.charAt(i));
            }
            
        }
        if (e.getSource() == buttonClear) {
            textfield.setText("");
            opr = "";
        }
        
    }
    
}
