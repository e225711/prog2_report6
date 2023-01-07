package jp.ac.uryukyu.ie.e225711;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
  @Test
  void testSetName() {
    Player p = new Player();
    p.setName("舞武");
    String pName = p.getName();
    assertEquals(pName, "舞武");
  }
}
