package jp.ac.uryukyu.ie.e225711;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackProcessTest {
  @Test
  void testArrangementFinger() {
    int num = 2;
    Player p = new Player();
    BackProcess b = new BackProcess();

    b.arrangementFinger(num, p);
    int pRemainFingerNum = 4;
    assertEquals(p.remainFinger.size(), pRemainFingerNum);
  }
}
