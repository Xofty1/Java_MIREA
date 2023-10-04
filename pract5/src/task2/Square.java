package task2;

import java.awt.*;

public class Square extends Shape{
    @Override
    void paintShape(int x, int y, int size, Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, size, size);
    }
}
