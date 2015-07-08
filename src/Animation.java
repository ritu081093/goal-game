import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by cerebro on 08/07/15.
 */
public class Animation extends Canvas implements KeyListener {

    public int ballX;
    public int ballY;
    public int paddleY = 50;

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

        g.setColor(Color.blue);
        g.fillRect(10, paddleY, 10, 50);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());

        if(e.getKeyCode() == 65) {
            paddleY -= 10;
        } else if(e.getKeyCode() == 83) {
            paddleY += 10;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
