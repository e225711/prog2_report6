package jp.ac.uryukyu.ie.e225711;

/**
 * 後ろの処理クラス。
 * boolean canUseFinger; //数字が正常に使えたら、true,使えなかったらfalse
 * String fingerNum; //使用する指の数字
 * Created by e225711
 */
public class BackProcess {
  private boolean canUseFinger;
  private String fingerNum;

  /**
   * canUseFingerを受け取るメソッド。
   */
  public boolean getCanUseFinger() {
    return canUseFinger;
  }

  /**
   * canUseFingerを代入するメソッド。
   */
  public void setCanUseFinger(boolean canUseFinger) {
    this.canUseFinger = canUseFinger;
  }

  /**
   * playerの持ち指と使った指を整理するメソッド。
   * 
   * @param num 指番号
   * @param p   対象のplayer
   */
  public void arrangementFinger(int num, Player p) {
    p.remainFinger.remove(p.remainFinger.indexOf(num));
    p.usedFinger.add(num);
  }

  /**
   * 入力を受け取り処理するメソッド。
   * 
   * @param name 入力するplayer
   */

  public void getInput(Player name) {
    System.out.println("使用する数字を入力してください");

    fingerNum = new java.util.Scanner(System.in).next();

    if (fingerNum.equals("パス")) {
      setCanUseFinger(false);
    } else {
      int intFingerNum = Integer.parseInt(fingerNum);
      setCanUseFinger(true);
      arrangementFinger(intFingerNum, name);
    }

  }
}
