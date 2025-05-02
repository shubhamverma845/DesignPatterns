package observer.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        jFrame = new JFrame();

        JButton jButton = new JButton("Should I do it?");

        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());

    }

    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't Do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
