package entities;

import gamestate.Playing;
import gamestate.Utilz.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Player extends Entity {
    private BufferedImage playerIcon;

    private Playing playing;

    public Player(float x, float y, int width, int height, Playing playing) {
        super(x, y, width, height);
        this.playing = playing;

        loadPlayerIcon();
        initHitbox(30, 20);

    }

    public void setLocation(int startPosX, int startPosY) {
        this.x = startPosX;
        this.y = startPosY;
        hitbox.x = x;
        hitbox.y = y;
    }

    public void update() {

    }
    public void render(Graphics g) {
        g.drawImage(playerIcon, (int) x,
                (int) y, width, height, null);

    }

    public void loadPlayerIcon() {
        playerIcon = LoadSave.GetSpriteAtlas(LoadSave.PLAYER_HAT);
    }
}
