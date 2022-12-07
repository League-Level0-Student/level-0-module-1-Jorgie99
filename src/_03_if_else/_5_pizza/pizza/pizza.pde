PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
    size(500,500);
    fill(#FADE92);
    noStroke();
    ellipse(250,250,450,450);
    fill(#FF4727);
    ellipse(250,250,410,410);
    fill(#FFEF39);
    ellipse(250,250,400,400);
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olive.png");
    mushroom = loadImage("mushroom.png");
}
void draw() {
  if(mousePressed == true){
    pepperoni.resize(30,30);
    image(pepperoni,200,200);
    image(pepperoni,300,125);
    image(pepperoni, 115, 325);
    image(pepperoni,400,300);
    image(pepperoni, 245, 350);
    image(pepperoni, 110, 110);
    mushroom.resize(30,30);
    image(mushroom,115, 205);
    image(mushroom,325,250);
    image(mushroom,230,90);
    olive.resize(30,30);
    image(olive,365,340);
    image(olive,215,290);
    image(olive,345,155);
  }
}
