package jp.ac.uryukyu.ie.e225711;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
  @Test
  void testIsGameLoop() {
    Game g = new Game();
    boolean gGameLoop = g.isGameLoop();
    assertEquals(gGameLoop, true);
  }
}
