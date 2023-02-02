import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

  Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");

  // 畫視窗的方法
  public void paint(Graphics g){
    System.out.println("視窗畫一次！");
    g.drawImage(ball, 100, 100, null);
  }

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