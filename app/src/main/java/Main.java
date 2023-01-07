import jp.ac.uryukyu.ie.e225711.Game;

/**
 * Mainクラス
 * 実行するためのクラス
 * 
 * Game game; //Gameクラスのインスタンス化
 * Created by e225711
 */
public class Main {
  /**
   * ゲームを実行するメソッド。
   * 
   * @param args 慣習的に使用
   */
  public static void main(String[] args) {
    Game game = new Game();
    game.gameStart();
  }
}
