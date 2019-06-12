
void setup() {
  
  PImage minecraft = loadImage("minecraft.png");
  size(960, 520);
  image(minecraft, 0, 0);
  minecraft.resize(960, 520);
  
}

void draw() {
  
  PImage minecraft = loadImage("minecraft.png");
  image(minecraft, 0, 0);
  PImage creeper = loadImage("creeper.png");
  creeper.resize(30, 30);
  image(creeper, 100, 100);
 
    if(dist(100, 100, mouseX-15, mouseY-15) <= 20) {
      fill(0, 255, 0);
      ellipse(mouseX, mouseY, 25, 25);
    } else {
    noStroke();
      fill(255, 0, 0);
      ellipse(mouseX, mouseY, 25, 25);
  }
}
