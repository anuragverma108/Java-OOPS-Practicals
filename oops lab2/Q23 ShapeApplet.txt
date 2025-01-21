// File Name: ShapeApplet.java
import java.applet.Applet;
import java.awt.Graphics;

// Applet class to draw different shapes
public class ShapeApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        // Drawing a circle
        g.drawOval(50, 50, 100, 100); // x, y, width, height
        g.drawString("Circle", 90, 170);

        // Drawing an ellipse
        g.drawOval(200, 50, 150, 100); // x, y, width, height
        g.drawString("Ellipse", 260, 170);

        // Drawing a square
        g.drawRect(400, 50, 100, 100); // x, y, width, height
        g.drawString("Square", 440, 170);

        // Drawing a rectangle
        g.drawRect(550, 50, 150, 100); // x, y, width, height
        g.drawString("Rectangle", 600, 170);
    }
}

/*
Steps to run the file:

1. Save the file as "ShapeApplet.java".
2. Open a terminal or command prompt.
3. Navigate to the directory where the file is saved.
4. Compile the Java file:
   javac ShapeApplet.java
5. Create an HTML file to run the applet (you cannot run Applets directly from the terminal in modern JDKs, so we use an HTML file):

Create a file named `ShapeApplet.html` with the following content:

   <html>
   <body>
       <applet code="ShapeApplet.class" width="800" height="400"></applet>
   </body>
   </html>

6. Open the HTML file in an Applet viewer (if you have the Applet viewer tool):
   appletviewer ShapeApplet.html

Note: Applets are deprecated in modern Java versions, and you may need older JDKs or browsers that support Java Applets to run them.

Sample Output:

The output window will show a circle, ellipse, square, and rectangle, each labeled accordingly.
*/
