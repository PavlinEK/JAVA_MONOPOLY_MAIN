package Board;

import Game.Game;
import entities.Player;
import gamestate.Playing;

import java.awt.*;
import java.awt.image.BufferedImage;

import static gamestate.Utilz.LoadSave.*;


public class Board {


    private final Playing playing;
    public int[] playerPosX;
    private BufferedImage boardImg;

    private int boardX, boardY, boardWidth, boardHeight;

    private static Field[] fields = new Field[40];
    public Player player;
    int currentField = 0;

    public Board(int boardX, int boardY, int boardWidth, int boardHeight, Playing playing) {

        this.boardX = boardX;
        this.boardY = boardY;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.playing = playing;
    }

    public void drawBoard(Graphics g) {
        g.drawImage(boardImg, boardX, boardY, boardWidth, boardHeight, null);
        drawMap(g);
    }

    private void drawMap(Graphics g) {

        fields[0].initField(58, 58);
        for (int i = 1; i < 10; i++) {
            fields[i].initField(35, 59);
        }
        fields[10].initField(58, 58);
        for (int i = 11; i < 20; i++) {
            fields[i].initField(59, 35);
        }
        fields[20].initField(58, 58);
        for (int i = 21; i < 30; i++) {
            fields[i].initField(35, 59);
        }
        fields[30].initField(58, 58);
        for (int i = 31; i < 40; i++) {
            fields[i].initField(59, 35);
        }

        for (Field field : fields) {
            field.drawHitbox(g);
        }

    }

    public void setFields() {

        //долен ред от ляво на дясно
        Field fStart = new Field(boardWidth - 97, boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 0);
        Field f1 = new Field(fStart.getX() - 52, boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 1);
        Field f2 = new Field((float) (f1.getX() - 52.5), boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 2);
        Field f3 = new Field((float) (f2.getX() - 52.5), boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 3);
        Field f4 = new Field((float) (f3.getX() - 52.5), boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 4);
        Field f5 = new Field((float) (f4.getX() - 52.5), boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 5);
        Field f6 = new Field((float) (f5.getX() - 52.5), boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 6);
        Field f7 = new Field((float) (f6.getX() - 52.5), boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 7);
        Field f8 = new Field((float) (f7.getX() - 52.5), boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 8);
        Field f9 = new Field((float) (f8.getX() - 52.5), boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 9);
        Field fJail = new Field(10, boardHeight - 95, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 10);

        //лява колона
        Field f11 = new Field(10, boardHeight - 145, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 11);
        Field f12 = new Field(10, (float) (f11.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 12);
        Field f13 = new Field(10, (float) (f12.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 13);
        Field f14 = new Field(10, (float) (f13.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 14);
        Field f15 = new Field(10, (float) (f14.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 15);
        Field f16 = new Field(10, (float) (f15.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 16);
        Field f17 = new Field(10, (float) (f16.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 17);
        Field f18 = new Field(10, (float) (f17.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 18);
        Field f19 = new Field(10, (float) (f18.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 19);


        // горен ред от дясно наляво
        Field fFreeParking = new Field(10, 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 20);
        Field fGoToJail = new Field(boardWidth - 97, 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 30);
        Field f29 = new Field(fGoToJail.getX() - 52, 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 29);
        Field f28 = new Field((float) (f29.getX() - 52.5), 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 28);
        Field f27 = new Field((float) (f28.getX() - 52.5), 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 27);
        Field f26 = new Field((float) (f27.getX() - 52.5), 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 26);
        Field f25 = new Field((float) (f26.getX() - 52.5), 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 25);
        Field f24 = new Field((float) (f25.getX() - 52.5), 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 24);
        Field f23 = new Field((float) (f24.getX() - 52.5), 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 23);
        Field f22 = new Field((float) (f23.getX() - 52.5), 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 22);
        Field f21 = new Field((float) (f22.getX() - 52.5), 7, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 21);
        // дясна колона
        Field f39 = new Field(boardWidth - 97, boardHeight - 145, (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 39);
        Field f38 = new Field(boardWidth - 97, (float) (f39.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 38);
        Field f37 = new Field(boardWidth - 97, (float) (f38.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 37);
        Field f36 = new Field(boardWidth - 97, (float) (f37.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 36);
        Field f35 = new Field(boardWidth - 97, (float) (f36.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 35);
        Field f34 = new Field(boardWidth - 97, (float) (f35.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 34);
        Field f33 = new Field(boardWidth - 97, (float) (f34.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 33);
        Field f32 = new Field(boardWidth - 97, (float) (f33.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 32);
        Field f31 = new Field(boardWidth - 97, (float) (f32.getY() - 52.5), (int) (1 * Game.SCALE), (int) (1 * Game.SCALE), 31);

        fields = new Field[40];
        fields[0] = fStart;
        fields[1] = f1;
        fields[2] = f2;
        fields[3] = f3;
        fields[4] = f4;
        fields[5] = f5;
        fields[6] = f6;
        fields[7] = f7;
        fields[8] = f8;
        fields[9] = f9;
        fields[10] = fJail;
        fields[11] = f11;
        fields[12] = f12;
        fields[13] = f13;
        fields[14] = f14;
        fields[15] = f15;
        fields[16] = f16;
        fields[17] = f17;
        fields[18] = f18;
        fields[19] = f19;
        fields[20] = fFreeParking;
        fields[21] = f21;
        fields[22] = f22;
        fields[23] = f23;
        fields[24] = f24;
        fields[25] = f25;
        fields[26] = f26;
        fields[27] = f27;
        fields[28] = f28;
        fields[29] = f29;
        fields[30] = fGoToJail;
        fields[31] = f31;
        fields[32] = f32;
        fields[33] = f33;
        fields[34] = f34;
        fields[35] = f35;
        fields[36] = f36;
        fields[37] = f37;

        fields[38] = f38;
        fields[39] = f39;

    }
    public void setPlaygroundX(int[]movePosX) {
   int startPos=570;
        for (int i = 0; i < movePosX.length; i++)
            movePosX[i] = (startPos -= 50);
    }

    public void loadBoard() {
        boardImg = GetSpriteAtlas(BOARD);
        boardWidth = (int) (boardImg.getWidth() * Game.SCALE);
        boardHeight = (int) (boardImg.getHeight() * Game.SCALE);
        boardX = 0;
        boardY = 0;


    }


    public void setFields(Field[] fields) {
        this.fields = fields;

    }

    public static Field[] getFields() {
        return fields;
    }
}
