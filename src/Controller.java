import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller manages the functionality of JFGameMenu, JFMainMenu and JFSettings windows, with listeners for each button.
 *
 * @author Tomas Perez Molina
 * @author Manuel Pedrozo
 */

public class Controller{
    private JFGameMenu jFGameMenu;
    private JFMainMenu jFMainMenu;
    private JFSettings jFSettings;

    public Controller() {
        this.jFGameMenu = new JFGameMenu();
        this.jFMainMenu = new JFMainMenu();
        this.jFSettings = new JFSettings();

        jFMainMenu.getStartGameButton().addActionListener(new startGameButtonAO());
        jFMainMenu.getSettingsButton().addActionListener(new settingsButtonAO());
        jFMainMenu.getExitButton().addActionListener(new exitButtonAO());
        jFGameMenu.getBackButton().addActionListener(new gameBackButtonAO());

        jFMainMenu.showSelf();
    }

    /**
     * Hides JFMainMenu window and shows JFGameMenu window.
     */

    public class startGameButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFMainMenu.hideSelf();
            jFGameMenu.showSelf();
        }
    }

    /**
     * Hides JFMainMenu window and shows JFSettings window.
     */

    public class settingsButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFMainMenu.hideSelf();
            jFSettings.showSelf();
        }
    }

    /**
     * Closes the program.
     */

    public class exitButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    /**
     * Hides JFGameMenu window and shows JFMainMenu window.
     */

    public class gameBackButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFGameMenu.hideSelf();
            jFMainMenu.showSelf();
        }
    }
}
