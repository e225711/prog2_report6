package jp.ac.uryukyu.ie.e225711;

public class Game {
  Judge judge = new Judge();
  BackProcess backProcess = new BackProcess();
  Player player1 = new Player();
  Player player2 = new Player();

  private boolean gameLoop = true;

  public boolean isGameLoop() {
    return gameLoop;
  }

  public void setGameLoop(boolean gameLoop) {
    this.gameLoop = gameLoop;
  }

  private int loop = 1;

  public int getLoop() {
    return loop;
  }

  public void setLoop(int loop) {
    this.loop = loop;
  }

  public void gameStart() {
    System.out.println("先攻の名前を入力してください");
    String player1Name = new java.util.Scanner(System.in).next();
    System.out.println("後攻の名前を入力してください");
    String player2Name = new java.util.Scanner(System.in).next();

    player1.setName(player1Name);
    player2.setName(player2Name);

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
          if (!judge.winJudge(player1)) {
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
