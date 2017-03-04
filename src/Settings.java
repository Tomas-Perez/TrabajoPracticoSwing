/**
 * Settings manages the game settings logic,
 * including sound, music, shadows and Anti-aliasing.
 */
public class Settings {
    private boolean sound,music,shadows,aAliasing;

    public Settings(){
        sound = false;
        music = false;
        shadows = false;
        aAliasing = false;
    }

    /**
     *
     * @return The sound value.
     */
    public boolean isSound() {
        return sound;
    }

    /**
     *
     * @return The music value.
     */
    public boolean isMusic() {
        return music;
    }

    /**
     *
     * @return The shadows value.
     */
    public boolean isShadows() {
        return shadows;
    }

    /**
     *
     * @return The aAliasing value.
     */
    public boolean isaAliasing() {
        return aAliasing;
    }

    /**
     * Switches the sound boolean value, prints settings state in the console.
     */
    public void switchSound(){
        sound = !sound;
        printStatus();
    }

    /**
     * Switches the music boolean value, prints settings state in the console.
     */
    public void switchMusic(){
        music = !music;
        printStatus();
    }

    /**
     * Switches the shadows boolean value, prints settings state in the console.
     */
    public void switchShadows(){
        shadows = !shadows;
        printStatus();
    }

    /**
     * Switches the aAliasing boolean value, prints settings state in the console.
     */
    public void switchAAliasing(){
        aAliasing = !aAliasing;
        printStatus();
    }

    /**
     *
     * @return Settings toString
     */
    public String toString(){
        String sSound = "Sound: " + (sound ? "On" : "Off");
        String sMusic = "Music: " + (music ? "On" : "Off");
        String sShadows = "Shadows: " + (shadows ? "On" : "Off");
        String sAAliasing = "Anti-Aliasing: " + (aAliasing ? "On" : "Off");
        return sSound + ", " + sMusic + ", " + sShadows + ", " + sAAliasing;
    }

    /**
     * Prints settings state in the console.
     */
    private void printStatus(){
        System.out.println(toString());
    }
}
