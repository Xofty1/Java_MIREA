package task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JPanel {

    private int currentFrame = 0;
    private Image[] frames; // Массив изображений кадров
    private Timer timer; // Таймер для обновления анимации

    public Animation() {

        frames = new Image[5];
        for (int i = 0; i < 5; i++) {
            frames[i] = new ImageIcon("C:\\Users\\USER\\Desktop\\study\\2course\\JavaProg\\Git_Java\\pract5\\src\\task4\\fire" + (i+1) + ".png").getImage();
        }


        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Обновление кадра
                currentFrame = (currentFrame + 1) % frames.length;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrame], 0, 0, null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sprite Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.add(new Animation());
        frame.setVisible(true);
    }
}