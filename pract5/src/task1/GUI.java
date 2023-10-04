package task1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class GUI extends JFrame {
    private JButton Madrid = new JButton("Real Madrid");
    private JButton Milan = new JButton("AC Milan");
    private JButton endGame = new JButton("End match");

    private int rMadrid = 0;
    private int acMilan =0;
    private JLabel table = new JLabel("Result:" + acMilan + " X " +rMadrid);
    private JLabel l_Madrid = new JLabel("0");

    private JLabel l_Milan = new JLabel("0");
    private JLabel lastScore = new JLabel("Last Scorer: N/A");
            public GUI()
            {
                l_Madrid.setFont(l_Madrid.getFont().deriveFont(40.0f));
                l_Milan.setFont(l_Milan.getFont().deriveFont(40.0f));
                JFrame frame = new JFrame("Football");
                this.setBounds(200,200,500,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Container container = this.getContentPane();
                container.setLayout(new GridLayout (2,3));
//                container.add(table);
                container.add(l_Madrid);
                container.add(l_Milan);
                container.add(lastScore);
                container.add(Madrid);
                container.add(Milan);
                container.add(endGame);

                Milan.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        acMilan +=1;
                        l_Milan.setText(String.valueOf(acMilan));
                        lastScore.setText("Last Scorer: AC Milan");
                    }
                });
                Madrid.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rMadrid +=1;
                        l_Madrid.setText(String.valueOf(rMadrid));
                        lastScore.setText("Last Scorer: Real Madrid");
                    }
                });
                endGame.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String message = "Winner ";
                        if (acMilan>rMadrid)
                        {
                            message += "AC Milan";
                        }
                        else if (rMadrid>acMilan)
                            message += "Real Madrid";
                        else
                            message +="DRAW";
                        dispose();
                        JOptionPane.showMessageDialog(null, message, "Winner", JOptionPane.PLAIN_MESSAGE);
                    }
                });


            }

            }


