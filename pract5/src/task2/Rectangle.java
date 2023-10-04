package task2;

import java.awt.*;

public class Rectangle extends Shape{

    @Override
    void paintShape(int x, int y, int size, Graphics g) {
        g.setColor(Color.BLUE);
        int[] xPoints = {x, x + size, x + size / 2};
        int[] yPoints = {y + size, y + size, y};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
