import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(){
        ImageIcon icon = new ImageIcon("snake.png");
        this.setIconImage(icon.getImage());
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
