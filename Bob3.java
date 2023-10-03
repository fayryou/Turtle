public class Bob3 implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public Bob3(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(5);
        bob.speed(2);

        bob.right(90);
        for (int i = 0; i < 5; i++) {
            bob.forward(10);
            bob.up();
            bob.forward(10);
            bob.down();
        }
    }
}
