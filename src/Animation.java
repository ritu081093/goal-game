import java.awt.*;

/**
 * Created by cerebro on 08/07/15.
 */
public class Animation extends Canvas {

    public int ballX;
    public int ballY;

    public Animation(int ballX, int ballY) {
        super();
        this.ballX = ballX;
        this.ballY = ballY;
        this.setSize(300, 300);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.green);
        g.fillRect(0, 0, 300, 300);

        g.setColor(Color.red);
        g.fillOval(ballX, ballY, 20, 20);
    }
}
