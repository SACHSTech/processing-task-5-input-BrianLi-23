import processing.core.PApplet;

public class Sketch extends PApplet {

  public String strMessage = "";
  public boolean firstKey = false;
  public boolean secondKey = false;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(600, 600);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(154, 203, 255);
    textSize(90);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    if (mousePressed) {
      fill(0, 154, 23);
      noStroke();
      rect(mouseX - 20, mouseY - 20, 55, 25);
    }

    if (firstKey && secondKey) {
      background(0, 0, 0);
    }

    if (keyCode == CONTROL) {
      fill(0, 0, 0);
      text(strMessage, 300, 100);
    }

    if (keyPressed) {

      if (key == 'm') {
        background(252, 209, 77);
      }

      else if (key == 'a') {
        background(255, 220, 147);
      }

      else if (key == 'n') {
        background(26, 26, 40);
      }

      else if (key == 'r') {
        background(255, 255, 255);
      }

    }
  }

  public void mouseWheel() {
    noStroke();
    fill(255, 255, 255);
    ellipse(mouseX, mouseY, 40, 40);
    ellipse(mouseX + 15, mouseY + 15, 40, 40);
    ellipse(mouseX - 15, mouseY + 15, 40, 40);
    ellipse(mouseX + 20, mouseY, 40, 40);
    ellipse(mouseX + 35, mouseY + 15, 40, 40);
  }

  public void mouseClicked() {
    stroke(4);
    fill(255, 105, 180);
    ellipse(mouseX - 25, mouseY - 25, 50, 50);
    ellipse(mouseX + 25, mouseY - 25, 50, 50);
    ellipse(mouseX - 25, mouseY + 25, 50, 50);
    ellipse(mouseX + 25, mouseY + 25, 50, 50);

    fill(255, 255, 51);
    ellipse(mouseX, mouseY, 50, 50);

  }

  public void keyTyped() {
    strMessage += key;
    if (key == 'r') {
      firstKey = true;
    } else if (key == 'v') {
      secondKey = true;
    }
  }

  public void keyReleased() {
    if (key == 'r') {
      firstKey = false;
    } else if (key == 'v') {
      secondKey = false;
    }
  }

}