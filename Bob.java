public class Bob implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public Bob(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(10);
        bob.speed(20);
        bob.bgcolor("lightyellow");

        bob.setPosition(0, 100);
        bob.setPosition(-150, 0);
        bob.setPosition(150, 0);
        bob.setPosition(0, 100);
        bob.setPosition(-100, 0);
        bob.setPosition(-50, 0);
        bob.setPosition(0, 100);
        bob.setPosition(50, 0);
        bob.setPosition(100, 0);
        bob.setPosition(0, 100);
        bob.setPosition(0, -100);
        bob.setPosition(-25, -100);
        bob.setPosition(-25, -75);
    }
}
