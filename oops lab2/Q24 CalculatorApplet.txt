// File Name: CalculatorApplet.java
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Applet class to create a simple calculator
public class CalculatorApplet extends Applet implements ActionListener {
    
    // Declare the buttons and text field
    TextField display;
    Button[] numButtons;
    Button addButton, subButton, mulButton, divButton, eqButton, clrButton;

    String operator = "";
    double firstNum = 0, secondNum = 0, result = 0;

    @Override
    public void init() {
        // Initialize components
        display = new TextField();
        numButtons = new Button[10];

        // Create number buttons (0-9)
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new Button(String.valueOf(i));
            numButtons[i].addActionListener(this);
        }

        // Create operator buttons
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        eqButton = new Button("=");
        clrButton = new Button("C");

        // Add action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clrButton.addActionListener(this);

        // Set layout manager for applet
        setLayout(new BorderLayout());

        // Display field
        add(display, BorderLayout.NORTH);

        // Panel for number buttons
        Panel numPanel = new Panel();
        numPanel.setLayout(new GridLayout(4, 3));
        
        // Add number buttons to the panel
        for (int i = 1; i <= 9; i++) {
            numPanel.add(numButtons[i]);
        }
        numPanel.add(numButtons[0]);
        add(numPanel, BorderLayout.CENTER);

        // Panel for operator buttons
        Panel opPanel = new Panel();
        opPanel.setLayout(new GridLayout(5, 1));

        // Add operator buttons to the panel
        opPanel.add(addButton);
        opPanel.add(subButton);
        opPanel.add(mulButton);
        opPanel.add(divButton);
        opPanel.add(eqButton);
        opPanel.add(clrButton);
        
        add(opPanel, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) == 'C') {
            display.setText("");  // Clear the display
            operator = "";
            firstNum = secondNum = result = 0;
        } else if (command.charAt(0) == '=') {
            secondNum = Double.parseDouble(display.getText());

            switch (operator) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    if (secondNum != 0) {
                        result = firstNum / secondNum;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
                default:
                    result = secondNum;
            }
            display.setText(String.valueOf(result));
            operator = "";
        } else {
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                display.setText(display.getText() + command); // Append number
            } else {
                if (!operator.isEmpty()) {
                    return;
                }
                operator = command;
                firstNum = Double.parseDouble(display.getText());
                display.setText(""); // Clear display for next input
            }
        }
    }
}

/*
Steps to run the file:

1. Save the file as "CalculatorApplet.java".
2. Open a terminal or command prompt.
3. Navigate to the directory where the file is saved.
4. Compile the Java file:
   javac CalculatorApplet.java
5. Create an HTML file to run the applet (you cannot run Applets directly from the terminal in modern JDKs, so we use an HTML file):

Create a file named `CalculatorApplet.html` with the following content:

   <html>
   <body>
       <applet code="CalculatorApplet.class" width="400" height="400"></applet>
   </body>
   </html>

6. Open the HTML file in an Applet viewer (if you have the Applet viewer tool):
   appletviewer CalculatorApplet.html

Note: Applets are deprecated in modern Java versions, and you may need older JDKs or browsers that support Java Applets to run them.

Sample Output:

The applet window will display:
- A calculator with number buttons (0-9)
- Arithmetic operation buttons (+, -, *, /)
- A "C" button to clear the input
- A "=" button to compute the result
- The result will be displayed on the screen
*/
