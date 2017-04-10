import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by hiltjar000 on 4/10/2017.
 */
public class Main extends JPanel{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(600, 800));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        Main main = new Main();
        frame.add(main);


    }

    Timer timer = new Timer(1000/60, this::run);

    public Main(){
        setBackground(Color.BLACK);
        setVisible(true);
        timer.start();
    }

    public void run(ActionEvent e){
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
    }

}
