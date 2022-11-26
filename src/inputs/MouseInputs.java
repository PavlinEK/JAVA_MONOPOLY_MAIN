package inputs;

import Game.GamePanel;
import gamestate.Gamestate;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseInputs implements MouseListener, MouseMotionListener {
    private GamePanel gamePanel;

    public MouseInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (Gamestate.state) {
            case MENU -> GamePanel.getGame().getMenu().mouseClicked(e);
            case PLAYING -> GamePanel.getGame().getPlaying().mouseClicked(e);
            default -> {
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch (Gamestate.state) {
            case MENU -> GamePanel.getGame().getMenu().mousePressed(e);
            case PLAYING -> GamePanel.getGame().getPlaying().mousePressed(e);
            default -> {
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        switch (Gamestate.state) {
            case MENU -> GamePanel.getGame().getMenu().mouseReleased(e);
            case PLAYING -> GamePanel.getGame().getPlaying().mouseReleased(e);
            default -> {
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        switch (Gamestate.state) {
            case PLAYING -> GamePanel.getGame().getPlaying().mouseDragged(e);
            default -> {
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        switch (Gamestate.state) {
            case MENU -> GamePanel.getGame().getMenu().mouseMoved(e);
            case PLAYING -> GamePanel.getGame().getPlaying().mouseMoved(e);
            default -> {
            }
        }
    }
}