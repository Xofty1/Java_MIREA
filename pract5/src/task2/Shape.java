package task2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public abstract class Shape extends JPanel{
    abstract void paintShape(int x, int y, int size, Graphics g);
}
