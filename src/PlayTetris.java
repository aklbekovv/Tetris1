import javax.swing.*;
import java.awt.*;

public class PlayTetris extends JFrame
{
    public static PlayTetris tetris;
    public static boolean isGameOver = false;
    public static TetrisComponent component;
    public PlayTetris()
    {
        getContentPane().setLayout(new FlowLayout());
        newGame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Daniel's Tetris");
    }

    public void newGame() {
        component = new TetrisComponent(13, 25);
        add(component);
        pack();
    }

    public static void restartGame() {
        if (tetris != null) {
            isGameOver = false;
            tetris.remove(component);
            tetris.newGame();
        }
    }

    public static void main(String[] args)
    {
        tetris = new PlayTetris();
    }
}