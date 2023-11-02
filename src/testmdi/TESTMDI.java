package testmdi;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class TESTMDI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Motion Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        // Tạo một lắng nghe sự kiện di chuyển chuột
        MouseMotionListener motionListener = new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse moved to: x=" + x + ", y=" + y);
            }
        };

        // Đăng ký lắng nghe sự kiện cho JPanel
        panel.addMouseMotionListener(motionListener);

        frame.setVisible(true);
    }
}
