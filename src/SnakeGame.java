import javax.swing.*;

public class SnakeGame extends JFrame {

    Board board;

    SnakeGame(){
        board= new Board();
        add(board);
        pack();
        setResizable(false);

        setVisible(true);
    }
    public static void main(String[] args) {

        SnakeGame snakeGame=new SnakeGame();
    }
}