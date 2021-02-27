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

    void display() {
        rectMode(CENTER);
        rect(x, y, xSize, ySize);
    }

    void move(int _x, int _y) {
        x = _x;
        y = _y;

    }
}