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

public class SampleAssignment extends PApplet {

int c1 = color(255,0,255);
public void setup()
{
  size(300,300);
  background(0);
  frameRate(100);
}
public void draw()
{
  fill(0,0,0,3);
  stroke(0,0,0,3);
  rect(0,0,300,300);
  noFill();
  stroke(c1);
  translate(150,150);
  rotate(random(360));
  ellipse(0,0,250,random(250));
}

public void mouseClicked()
{
  c1 = color(300-mouseX, 255*cos(mouseY), mouseX);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SampleAssignment" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
