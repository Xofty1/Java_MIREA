package task2;

import java.awt.*;

public class Circle extends Shape {
    @Override
    void paintShape(int x, int y, int size, Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }
}
