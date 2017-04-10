import java.awt.*;

/**
 * Created by hiltjar000 on 4/10/2017.
 */
public class Module {
    private int x, y, width, height;
    private boolean border = false, background = false;
    private Color bgColor;

    public Module(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }


    public void paint(Graphics g){
        if (border){
            
        }
    }
}
