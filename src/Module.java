import java.awt.*;

/**
 * Created by hiltjar000 on 4/10/2017.
 */
public class Module {
    public static int BORDER_SMALL = 0, BORDER_MED = 1, BORDER_LARGE = 2;


    private int x, y, width, height, border_size = 0;
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
        paintBorder(g);
    }


    private void paintBorder(Graphics g){
        if (border){
            if ( border_size == 0){
                for (int i = 0; i < 2; i++){
                    g.drawRect(x-1-i);
                }
            }
        }
    }
}
