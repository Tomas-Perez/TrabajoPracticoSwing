import javax.swing.*;
import java.awt.*;

/**
 *
 * JFMainMenu draws a window in the middle of the screen that shows buttons and checkboxes including:
 * <ul>
 *     <li>Sound ON/OFF</li>
 *     <li>Music ON/OFF</li>
 *     <li>Graphics:
 *     <ul>
 *         <li>Shadows checkbox</li>
 *         <li>Antialiasing checkbox</li>
 *     </ul>
 *     </li>
 *     <li>Back</li>
 * </ul>
 *
 * @author  Tomas Perez Molina
 * @author  Manuel Pedrozo
 *
 */

public class JFSettings extends JFrame{

    private JButton backButton;
    private JRadioButton sOnRbutton,sOffRbutton,mOnRbutton,mOffRbutton;
    private JCheckBox shadowsCb,antialiasingCb;

    public JFSettings(){
        super("Settings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        // Setting default 'blank space' size
        Dimension fillerMinSize = new Dimension(20, 10);
        Dimension fillerPrefSize = new Dimension(20, 10);
        Dimension fillerMaxSize = new Dimension(20, 10);

        getContentPane().add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        JLabel settingsLbl = new JLabel("Settings");
        settingsLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        getContentPane().add(settingsLbl);

        getContentPane().add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        //Sound
        JPanel soundPanel = new JPanel(new FlowLayout());
        JLabel soundLbl = new JLabel("Sound:");
        soundLbl.setAlignmentX(Component.LEFT_ALIGNMENT);
        soundLbl.setPreferredSize(new Dimension(78,10));
        soundLbl.setMaximumSize(new Dimension(78,10));
        soundLbl.setMinimumSize(new Dimension(78,10));
        soundPanel.add(soundLbl);
        sOnRbutton = new JRadioButton("On");
        sOffRbutton = new JRadioButton("Off");
        ButtonGroup soundRbGroup = new ButtonGroup();
        soundRbGroup.add(sOnRbutton);
        soundRbGroup.add(sOffRbutton);
        soundPanel.add(sOnRbutton);
        soundPanel.add(sOffRbutton);
        getContentPane().add(soundPanel);

        //Music
        JPanel musicPanel = new JPanel(new FlowLayout());
        JLabel musicLbl = new JLabel("Music:");
        musicLbl.setAlignmentX(Component.LEFT_ALIGNMENT);
        Dimension musicLblDimension = new Dimension(77,10);
        musicLbl.setPreferredSize(musicLblDimension);
        musicLbl.setMaximumSize(musicLblDimension);
        musicLbl.setMinimumSize(musicLblDimension);
        musicPanel.add(musicLbl);
        mOnRbutton = new JRadioButton("On");
        mOffRbutton = new JRadioButton("Off");
        ButtonGroup musicRbGroup = new ButtonGroup();
        musicRbGroup.add(mOnRbutton);
        musicRbGroup.add(mOffRbutton);
        musicPanel.add(mOnRbutton);
        musicPanel.add(mOffRbutton);
        getContentPane().add(musicPanel);

        //Graphics
        JLabel graphicsLbl = new JLabel("Graphics:");
        Dimension graphicsLblDimension = new Dimension(85,15);
        graphicsLbl.setPreferredSize(graphicsLblDimension);
        graphicsLbl.setMaximumSize(graphicsLblDimension);
        graphicsLbl.setMinimumSize(graphicsLblDimension);
        graphicsLbl.setAlignmentX(Component.RIGHT_ALIGNMENT);
        getContentPane().add(graphicsLbl);
        JPanel graphicsCbPanel = new JPanel(new FlowLayout());
        shadowsCb = new JCheckBox("Shadows");
        antialiasingCb = new JCheckBox("Anti-aliasing");
        graphicsCbPanel.add(shadowsCb);
        graphicsCbPanel.add(antialiasingCb);
        getContentPane().add(graphicsCbPanel);

        //Back
        backButton = new JButton("Back");
        Dimension buttonDimension = new Dimension(150,30);
        backButton.setMaximumSize(buttonDimension);
        backButton.setPreferredSize(buttonDimension);
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        getContentPane().add(backButton);

        getContentPane().add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    /**
     *
     * @return the back button.
     */

    public JButton getBackButton() {
        return backButton;
    }

    /**
     *
     * @return the sound on button.
     */

    public JRadioButton getsOnRbutton() {
        return sOnRbutton;
    }

    /**
     *
     * @return the sound off button.
     */

    public JRadioButton getsOffRbutton() {
        return sOffRbutton;
    }

    /**
     *
     * @return the music on button.
     */

    public JRadioButton getmOnRbutton() {
        return mOnRbutton;
    }

    /**
     *
     * @return the music off button.
     */

    public JRadioButton getmOffRbutton() {
        return mOffRbutton;
    }

    /**
     *
     * @return the shadows checkbox.
     */

    public JCheckBox getShadowsCb() {
        return shadowsCb;
    }

    /**
     *
     * @return the antialiasing checkbox.
     */

    public JCheckBox getAntialiasingCb() {
        return antialiasingCb;
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
