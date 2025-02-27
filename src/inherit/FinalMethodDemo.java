package inherit;

public class FinalMethodDemo {

}

class Chess {
  enum ChessPlayer { WHITE, BLACK }

  ChessPlayer getFirstPlayer() {
    return ChessPlayer.WHITE;
  }
}

class WorldChess extends Chess {
  @Override
  ChessPlayer getFirstPlayer() {
    return ChessPlayer.BLACK;
  }
}
