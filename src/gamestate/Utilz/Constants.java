package gamestate.Utilz;

import Game.*;

public class Constants {
    public static final float GRAVITY = 0.04f * Game.SCALE;
    public static final int ANI_SPEED = 25;

    public static class Environment {
        public static final int BOARD_WIDTH_DEFAULT = 800;
        public static final int BOARD_HEIGHT_DEFAULT = 800;
        public static final int SMALL_CLOUD_WIDTH_DEFAULT = 74;
        public static final int SMALL_CLOUD_HEIGHT_DEFAULT = 24;

        public static final int BOARD = (int) (BOARD_WIDTH_DEFAULT * Game.SCALE);
        public static final int BIG_CLOUD_HEIGHT = (int) (BOARD_HEIGHT_DEFAULT * Game.SCALE);
        public static final int SMALL_CLOUD_WIDTH = (int) (SMALL_CLOUD_WIDTH_DEFAULT * Game.SCALE);
        public static final int SMALL_CLOUD_HEIGHT = (int) (SMALL_CLOUD_HEIGHT_DEFAULT * Game.SCALE);
    }

    public static class UI {
        public static class Buttons {
            public static final int B_WIDTH_DEFAULT = 140;
            public static final int B_HEIGHT_DEFAULT = 56;
            public static final int B_WIDTH = (int) (B_WIDTH_DEFAULT * Game.SCALE);
            public static final int B_HEIGHT = (int) (B_HEIGHT_DEFAULT * Game.SCALE);
        }

        public static class PauseButtons {
            public static final int SOUND_SIZE_DEFAULT = 42;
            public static final int SOUND_SIZE = (int) (SOUND_SIZE_DEFAULT * Game.SCALE);
        }

        public static class URMButtons {
            public static final int URM_DEFAULT_SIZE = 56;
            public static final int URM_SIZE = (int) (URM_DEFAULT_SIZE * Game.SCALE);

        }

    }


    public static class Dice {
        public static final int D_WIDTH_DEFAULT = 557;
        public static final int D_HEIGHT_DEFAULT = 557;
        public static final int D_WIDTH = (int) (D_WIDTH_DEFAULT * Game.SCALE/12);
        public static final int D_HEIGHT = (int) (D_HEIGHT_DEFAULT * Game.SCALE/12);
    }



    public static class PlayerConstants {
        public static final int IDLE = 0;



        public static int GetSpriteAmount(int player_action) {
            return switch (player_action) {

                case IDLE -> 5;

                default -> 1;
            };
        }
    }
}
