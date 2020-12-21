package Snake;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeView extends JFrame {
    public JButton[] ButtonBody = new JButton[200];
    private Snake snake;
    private SnakeController snakeController;
    public JPanel panel1;
    public JButton bonusfood;
    public Fruit fruit;
    public Random random = new Random();

    SnakeView(SnakeController snakeController) {
        super("Змейка");
        this.snakeController = snakeController;
        snake = snakeController.getSnake();
        fruit = new Fruit();
        setBounds(200, 200, 500, 500);
        panel1 = new JPanel();
        bonusfood = new JButton();
        bonusfood.setEnabled(false);
        bonusfood.setBackground(new Color(238, 0, 0));
        createFirstSnake();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 500, 500);
        panel1.setBackground(new Color(238, 221, 130));
        getContentPane().setLayout(null);
        getContentPane().add(panel1);
        show();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createFirstSnake() {
        for (int i = 0; i < 5; i++) {
            ButtonBody[i] = new JButton("" + i);
            ButtonBody[i].setEnabled(false);
            ButtonBody[i].setBackground(new Color(0, 139, 0));
            panel1.add(ButtonBody[i]);
            ButtonBody[i].setBounds(snake.x[i], snake.y[i], 10, 10);
            snake.x[i + 1] = snake.x[i] - 10;
            snake.y[i + 1] = snake.y[i];
        }
    }

    void growUp() {
        ButtonBody[snake.getLength()] = new JButton(" " + snake.getLength());
        ButtonBody[snake.getLength()].setEnabled(false);
        ButtonBody[snake.getLength()].setBackground(new Color(0, 139, 0));
        panel1.add(ButtonBody[snake.getLength()]);
        ButtonBody[snake.getLength()].setBounds(snake.getPointBody()[snake.getLength() - 1].x, snake.getPointBody()[snake.getLength() - 1].y, 10, 10);
        snake.setLength(snake.getLength() + 1);
    }

    void moveForward() {
        for (int i = 0; i < snake.getLength(); i++) {
            snake.getPointBody()[i] = ButtonBody[i].getLocation();
        }
        snake.x[0] += snake.getDirectionX();
        snake.y[0] += snake.getDirectionY();
        ButtonBody[0].setBounds(snake.x[0], snake.y[0], 10, 10);

        for (int i = 1; i < snake.getLength(); i++) {
            ButtonBody[i].setLocation(snake.getPointBody()[i - 1]);
        }
        if (snake.x[0] == 500) {
            snakeController.stopGame();
        } else if (snake.x[0] == 0) {
            snakeController.stopGame();
        } else if (snake.y[0] == 500) {
            snakeController.stopGame();
        } else if (snake.y[0] == 0) {
            snakeController.stopGame();
        }
        createFruit();
        collisionFruit();
        panel1.repaint();
    }

    private void collisionFruit() {
        if (fruit.isFood()) {
            if (fruit.getPoint().x == snake.x[0] && fruit.getPoint().y == snake.y[0]) {
                panel1.remove(bonusfood);
                growUp();
                fruit.setFood(false);
            }
        }
    }

    private void createFruit() {
        if (!fruit.isFood()) {
            panel1.add(bonusfood);
            bonusfood.setBounds((10 * random.nextInt(49)), (10 * random.nextInt(24)), 10, 10);
            fruit.setPoint(bonusfood.getLocation());
            fruit.setFood(true);
        }
    }

}
