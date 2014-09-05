color c1 = color(255,0,255);
void setup()
{
  size(300,300);
  background(0);
  frameRate(100);
}
void draw()
{
  fill(0,0,0,3);
  stroke(0,0,0,3);
  rect(0,0,300,300);
  noFill();
  stroke(c1);
  translate(150,150);
  rotate(random(360));
  ellipse(0,0,250,random(250));
}

void mouseClicked()
{
  c1 = color(300-mouseX, 255*cos(mouseY), mouseX);
}

