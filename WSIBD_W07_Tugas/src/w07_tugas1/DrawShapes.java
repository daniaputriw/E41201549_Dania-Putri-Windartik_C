/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w07_tugas1;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author dania
 */
public class DrawShapes extends Applet {

Font font;
Color redColor;
Color blueColor;
Color backgroundColor;

@Override
public void init() {
    //the font is Arial size, 18 and is italicized
    font = new Font("Arial", Font.ITALIC, 18);
        
    //Some colors are predefined in the Color class
    redColor = Color.RED;
    backgroundColor = Color.orange;
        
    //Colors can be created using Red,Green, Blue values
    blueColor = new Color(0,0,122);
        
    //Set the background Color of the applet
    setBackground(backgroundColor);
}
     
public void Stop(){
}
    
public void paint(Graphics graph){
    //Set Font
    graph.setFont(font);
    
    //Create a title
    graph.drawString("Draw Shapes", 90, 20);
     
    //Set color for the first shape
    graph.setColor(blueColor);
     
    //Draw a rectangle using drawRect(int x,int y,int width, int height)
    graph.drawRect(120,120,120,120);

    //This will fill a rectangle
    graph.fillRect(115,115,90,90);

    //Set the color for the next shape
    graph.setColor(redColor);

    //Draw a rectangle using drawRect(int x,int y,int width, int height,int starAngle, int arrcAngle)
    graph.fillArc(110,110,50,50,0,360);

    //Set color for next shape
    graph.setColor(Color.CYAN);

    //Draw another rectangle
    graph.drawRect(50,50,50,50);

    //This will fill a rectangle
    graph.fillRect(50,50,60,60);
    } 
}




