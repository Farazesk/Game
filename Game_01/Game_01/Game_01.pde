Board board;
Car car;
int x, y;

void setup() {
    fullScreen(2);
    background(0);

    board = new Board(width, height);
    car = new Car(width, height);

    x = width/2;
    y = height/2;
    
}

void draw() {
    background(0);
    
    board.display();

    car.display();
    car.move(x, y);
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
    


