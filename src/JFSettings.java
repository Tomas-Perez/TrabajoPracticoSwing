import javax.swing.*;
import java.awt.*;

public class JFSettings extends JFrame{

    JButton backButton;
    JRadioButton sOnRbutton,sOffRbutton,mOnRbutton,mOffRbutton;
    JCheckBox shadowsCb,antialiasingCb;

    public JFSettings(){
        super("Settings");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

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

        pack();
        setVisible(true);
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JRadioButton getsOnRbutton() {
        return sOnRbutton;
    }

    public JRadioButton getsOffRbutton() {
        return sOffRbutton;
    }

    public JRadioButton getmOnRbutton() {
        return mOnRbutton;
    }

    public JRadioButton getmOffRbutton() {
        return mOffRbutton;
    }

    public JCheckBox getShadowsCb() {
        return shadowsCb;
    }

    public JCheckBox getAntialiasingCb() {
        return antialiasingCb;
    }
}
