import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public class startGameButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFMainMenu.hideSelf();
            jFGameMenu.showSelf();
        }
    }

    public class settingsButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFMainMenu.hideSelf();
            jFSettings.showSelf();
        }
    }

    public class exitButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public class gameBackButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jFGameMenu.hideSelf();
            jFMainMenu.showSelf();
        }
    }
}
