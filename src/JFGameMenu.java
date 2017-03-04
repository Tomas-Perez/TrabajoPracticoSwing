import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JFGameMenu extends JFrame{

    private JButton backButton;

    public JFGameMenu() throws HeadlessException {
        super("Game");

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

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        try {
            BufferedImage gameImage = ImageIO.read(new File("./Image/Pac-man.png"));
            JLabel imageLabel = new JLabel(new ImageIcon(gameImage));
            imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            middleContainer.add(imageLabel);
        } catch (IOException e){
            System.out.println("No se encontro la imagen");
        }

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));

        backButton = new JButton("Back");
        Dimension buttonDimension = new Dimension(100,60);
        backButton.setMaximumSize(buttonDimension);
        backButton.setPreferredSize(buttonDimension);
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        middleContainer.add(backButton);

        middleContainer.add(new Box.Filler(fillerMinSize, fillerPrefSize, fillerMaxSize));


        setLocationRelativeTo(null);
        pack();
    }

    public void showSelf(){
        setVisible(true);
    }

    public void hideSelf(){
        setVisible(false);
    }

    public JButton getBackButton() {
        return backButton;
    }
}
