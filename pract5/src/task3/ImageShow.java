package task3;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Image;

public class ImageShow extends JFrame{
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,900);

        ImageIcon icon = new ImageIcon("C:\\Users\\USER\\Desktop\\study\\2course\\JavaProg\\Git_Java\\pract5\\src\\task3\\MIREA.png");
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setVisible(true);

    }
}