package dev.grudgeborne;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

class GamePanel extends JPanel implements Runnable {
  final int defaultTileSize = 16; // 16x16 tiles
  final int scale = 3; // 3x scaling
  final int tileSize = defaultTileSize * scale; // 48x48 tiles
  final int maxScreenCol = 16;
  final int maxScreenRow = 12;
  final int screenWidth = tileSize * maxScreenCol;
  final int screenHeight = tileSize * maxScreenRow;

  Thread gameThread;

  GamePanel() {
    this.setPreferredSize(new Dimension(screenWidth, screenHeight));
    this.setBackground(Color.black);
    this.setDoubleBuffered(true);
  }

  public void startGameThread() {
    gameThread = new Thread(this);
    gameThread.start();
  }

  @Override
  public void run() {

    while (gameThread != null) {
      // Game loop logic
      System.out.println("Game is running...");
    }
  }
}
