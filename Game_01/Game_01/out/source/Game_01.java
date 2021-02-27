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

Board board;
int x, y;

public void setup() {
    
    background(0);
    //board object
    board = new Board(width, height);
    x = width/2;
    y = height/2;
}

public void draw() {
    background(0);
    //devide window to 3 areas
    board.display();

    rectMode(CENTER);
    rect(x, y, 300, height/3);
}

public void keyPressed() {
    if (key == CODED) {
        if (keyCode == LEFT) {
            if (x < width/3) {
                x = x;
            } else {
                x = x - (width/3);
            }
            
        } 

        if (keyCode == RIGHT) {
            if (x > (width/3) * 2) {
                x = x;
            } else {
                x = x + (width/3);
            }
        } 

        if (keyCode == UP) {
            if (y < (height/3)) {
                y = y;
            } else {
                y = y - (height/3);
            }
        }   

        if (keyCode == DOWN) {
            if (y > (height/3) * 2) {
                y = y;
            } else {
                y = y + (height/3);
             }
        }
    }
}

class Board{
    int width;
    int height;
    int x;

    Board(int _width, int _height) {
        width = _width;
        height = _height;
    }

    public void display() {
        stroke(255);
        strokeWeight(5);
        for (int i = 0; i < 2; ++i) {
            x = width/3 * (i + 1);
            line(x, 0, x, height);
        }
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
