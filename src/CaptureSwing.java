import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.*;
public class CaptureSwing {
  public static void main(String[] args) throws Exception {
    SwingUtilities.invokeAndWait(() -> new swingassignment());
    Thread.sleep(1200);
    Robot robot = new Robot();
    BufferedImage image = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
    ImageIO.write(image, "png", new File(args[0]));
    System.exit(0);
  }
}