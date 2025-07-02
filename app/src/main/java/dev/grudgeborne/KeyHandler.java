package dev.grudgeborne;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

  public boolean upPressed, downPressed, leftPressed, rightPressed;

  @Override
  public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();

    if (code == KeyEvent.VK_W) {
      upPressed = true;
      System.out.println("up: " + upPressed);
    }
    if (code == KeyEvent.VK_A) {
      leftPressed = true;
      System.out.println("left: " + leftPressed);
    }
    if (code == KeyEvent.VK_S) {
      downPressed = true;
      System.out.println("down: " + downPressed);
    }
    if (code == KeyEvent.VK_D) {
      rightPressed = true;
      System.out.println("right: " + rightPressed);
    }

  }

  @Override
  public void keyReleased(KeyEvent e) {
    int code = e.getKeyCode();

    if (code == KeyEvent.VK_W) {
      upPressed = false;
    }
    if (code == KeyEvent.VK_A) {
      leftPressed = false;
    }
    if (code == KeyEvent.VK_S) {
      downPressed = false;
    }
    if (code == KeyEvent.VK_D) {
      rightPressed = false;
    }

  }

}
