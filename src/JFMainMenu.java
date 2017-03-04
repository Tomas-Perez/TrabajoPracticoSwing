import javax.swing.*;
import java.awt.*;

public class JFMainMenu extends JFrame {

    private JButton startGameButton;
    private JButton settingsButton;
    private JButton exitButton;

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

        //Title
        JLabel title = new JLabel("Trabajo Practico Swing");
        title.setFont(new Font("Title", Font.PLAIN, 55));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(title);

        //Subtitle
        JLabel subtitle = new JLabel("Tomas Perez Molina y Manuel Pedrozo");
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(subtitle);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        //Start Game
        startGameButton = new JButton("Start Game");
        Dimension buttonDimension = new Dimension(100,60);
        startGameButton.setMaximumSize(buttonDimension);
        startGameButton.setPreferredSize(buttonDimension);
        startGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(startGameButton);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        //Settings
        settingsButton = new JButton("Settings");
        settingsButton.setMaximumSize(buttonDimension);
        settingsButton.setPreferredSize(buttonDimension);
        settingsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(settingsButton);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        //Exit
        exitButton = new JButton("Exit");
        exitButton.setMaximumSize(buttonDimension);
        exitButton.setPreferredSize(buttonDimension);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(exitButton);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public JButton getStartGameButton() {
        return startGameButton;
    }

    public JButton getSettingsButton() {
        return settingsButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public void showSelf(){
        setVisible(true);
    }

    public void hideSelf(){
        setVisible(false);
    }
}
