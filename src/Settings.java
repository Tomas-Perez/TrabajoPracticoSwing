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
     * sound setter.
     * @param sound
     */
    public void setSound(boolean sound) {
        this.sound = sound;
        printStatus();
    }

    /**
     * music setter.
     * @param music
     */
    public void setMusic(boolean music) {
        this.music = music;
        printStatus();
    }

    /**
     * Switches shadows value.
     */
    public void switchShadows() {
        shadows = !shadows;
        printStatus();
    }

    /**
     * Switches aAliasing value.
     */
    public void switchAAliasing() {
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
