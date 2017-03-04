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
    private Settings settings;

    public Controller() {
        this.jFGameMenu = new JFGameMenu();
        this.jFMainMenu = new JFMainMenu();
        this.jFSettings = new JFSettings();
        settings = new Settings();

        jFMainMenu.getStartGameButton().addActionListener(new StartGameButtonAO());
        jFMainMenu.getSettingsButton().addActionListener(new SettingsButtonAO());
        jFMainMenu.getExitButton().addActionListener(new ExitButtonAO());
        jFGameMenu.getBackButton().addActionListener(new GameBackButtonAO());
        jFSettings.getBackButton().addActionListener(new SettingsBackButtonAO());
        jFSettings.getmOffRbutton().addActionListener(new MusicRbuttonAO());
        jFSettings.getmOnRbutton().addActionListener(new MusicRbuttonAO());
        jFSettings.getsOffRbutton().addActionListener(new SoundRbuttonAO());
        jFSettings.getsOnRbutton().addActionListener(new SoundRbuttonAO());
        jFSettings.getShadowsCb().addActionListener(new ShadowsCbAO());
        jFSettings.getAntialiasingCb().addActionListener(new AAliasingCbAO());

        jFMainMenu.showSelf();
    }

    /**
     * Hides JFMainMenu window and shows JFGameMenu window.
     */

    class StartGameButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFMainMenu.hideSelf();
            jFGameMenu.showSelf();
        }
    }

    /**
     * Hides JFMainMenu window and shows JFSettings window.
     */

    class SettingsButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFMainMenu.hideSelf();
            jFSettings.showSelf();
        }
    }

    /**
     * Closes the program.
     */

    class ExitButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    /**
     * Hides JFGameMenu window and shows JFMainMenu window.
     */

    class GameBackButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFGameMenu.hideSelf();
            jFMainMenu.showSelf();
        }
    }

    /**\
     * Hides JFSettings window and shows JFMainMenu window.
     */
    class SettingsBackButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFSettings.hideSelf();
            jFMainMenu.showSelf();
        }
    }

    /**
     * Updates sound state in model.
     */
    class SoundRbuttonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.switchSound();
        }
    }

    /**
     * Updates music state in model.
     */
    class MusicRbuttonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.switchMusic();
        }
    }

    /**
     * Updates shadows state in model.
     */
    class ShadowsCbAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.switchShadows();
        }
    }

    /**
     * Updates aAliasing state in model.
     */
    class AAliasingCbAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.switchAAliasing();
        }
    }

}
