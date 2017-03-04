import javax.swing.*;
import java.awt.*;

public class JFMainMenu extends JFrame {
    public JFMainMenu() throws HeadlessException {
        super("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension fillerMinSize = new Dimension(20, 20);
        Dimension fillerPrefSize = new Dimension(20, 20);
        Dimension fillerMaxSize = new Dimension(20, 20);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        getContentPane().add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        JPanel middleContainer = new JPanel();
        middleContainer.setLayout(new BoxLayout (middleContainer, BoxLayout.Y_AXIS));

        getContentPane().add(middleContainer);

        getContentPane().add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        JLabel title = new JLabel("Trabajo Practico Swing");
        title.setFont(new Font("Title", Font.PLAIN, 55));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(title);


        JLabel subtitle = new JLabel("Tomas Perez Molina y Manuel Pedrozo");
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(subtitle);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        JButton startGame = new JButton("Start Game");
        Dimension d = new Dimension(100,60);
        startGame.setMaximumSize(d);
        startGame.setPreferredSize(d);
        startGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(startGame);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        JButton settings = new JButton("Settings");
        settings.setMaximumSize(d);
        settings.setPreferredSize(d);
        settings.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(settings);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        JButton exit = new JButton("Exit");
        exit.setMaximumSize(d);
        exit.setPreferredSize(d);
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(exit);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

}
