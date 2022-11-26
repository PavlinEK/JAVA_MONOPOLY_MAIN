package Board;

import Game.Game;
import gamestate.Playing;
import gamestate.Utilz.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;

import static gamestate.Utilz.Constants.TitleDeeds.TD_HEIGHT_DEFAULT;
import static gamestate.Utilz.Constants.TitleDeeds.TD_WIDTH_DEFAULT;
import static gamestate.Utilz.LoadSave.*;


public class Board {


    private final Playing playing;

    private BufferedImage boardImg;
    private BufferedImage[][] titleDeedsImg;
    private int index1, index2;

    private int boardX, boardY, boardWidth, boardHeight;

    private static Field[] fields = new Field[40];

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

    public void loadBoard() {
        boardImg = GetSpriteAtlas(BOARD);
        boardWidth = (int) (boardImg.getWidth() * Game.SCALE);
        boardHeight = (int) (boardImg.getHeight() * Game.SCALE);
        boardX = 0;
        boardY = 0;

    }

    private void loadImgsTitleDeeds() {
        titleDeedsImg = new BufferedImage[6][5];
        BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.TITLE_ATLAS);
        for (int j = 0; j < titleDeedsImg.length; j++) {
            for (int i = 0; i < titleDeedsImg[j].length; i++) {
                titleDeedsImg[j][i] = temp.getSubimage(i * TD_WIDTH_DEFAULT,  j*TD_HEIGHT_DEFAULT, TD_WIDTH_DEFAULT, TD_HEIGHT_DEFAULT);
            }
        }
    }
    public void drawTitleDeeds(Graphics g) {
        g.drawImage(titleDeedsImg[index1][index2], 700, 170, TD_WIDTH_DEFAULT, TD_HEIGHT_DEFAULT, null);
    }

    public void printResult(int fieldNumber) {
        switch (fieldNumber) {
            case 1 -> titleDeedsImg[index1][index2] = titleDeedsImg[0][0];
//            case 2 -> ;
            case 3 -> titleDeedsImg[index1][index2] = titleDeedsImg[0][1];
//            case 4 -> ;
            case 5 -> titleDeedsImg[index1][index2] = titleDeedsImg[4][2];
            case 6 -> titleDeedsImg[index1][index2] = titleDeedsImg[0][2];
//            case 7 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 8 -> titleDeedsImg[index1][index2] = titleDeedsImg[0][3];
            case 9 -> titleDeedsImg[index1][index2] = titleDeedsImg[0][4];
//            case 10 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 11 -> titleDeedsImg[index1][index2] = titleDeedsImg[1][0];
            case 12 -> titleDeedsImg[index1][index2] = titleDeedsImg[4][0];
            case 13 -> titleDeedsImg[index1][index2] = titleDeedsImg[1][1];
            case 14 -> titleDeedsImg[index1][index2] = titleDeedsImg[1][2];
            case 15 -> titleDeedsImg[index1][index2] = titleDeedsImg[4][3];
            case 16 -> titleDeedsImg[index1][index2] = titleDeedsImg[1][3];
//            case 17 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 18 -> titleDeedsImg[index1][index2] = titleDeedsImg[1][4];
            case 19 -> titleDeedsImg[index1][index2] = titleDeedsImg[1][5];
//            case 20 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 21 -> titleDeedsImg[index1][index2] = titleDeedsImg[2][0];
//            case 22 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 23 -> titleDeedsImg[index1][index2] = titleDeedsImg[2][1];
            case 24 -> titleDeedsImg[index1][index2] = titleDeedsImg[2][2];
            case 25 -> titleDeedsImg[index1][index2] = titleDeedsImg[4][4];
            case 26 -> titleDeedsImg[index1][index2] = titleDeedsImg[2][3];
            case 27 -> titleDeedsImg[index1][index2] = titleDeedsImg[2][4];
            case 28 -> titleDeedsImg[index1][index2] = titleDeedsImg[4][1];
            case 29 -> titleDeedsImg[index1][index2] = titleDeedsImg[2][5];
//            case 30 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 31 -> titleDeedsImg[index1][index2] = titleDeedsImg[3][0];
            case 32 -> titleDeedsImg[index1][index2] = titleDeedsImg[3][1];
//            case 33 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 34 -> titleDeedsImg[index1][index2] = titleDeedsImg[3][2];
            case 35 -> titleDeedsImg[index1][index2] = titleDeedsImg[4][5];
//            case 36 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 37 -> titleDeedsImg[index1][index2] = titleDeedsImg[3][3];
//            case 38 -> titleDeedsImg[index] = titleDeedsImg[5];
            case 39 -> titleDeedsImg[index1][index2] = titleDeedsImg[3][4];
//            case 40 -> titleDeedsImg[index] = titleDeedsImg[5];





            default -> {
            }
        }
    }

}
