void setup() {
    fullScreen(2);
    background(0);
}

void draw() {
    stroke(255);
    strokeWeight(5);
    for (int i = 0; i < 2; ++i) {
        int x = width/3 * (i + 1);
        line(x, 0, x, height);
    }

}

