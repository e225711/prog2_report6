package jp.ac.uryukyu.ie.e225711;

public class Judge {
  public boolean winJudge(Player name) {
    if (name.remainFinger.size() == 0) {
      return true;
    } else {
      return false;
    }
  }
}
