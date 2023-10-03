public class Fon implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public Fon(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;

    }

    @Override
    public void run() {
        Turtle fon = new Turtle(this.positionX, this.positionY);
        fon.penColor(this.penColor);
        fon.width(5);
        fon.speed(2);

        fon.setPosition(25, -25);
        fon.setPosition(25, -100);
        fon.setPosition(50, -50);
        fon.setPosition(75, -100);
        fon.setPosition(75, 25);

        fon.setPosition(100, 0);
        fon.setPosition(100, -100);
        fon.setPosition(150, -75);
        fon.setPosition(150, -100);
        fon.setPosition(150, 0);
    }
}
