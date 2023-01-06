package jp.ac.uryukyu.ie.e225711;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BackProcess {
  Player player = new Player();

  private boolean canUseFinger;
  private String fingerNum;

  public boolean getCanUseFinger() {
    return canUseFinger;
  }

  public void setCanUseFinger(boolean canUseFinger) {
    this.canUseFinger = canUseFinger;
  }

  public String getFingerNum1() {
    return fingerNum;
  }

  public void setFingerNum1(String fingerNum) {
    this.fingerNum = fingerNum;
  }

  public void arrangementFinger(int num) {
    player.remainFinger.remove(player.remainFinger.indexOf(num));
    player.usedFinger.add(num);
  }

  public void getInput() {
    System.out.println("使用する数字を入力してください");

    Scanner scan = new java.util.Scanner(System.in);
    String fingerNum = scan.next();

    if (fingerNum.equals("パス")) {
      setCanUseFinger(false);
    } else {
      int intFingerNum = Integer.parseInt(fingerNum);
      arrangementFinger(intFingerNum);
    }

  }
}
