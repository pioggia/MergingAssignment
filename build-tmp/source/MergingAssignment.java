import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class MergingAssignment extends PApplet {

public void setup()
{
  size(300,300);
  background(0);
}
public void draw()
{
  fill(0,0,0,5);
  stroke(0,0,0,5);
  rect(0,0,300,300);
  noFill();
  stroke(255,0,255);
  translate(150,150);
  rotate(random(2*PI));
  ellipse(0,0,250,random(250));
}

public void setup()
{
  size(300,300);
  noLoop();
}
public void draw()
{
   int x = (int)(Math.random() * 300);
   ellipse(x,150,10,10);
}
public void mousePressed()
{
  redraw();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "MergingAssignment" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
