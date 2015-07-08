import javax.swing.*;
import java.util.*;
import java.util.Timer;

/**
 * Created by cerebro on 08/07/15.
 */
public class Demo {

    public static void main(String[] args) {
        new Demo();
    }

    public Demo() {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        JPanel mainPanel = new JPanel();
        window.setContentPane(mainPanel);


        Animation a = new Animation(0, 150);
        mainPanel.add(a);


        window.setVisible(true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new BallMover(a), 10, 5);

    }
}
