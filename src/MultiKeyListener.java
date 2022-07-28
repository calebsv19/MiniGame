import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MultiKeyListener implements KeyListener {
    // Set of currently pressed keys
    private final Set<Integer> pressedKeys = new HashSet<>();
    private Handler handler;

    private static final int ADD = 1;
    private static final double ROTATION = .02;

    public MultiKeyListener(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public synchronized void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == e.VK_D){
            System.out.println("Pressed UP");
            handler.moveRight();
        }

        if(e.getKeyCode() == e.VK_A){
            System.out.println("Pressed DOWN");
            handler.moveLeft();
        }

        if(e.getKeyCode() == e.VK_W){
            System.out.println("Pressed LEFT");
            handler.moveUp();
        }

        if(e.getKeyCode() == e.VK_S){
            System.out.println("Pressed RIGHT");
            handler.moveDown();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
