package gamestate;

import Game.Game;
import gamestate.Utilz.LoadSave;
import ui.MenuButton;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Menu extends State implements Statemethods {
    private MenuButton[] buttons = new MenuButton[3];
    private BufferedImage backgroundImg;
    private final BufferedImage backgroundImgPink;

    private int menuX, menuY, menuWidth, menuHeight;

    public Menu(Game game) {
        super(game);
        loadButtons();
        backgroundImgPink=LoadSave.GetSpriteAtlas(LoadSave.MENU_BACKGROUND_IMG);
    }


    private void loadButtons() {
        buttons[0] = new MenuButton((int) (100* Game.SCALE), (int) (10 * Game.SCALE), 0, Gamestate.PLAYING);
        buttons[1] = new MenuButton((int) (100* Game.SCALE), (int) (80 * Game.SCALE), 1, Gamestate.OPTIONS);
        buttons[2] = new MenuButton((int) (100* Game.SCALE), (int) (150 * Game.SCALE), 2, Gamestate.QUIT);
    }

    @Override
    public void update() {
        for (MenuButton mb : buttons) {
            mb.update();
        }
    }


    @Override
    public void draw(Graphics g) {
        g.drawImage(backgroundImgPink,0,0,Game.GAME_WIDTH,Game.GAME_HEIGHT,null);
        g.drawImage(backgroundImg, menuX, menuY, menuWidth, menuHeight, null);

        for (MenuButton mb : buttons) {
            mb.draw(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (MenuButton mb : buttons) {
            if (isIn(e, mb)) {
                mb.setMousePressed(true);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (MenuButton mb : buttons) {
            if (isIn(e, mb)) {
                if (mb.isMousePressed())
                    mb.applyGamestate();
                break;
            }
        }
        resetButtons();
    }

    private void resetButtons() {
        for (MenuButton mb : buttons) {
            mb.resetBools();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        for (MenuButton mb : buttons)
            mb.setMouseOver(false);
        for (MenuButton mb : buttons)
            if (isIn(e, mb)) {
                mb.setMouseOver(true);
                break;
            }

    }

}
