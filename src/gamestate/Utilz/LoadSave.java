package gamestate.Utilz;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class LoadSave {
    public static final String PLAYER_HAT = "hat.png";
    public static final String PLAYER_CAR = "car.png";
    public static final String PLAYER_IRON = "iron.png";
    public static final String PLAYER_SHOE = "shoe.png";
    public static final String BOARD = "Board.png";
    public static final String MENU_BUTTONS = "button_atlas.png";
    public static final String URM_BUTTONS = "urm_buttons.png";
    public static final String MENU_BACKGROUND_IMG = "background_menu.png";
    public static final String MENU_BACKGROUND = "menu_background.png";

    public static final String DICE = "Dice.png";




    public static BufferedImage GetSpriteAtlas(String fileName) {
        BufferedImage img = null;
        InputStream is = LoadSave.class.getResourceAsStream("/" + fileName);
        try {
            img = ImageIO.read(is);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return img;
    }
}
