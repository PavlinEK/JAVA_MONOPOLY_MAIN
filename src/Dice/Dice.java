package Dice;

import gamestate.Utilz.LoadSave;
import gamestate.Playing;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

import static gamestate.Utilz.Constants.Dice.*;
import static gamestate.Utilz.Constants.UI.Buttons.*;

public class Dice {
    public int rollDice;
    private final int x;
    private final int y;
    private int rowIndex;
    private int index;
    private int xOffsetCenter = B_WIDTH / 2;
    private Playing playing;
    private BufferedImage[] img;
    private boolean mouseOver, mousePressed;
    private Rectangle bounds;
    Random random = new Random();

    public Dice(int x, int y, Playing playing) {
        this.x = x;
        this.y = y;
        this.playing = playing;
        loadImgs();
        initBounds();
    }

    private void initBounds() {
        bounds = new Rectangle(x - xOffsetCenter, y, D_WIDTH, D_HEIGHT);
    }

    private void loadImgs() {
        img = new BufferedImage[6];
        BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.DICE);
        for (int i = 0; i < img.length; i++) {
            img[i] = temp.getSubimage(i * D_WIDTH_DEFAULT, 0, D_WIDTH_DEFAULT, D_HEIGHT_DEFAULT);
        }
    }

    public void draw(Graphics g) {
        g.drawImage(img[index], x - xOffsetCenter, y, D_WIDTH, D_HEIGHT, null);
    }

    public void update() {
        index = 0;
        if (mouseOver)
            index = 1;
        if (mousePressed)
            index = 2;
    }

    public void rollDice() {
        rollDice = random.nextInt(6) + 1;
    }

    public void printResult(int rollDice) {
        switch (rollDice) {
            case 1 -> img[index] = img[0];
            case 2 -> img[index] = img[1];
            case 3 -> img[index] = img[2];
            case 4 -> img[index] = img[3];
            case 5 -> img[index] = img[4];
            case 6 -> img[index] = img[5];
            default -> {
            }
        }
    }

    public boolean isMousePressed() {
        return mousePressed;
    }

    public void setMousePressed(boolean mousePressed) {
        this.mousePressed = mousePressed;
    }

}
