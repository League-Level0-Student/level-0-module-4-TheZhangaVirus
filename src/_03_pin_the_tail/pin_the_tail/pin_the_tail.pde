import javax.swing.JOptionPane;


void setup() {
  
  PImage tail = loadImage("tail.png");
  size(800, 600);
  PImage donkey = loadImage("donkey.jpg");
  donkey.resize(800,600);
  image(donkey, 0, 0);
  tail.resize(47, 96);

}

void draw() {

  PImage tail = loadImage("tail.png");
  size(800, 600);
  PImage donkey = loadImage("donkey.jpg");
  donkey.resize(800,600);
  image(donkey, 0, 0);
  tail.resize(94, 192);
  
  if(mousePressed) {
    println(mouseX + ", " + mouseY);
  }
 
  rect(0, 0, 30, 30);
  rect(660, 218, 40, 40);
  
  if(dist(0, 0, mouseX, mouseY) >= 30) {
   background(170, 170, 170);
  } else {
   image(donkey, 0, 0);
  }
  
  if(mousePressed) {
    image(tail, mouseX-85, mouseY-15);   
  } 
  
  if(mouseX >= 660 && mouseX <= 700 && mouseY >= 218 && mouseY <= 258) {
    JOptionPane.showMessageDialog(null, "you win");
    System.exit(0);
  }
  
  
}
