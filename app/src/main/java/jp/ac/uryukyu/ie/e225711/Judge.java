package jp.ac.uryukyu.ie.e225711;

/**
 * 勝利判定クラス。
 * Created by e225711
 */
public class Judge {
  /**
   * 勝者判定メソッド。
   * 残っている指(数字)が0のとき、trueを返す
   * 
   * @param name 確認したいplayer
   * @return true or false
   */
  public boolean winJudge(Player name) {
    if (name.remainFinger.size() == 0) {
      return true;
    } else {
      return false;
    }
  }
}
