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

Board board;  //Board object declaration
Car car;  //Car object declaration
int x, y; 

public void setup() {
      //Fullscreen window on 2nd monitor
    background(0);

    board = new Board(width, height);  //Construct board object
    car = new Car(width, height);  //Construct car object

    x = width/2;
    y = height/2;
    
}

public void draw() {
    background(0);

    board.display();

    car.display();
    car.move(x, y);
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
class Car {
    int width, height;
    int x, y;
    int xSize, ySize;

    Car(int _width, int _height) {
        width = _width;
        height = _height;
        xSize = 300;
        ySize = height/3;
    }

    public void display() {
        rectMode(CENTER);
        rect(x, y, xSize, ySize);
    }

    public void move(int _x, int _y) {
        x = _x;
        y = _y;

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
