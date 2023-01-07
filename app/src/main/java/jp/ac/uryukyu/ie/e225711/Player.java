package jp.ac.uryukyu.ie.e225711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * プレイヤークラス。
 * String name; //プレイヤーの名前
 * List remainFinger; //残っている指(数字)
 * List usedFinger; //使用した指(数字)
 * Created by e225711
 */
public class Player {
  private String name;
  List<Integer> remainFinger = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
  List<Integer> usedFinger = new ArrayList<Integer>();

  /**
   * nameを代入するメソッド
   * 
   * @param name 名前
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * nameを受け取るメソッド
   * 
   * @return this.name 対象
   */
  public String getName() {
    return this.name;
  }
}
