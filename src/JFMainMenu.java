import javax.swing.*;
import java.awt.*;

/**
 *
 * JFMainMenu draws a window in the middle of the screen that displays the title of the project 'Trabajo Practico Swing',
 * a subtitle stating the authors of the project and 3 buttons 'Start Game', 'Settings' and 'Exit'.
 *
 * @author  Tomas Perez Molina
 * @author  Manuel Pedrozo
 *
 */

public class JFMainMenu extends JFrame {

    private JButton startGameButton;
    private JButton settingsButton;
    private JButton exitButton;

    public JFMainMenu() throws HeadlessException {
        super("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting default 'blank space' size
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

    /**
     * @return The start game button
     */

    public JButton getStartGameButton() {
        return startGameButton;
    }

    /**
     * @return The settings button
     */

    public JButton getSettingsButton() {
        return settingsButton;
    }

    /**
     * @return The exit button
     */

    public JButton getExitButton() {
        return exitButton;
    }

    /**
     * Shows the window.
     */

    public void showSelf(){
        setVisible(true);
    }

    /**
     * Hides the window.
     */

    public void hideSelf(){
        setVisible(false);
    }
}
