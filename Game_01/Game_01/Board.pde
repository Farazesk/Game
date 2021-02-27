class Board{
    int width;
    int height;
    int x;

    Board(int _width, int _height) {
        width = _width;
        height = _height;
    }

    void display() {
        stroke(255);
        strokeWeight(5);
        for (int i = 0; i < 2; ++i) {
            x = width/3 * (i + 1);
            line(x, 0, x, height);
        }
    }
}