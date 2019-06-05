
void setup() {
 
  PImage face = loadImage("face.png");
  size(800, 600);
  face.resize(800, 600);
  background(face);
  
}

void draw() {
  //371/309
  //213/306
  
    noStroke();
    fill(255, 255, 255);
    ellipse(210, 302, 80, 80);
    
    fill(0, 0, 0);
    ellipse((mouseX-210)/18 + 210, (mouseY-302)/17 + 302, 14, 14);
    
    fill(255, 255, 255);
    ellipse(371, 309, 80, 80);
    
    fill(0, 0, 0);
    ellipse((mouseX-371)/18 + 371, (mouseY-309)/17 + 309, 14, 14);
}
