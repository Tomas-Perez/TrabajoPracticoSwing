import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller{
    private JFGameMenu gameMenu;
    private JFMainMenu mainMenu;
    private JFSettings settings;

    public Controller() {
        this.gameMenu = new JFGameMenu();
        this.mainMenu = new JFMainMenu();
        this.settings = new JFSettings();

        mainMenu.getSettingsButton().addActionListener(new settingsButtonAO());
    }

    public class startGameButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    public class settingsButtonAO implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
