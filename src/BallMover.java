import java.util.TimerTask;

/**
 * Created by cerebro on 08/07/15.
 */
public class BallMover extends TimerTask {

    private Animation ballCanvas;
    private int direction = 1;

    public BallMover(Animation ballCanvas) {
        this.ballCanvas = ballCanvas;
    }

    @Override
    public void run() {
        if(ballCanvas.ballX == 280 || ballCanvas.ballY == 280) {
            direction = -1;
        } else if (ballCanvas.ballX == 0 || ballCanvas.ballY == 0) {
            direction = 1;
        }


        this.ballCanvas.ballX += 5*direction;
        this.ballCanvas.ballY += 5*direction;
        this.ballCanvas.repaint();
    }
}
