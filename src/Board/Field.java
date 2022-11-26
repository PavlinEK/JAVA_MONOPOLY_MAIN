package Board;

import Game.Game;
import gamestate.Playing;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Field {

    int number;
    private String name;
    String description;
    protected float x, y;
    protected int width, height;

    protected Rectangle2D.Float hitbox;
    private Playing playing;


    public Field(float x, float y, int width, int height, int number) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.number=number;
    }

    public void drawHitbox(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect((int) hitbox.x , (int) hitbox.y, (int) hitbox.width, (int) hitbox.height);
    }
    protected void initField(int width, int height) {

        hitbox = new Rectangle2D.Float(x, y, (int) (width * Game.SCALE), (int) (height * Game.SCALE));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;

    }

}
