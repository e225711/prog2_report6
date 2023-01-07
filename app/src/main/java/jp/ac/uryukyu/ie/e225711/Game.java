package jp.ac.uryukyu.ie.e225711;

/**
 * ゲームクラス。
 * Judge judge; //勝利判定をインスタンス化
 * BackProcess backProcess; //後ろの処理をインスタンス化
 * Player player1; //playerをインスタンス化
 * Player player2; //playerをインスタンス化
 * boolean gameLoop; //trueでゲーム継続,falseでゲーム終了
 * int loop; //奇数の時はplayer1、偶数のときはplayer2
 * Created by e225711
 */
public class Game {
  Judge judge = new Judge();
  BackProcess backProcess = new BackProcess();
  Player player1 = new Player();
  Player player2 = new Player();
  private boolean gameLoop = true;
  private int loop = 1;

  /**
   * gameLoopを受け取るメソッド。
   * 
   * @return gameLoop 対象
   */
  public boolean isGameLoop() {
    return this.gameLoop;
  }

  /**
   * gameLoopに代入するメソッド。
   * 
   * @param gameLoop true or false
   */
  public void setGameLoop(boolean gameLoop) {
    this.gameLoop = gameLoop;
  }

  /**
   * loopを受け取るメソッド。
   * 
   * @return loop 対象
   */
  public int getLoop() {
    return this.loop;
  }

  /**
   * loopへ代入するメソッド。
   * 
   * @param loop 数字
   */
  public void setLoop(int loop) {
    this.loop = loop;
  }

  /**
   * playerの名前を入力させるメソッド。
   */
  public void inputName() {
    System.out.println("先攻の名前を入力してください");
    String player1Name = new java.util.Scanner(System.in).next();
    System.out.println("後攻の名前を入力してください");
    String player2Name = new java.util.Scanner(System.in).next();

    player1.setName(player1Name);
    player2.setName(player2Name);
  }

  /**
   * ゲームをまとめ、実行するメソッド。
   */

  public void gameStart() {
    inputName();
    while (isGameLoop()) {
      if (getLoop() % 2 == 1) {
        System.out.println(player1.getName() + "の番です");
        System.out.println("持ち指は" + player1.remainFinger);

        backProcess.getInput(player1);
        if (backProcess.getCanUseFinger()) {
          if (!judge.winJudge(player1)) {
            setLoop(2);
          } else {
            System.out.println(player1.getName() + "の勝利です！\nゲームを終了します!");
            setGameLoop(false);
          }
        } else {
          setLoop(2);
        }
      } else {
        System.out.println(player2.getName() + "の番です");
        System.out.println("持ち指は" + player2.remainFinger);
        backProcess.getInput(player2);
        if (backProcess.getCanUseFinger()) {
          if (!judge.winJudge(player2)) {
            setLoop(1);
          } else {
            System.out.println(player2.getName() + "の勝利です！\nゲームを終了します!");
            setGameLoop(false);
          }
        } else {
          setLoop(1);
        }
      }
    }

  }
}
