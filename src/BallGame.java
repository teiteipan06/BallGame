import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

  //窗口下載
  void launchFrame(){
    setSize(300, 300);
    setLocation(50, 50);
    setVisible(true);

  } 



  // main方法是程式執行的入口
  public static void main(String[] args) {
    System.out.println("Hello!");
    BallGame game = new BallGame();
    game.launchFrame();
  }

}