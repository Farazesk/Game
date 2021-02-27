Board board;
int x, y;

void setup() {
    fullScreen(2);
    background(0);
    //board object
    board = new Board(width, height);
    x = width/2;
    y = height/2;
}

void draw() {
    background(0);
    //devide window to 3 areas
    board.display();

    rectMode(CENTER);
    rect(x, y, 300, height/3);
}

void keyPressed() {
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

