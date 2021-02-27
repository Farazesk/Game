Board board;

void setup() {
    fullScreen(2);
    background(0);

    board = new Board(width, height);
}

void draw() {
    board.display();
}

