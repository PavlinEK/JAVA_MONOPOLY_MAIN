package entities;

import gamestate.Playing;
import Game.*;
import gamestate.Utilz.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;



public class  Player extends Entity {
    private BufferedImage playerIcon;

    private Playing playing;

    public Player(float x, float y, int width, int height, Playing playing) {
        super(x, y, width, height);
        this.playing = playing;

        //wallet
        this.maxHealth = 10;
        this.currentHealth = maxHealth;

        this.walkSpeed = Game.SCALE;

        loadPlayerIcon ();

        initHitbox(30, 20);

    }

    public void setLocation ( int startPosX, int startPosY) {
        this.x=startPosX;
        this.y=startPosY;
        hitbox.x = x;
        hitbox.y = y;
    }


    public void update() {

//        updatePos();
//        updateAnimationTick();
//        setAnimation();
    }

    public void render(Graphics g) {
        g.drawImage(playerIcon, (int)x,
                (int)y, width, height, null);

    }










    private void updateXPos(float xSpeed) {
            hitbox.x += xSpeed;
    }

    private void updateYPos(float xSpeed) {
        hitbox.y += xSpeed;
    }

// wallet
    public void changeHealth(int value) {
        currentHealth += value;
        if (currentHealth <= 0) {
            currentHealth = 0;
            //gameOver;
        } else if (currentHealth >= maxHealth)
            currentHealth = maxHealth;
    }

    public void loadPlayerIcon() {

        playerIcon = LoadSave.GetSpriteAtlas(LoadSave.PLAYER_HAT);

    }

    public void resetDirBooleans() {
//        left = false;
//        right = false;

    }

//    public boolean isLeft() {
//        return left;
//    }
//
//    public void setLeft(boolean left) {
//        this.left = left;
//    }
//
//
//    public boolean isRight() {
//        return right;
//    }
//
//    public void setRight(boolean right) {
//        this.right = right;
//    }


    public void resetAll() {
////        resetDirBooleans();
//        attacking = false;
//        moving = false;
//        state = IDLE;
//        currentHealth = maxHealth;
//
//        hitbox.x = x;
//        hitbox.y = y;

    }

}
