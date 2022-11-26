package ui;

import gamestate.Gamestate;
import gamestate.Playing;
import Game.*;

import java.awt.*;
import java.awt.event.KeyEvent;


public class GameOverOverlay {
    private Playing playing;
    public GameOverOverlay(Playing playing){
        this.playing=playing;
    }
    public void draw(Graphics g){
        g.setColor(new Color(0,0,0,200));
        g.fillRect(0,0, Game.GAME_WIDTH,Game.GAME_HEIGHT);

        g.setColor(Color.white);
        g.drawString("Game Over", Game.GAME_WIDTH/2,150);
        Gamestate.state=Gamestate.MENU;

    }

}
