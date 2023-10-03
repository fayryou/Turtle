public class Bob6 implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public Bob6(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(1);
        bob.speed(2);

        bob.right(270);
        bob.forward(100);

        for(int i=0; i<200; i++){
            bob.forward(i/50);
            bob.left(10);
        }
    }
}
