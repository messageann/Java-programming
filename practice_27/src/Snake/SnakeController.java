package Snake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class SnakeController implements KeyListener, ActionListener {
    private SnakeView gameView;
    private Timer mainTimer;
    private Snake snake;

    public SnakeController() {
        snake = new Snake();
        gameView = new SnakeView(this);
        this.gameView.addKeyListener(this);
        this.mainTimer = new Timer(50, this);
        mainTimer.start();
    }

    public void stopGame() {
        mainTimer.stop();
    }

    public void keyPressed(KeyEvent e) {
        snake.onMove(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        gameView.moveForward();
    }

    public Snake getSnake() {
        return snake;
    }
}