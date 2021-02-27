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

public class Game_01 extends PApplet {

public void setup() {
    
    background(0);
}

public void draw() {
    stroke(255);
    strokeWeight(5);
    for (int i = 0; i < 2; ++i) {
        int x = width/3 * (i + 1);
        line(x, 0, x, height);
    }

}

  public void settings() {  fullScreen(2); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Game_01" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
