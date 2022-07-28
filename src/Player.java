import java.awt.*;

public class Player {
    private Color color;
    private int x;
    private int y;


    public Player(int x, int y){
        color = Color.BLUE;
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int num){
        x = num;
    }

    public void setY(int num){
        y = num;
    }

    public Color getColor(){
       return color;
    }
}
