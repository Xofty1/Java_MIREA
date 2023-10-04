package task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Painter extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;


    private Random rand = new Random();
    @Override
    protected void paintComponent(Graphics g) {


        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < 20; i++) {
            int shape = rand.nextInt(3);
            int x = rand.nextInt(width-50);
            int y = rand.nextInt(height-50);
            int size = rand.nextInt(100) + 10;


            if (shape == 0) {
                Circle cir = new Circle();
                cir.paintShape(x,y,size,g);
//                g.setColor(Color.RED);
//                g.fillOval(x, y, size, size); // Рисование круга
            } else if (shape == 1) {
                Square sq = new Square();
//                g.setColor(Color.GREEN);
//                g.fillRect(x, y, size, size); // Рисование прямоугольника
                sq.paintShape(x,y,size,g);
            } else {
                Rectangle rect = new Rectangle();
                rect.paintShape(x,y,size,g);
//                g.setColor(Color.BLUE);
//                int[] xPoints = {x, x + size, x + size / 2};
//                int[] yPoints = {y + size, y + size, y};
//                g.fillPolygon(xPoints, yPoints, 3); // Рисование треугольника
            }
        }

    }
    public static void main(String[] args) {
        Painter painter = new Painter();
        JFrame frame = new JFrame("Random Shapes Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);


        frame.add(painter);
        frame.setVisible(true);
    }
}
