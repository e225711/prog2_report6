package jp.ac.uryukyu.ie.e225711;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JudgeTest {
  @Test
  void testWinJudge() {
    Player p = new Player();
    Judge j = new Judge();
    boolean pJudge = j.winJudge(p);
    assertEquals(pJudge, false);
  }
}
