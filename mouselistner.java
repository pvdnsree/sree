import java.awt.*;
import java.awt.event.*;

public class MouseListenerDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("MouseListener Demo");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        Label label = new Label("Click me!");
        frame.add(label);
        MouseListener listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at " + e.getX() + ", " + e.getY());
            }
        };
        label.addMouseListener(listener);

        frame.setVisible(true);
    }
}
