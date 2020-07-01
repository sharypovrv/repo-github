package ru.geekbrains.level1.homeWork8;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 500);



        JPanel grid1 = new JPanel(new GridLayout(3, 4));
        JButton[] jbs = new JButton[20];
//        grid1.setBounds(100, 100, 300, 400);
        for (int i = 0; i < 15; i++) {
            jbs[i] = new JButton(String.valueOf(i + 1)) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(100, 100);
                }
            };
            grid1.add(jbs[i]);
        }


//        JPanel grid2 = new JPanel(new GridLayout(5, 1));
//        for (int i = 15; i < 20; i++) {
//            jbs[i] = new JButton("#" + (i + 1));
//            grid1.add(jbs[i]);
//        }
//

//        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(grid1);
////        add(grid2);


        setVisible(true);
//        setResizable(false);
    }


}
