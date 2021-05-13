
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Arun Murugan
 */

public class Calculator extends JFrame {

    private JLabel myLabel;
    private JTextField outputField;
    private ArrayList<JButton> digits;
    private JButton plusSign;
    private JButton minusSign;
    private JButton multSign;
    private JButton divSign;
    private JButton eqSign;
    private JMenuItem addMenu;
    private JMenuItem subtractMenu;
    private JMenuItem multiplyMenu;
    private JMenuItem divideMenu;
    private JMenuItem clearMenu;
    private String currentOperation;
    private Double firstOperand;

    public Calculator() {
        this.currentOperation = "";
        this.firstOperand = 0.0;

        JPanel displayPanel = new JPanel(new FlowLayout());
        outputField = new JTextField("0", 20);
        displayPanel.add(outputField);
        
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        JMenu menu1 = new JMenu("Operations");
        menuBar.add(menu1);
        
        addMenu = new JMenuItem("Add");
        menu1.add(addMenu);
        subtractMenu = new JMenuItem("Subtract");
        menu1.add(subtractMenu);
        multiplyMenu = new JMenuItem("Multiply");
        menu1.add(multiplyMenu);
        divideMenu = new JMenuItem("Divide");
        menu1.add(divideMenu);
        clearMenu = new JMenuItem("Clear");
        menu1.add(clearMenu);
        
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        JPanel digitButtonPanel = new JPanel(new GridLayout(4, 3));
        digits = new ArrayList<>();
        digits.add(new JButton("0"));
        digits.add(new JButton("1"));
        digits.add(new JButton("2"));
        digits.add(new JButton("3"));
        digits.add(new JButton("4"));
        digits.add(new JButton("5"));
        digits.add(new JButton("6"));
        digits.add(new JButton("7"));
        digits.add(new JButton("8"));
        digits.add(new JButton("9"));
        digits.add(new JButton("."));
        digits.add(new JButton("AC"));

        digits.get(10).setForeground(Color.MAGENTA);
        digits.get(11).setForeground(Color.MAGENTA);

        digitButtonPanel.add(digits.get(0));
        digitButtonPanel.add(digits.get(1));
        digitButtonPanel.add(digits.get(2));
        digitButtonPanel.add(digits.get(3));
        digitButtonPanel.add(digits.get(4));
        digitButtonPanel.add(digits.get(5));
        digitButtonPanel.add(digits.get(6));
        digitButtonPanel.add(digits.get(7));
        digitButtonPanel.add(digits.get(8));
        digitButtonPanel.add(digits.get(9));
        digitButtonPanel.add(digits.get(10));
        digitButtonPanel.add(digits.get(11));
        buttonPanel.add(digitButtonPanel);

        JPanel operatorButtonPanel = new JPanel(new GridLayout(5, 1));
        //System.out.println(System.getProperty("user.dir"));
        plusSign = new JButton(new ImageIcon("plus_sign_icon.png"));
        minusSign = new JButton(new ImageIcon("minus_sign_icon.png"));
        multSign = new JButton(new ImageIcon("multiply_sign_icon.png"));
        divSign = new JButton(new ImageIcon("divide_sign_icon.png"));
        eqSign = new JButton(new ImageIcon("equals_sign_icon.png"));

        plusSign.setForeground(Color.BLUE);
        minusSign.setForeground(Color.BLUE);
        multSign.setForeground(Color.BLUE);
        divSign.setForeground(Color.BLUE);
        eqSign.setForeground(Color.GREEN);

        operatorButtonPanel.add(plusSign);
        operatorButtonPanel.add(minusSign);
        operatorButtonPanel.add(multSign);
        operatorButtonPanel.add(divSign);
        operatorButtonPanel.add(eqSign);
        buttonPanel.add(operatorButtonPanel);

        displayPanel.add(buttonPanel);
        add(displayPanel);

        clearMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //currentOperation = "";
                //firstOperand = 0.0;
                //outputField.setText("0");
                resetValues();
            }
        });
        
        digits.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //currentOperation = "";
                //firstOperand = 0.0;
                //outputField.setText("0");
                resetValues();
            }
        });

        digits.get(10).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String currentText = outputField.getText();
                if (currentText.indexOf(".") < 0) {
                    outputField.setText(currentText + ".");
                }
            }
        });

        OperatorListener opListener = new OperatorListener();
        plusSign.addActionListener(opListener);
        minusSign.addActionListener(opListener);
        multSign.addActionListener(opListener);
        divSign.addActionListener(opListener);
        addMenu.addActionListener(opListener);
        subtractMenu.addActionListener(opListener);
        multiplyMenu.addActionListener(opListener);
        divideMenu.addActionListener(opListener);
        
        for (int i = 0; i <= 9; i++) {
            digits.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    String currentText = outputField.getText();
                    JButton source = (JButton) event.getSource();
                    String newDigit = "";
                    if (source == digits.get(0)) {
                        newDigit = "0";
                    } else if (source == digits.get(1)) {
                        newDigit = "1";
                    } else if (source == digits.get(2)) {
                        newDigit = "2";
                    } else if (source == digits.get(3)) {
                        newDigit = "3";
                    } else if (source == digits.get(4)) {
                        newDigit = "4";
                    } else if (source == digits.get(5)) {
                        newDigit = "5";
                    } else if (source == digits.get(6)) {
                        newDigit = "6";
                    } else if (source == digits.get(7)) {
                        newDigit = "7";
                    } else if (source == digits.get(8)) {
                        newDigit = "8";
                    } else if (source == digits.get(9)) {
                        newDigit = "9";
                    }

                    currentText = currentText + newDigit;
                    currentText = currentText.replaceFirst("^0+(?!$)", "");
                    outputField.setText(currentText);
                }
            });
        }

        eqSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Double result = 0.0;
                String currentText = outputField.getText();
                try {
                    Double secondOperand = Double.parseDouble(currentText);

                    if (currentOperation == "+") {
                        result = firstOperand + secondOperand;
                    } else if (currentOperation == "-") {
                        result = firstOperand - secondOperand;
                    } else if (currentOperation == "*") {
                        result = firstOperand * secondOperand;
                    } else if (currentOperation == "/") {
                        if (secondOperand != 0.0) {
                            result = firstOperand / secondOperand;
                        } else {
                            resetValues();
                            outputField.setBackground(Color.PINK);
                        }
                    }

                    outputField.setText(result.toString());
                    firstOperand = result;
                } catch (NumberFormatException e) {
                    resetValues();
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });

        setTitle("Calculator");
        setSize(500, 200);
        setVisible(true);
    }

    private void resetValues() {
        currentOperation = "";
        firstOperand = 0.0;
        outputField.setText("0");
        outputField.setBackground(Color.WHITE);
    }

    private class OperatorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            if(source instanceof JButton) {
                source = (JButton) event.getSource();
            } else if(source instanceof JMenuItem) {
                source = (JMenuItem) event.getSource();
            }
            if (source == plusSign || source == addMenu) {
                currentOperation = "+";
            } else if (source == minusSign || source == subtractMenu) {
                currentOperation = "-"; 
            } else if (source == multSign || source == multiplyMenu) {
                currentOperation = "*";
            } else if (source == divSign || source == divideMenu) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try {
                Double currentTextDouble = Double.parseDouble(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch (NumberFormatException e) {
                resetValues();
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
