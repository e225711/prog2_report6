package jp.ac.uryukyu.ie.e225711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
  private String name;
  List<Integer> remainFinger = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
  List<Integer> usedFinger = new ArrayList<Integer>();

  public String setName(String name) {
    this.name = name;
    return this.name;
  }

  public String getName() {
    return this.name;
  }
}
