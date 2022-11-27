package gamestate;

import Board.Board;
import Dice.Dice;
import Game.Game;
import entities.Player;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;


import static gamestate.Utilz.LoadSave.*;

public class Playing extends State implements Statemethods {
    private Player player;

    private BufferedImage boardImg, playerIcon;
    private Dice dice1, dice2;


    private int boardX, boardY, boardWidth, boardHeight,
            consoleX, consoleY, consoleWidth, consoleHeight,
            playerX, playerY, playerWidth, playerHeight;
    int[] posNum;

    private boolean active = true;
    Board board;


    public Playing(Game game) {
        super(game);
        initClasses();

    }

    private void initClasses() {

        board = new Board(boardX, boardY, boardWidth, boardHeight, this);
        board.loadBoard();
        board.setFields();
        board.loadImgsTitleDeeds();


        dice1 = new Dice((int) (Game.GAME_WIDTH / 3.5 - boardWidth / 2), (int) (boardHeight + 475),
                this);
        dice2 = new Dice((int) (Game.GAME_WIDTH / 2.85 - boardWidth / 2), (int) (boardHeight + 475),
                this);

        loadPlayer();
        player = new Player(playerX, playerY, playerWidth, playerHeight, this);



//        gameOverOverlay = new GameOverOverlay(this);

    }

    public void loadPlayer() {
        playerIcon = GetSpriteAtlas(PLAYER_HAT);
        playerWidth = (int) (30 * Game.SCALE);
        playerHeight = (int) (20 * Game.SCALE);
        playerX = 580;
        playerY = 580;

    }

    public void movePlayer() {

        int borderR = 580;
        int borderL = 50;
        int borderU = 60;
        int borderD = 580;

        //        move left
        if (playerX > borderL && playerY == borderD)
            playerX -= 53;
            //        move up
        else if (playerX == borderL && playerY > borderU)
            playerY -= 52;
            //       move right
        else if (playerX < borderR && playerY == borderU)
            playerX += 53;
            //        down
        else if (playerX == borderR && playerY < borderD)
            playerY += 52;

        player.setLocation(playerX, playerY);
        System.out.println(playerY);
    }

    public void setPosNum() {
        posNum = new int[40];

        for (int i = 0; i < 10; i++) {
            if (playerX == (580 - 53*i) && playerY == 580)
                posNum[i] = i;
        }

        for (int i = 10; i < 20; i++) {
            if (playerX == 50 && playerY == (580-52*i))
                posNum[i] = i;
        }
        for (int i = 20; i < 30; i++) {
            if (playerX == (50+53*i) && playerY == 60)
                posNum[i] = i;
        }
        for (int i = 30; i < 40; i++) {
            if (playerX == 580 && playerY == (60+53*i))
                posNum[i] = i;
        }

    }



    @Override
    public void update() {
        dice1.update();
        player.update();

    }

    @Override
    public void draw(Graphics g) {

        board.drawBoard(g);
        board.drawTitleDeeds(g);
        player.render(g);
        dice1.draw(g);
        dice2.draw(g);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        dice1.rollDice();
        dice1.printResult(dice1.rollDice);
        dice2.rollDice();
        dice2.printResult(dice2.rollDice);
        System.out.println(dice1.rollDice + " and " + dice2.rollDice);

        int diceTotal = dice1.rollDice + dice2.rollDice;
        for (int i = 0; i < diceTotal; i++) {
            setPosNum();
            movePlayer();
            board.printResult(posNum);
        }

//        board.printResult(posNum);


    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }


    public void mouseDragged(MouseEvent e) {

    }

    //
    public void resetAll() {

    }


    public boolean isActive() {
        return active;
    }

    public Player getPlayer() {
        return player;
    }


}
