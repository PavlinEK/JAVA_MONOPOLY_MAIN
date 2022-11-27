package gamestate.Utilz;

import Game.*;

public class Constants {

    public static class UI {
        public static class Buttons {
            public static final int B_WIDTH_DEFAULT = 140;
            public static final int B_HEIGHT_DEFAULT = 56;
            public static final int B_WIDTH = (int) (B_WIDTH_DEFAULT * Game.SCALE);
            public static final int B_HEIGHT = (int) (B_HEIGHT_DEFAULT * Game.SCALE);
        }

    }

    public static class Dice {
        public static final int D_WIDTH_DEFAULT = 557;
        public static final int D_HEIGHT_DEFAULT = 557;
        public static final int D_WIDTH = (int) (D_WIDTH_DEFAULT * Game.SCALE / 12);
        public static final int D_HEIGHT = (int) (D_HEIGHT_DEFAULT * Game.SCALE / 12);
    }

    public static class TitleDeeds {
        public static final int TD_WIDTH_DEFAULT = 140;
        public static final int TD_HEIGHT_DEFAULT = 164;
        public static final int TD_WIDTH = (int) (TD_WIDTH_DEFAULT * Game.SCALE / 12);
        public static final int TD_HEIGHT = (int) (TD_HEIGHT_DEFAULT * Game.SCALE / 12);
    }

}
