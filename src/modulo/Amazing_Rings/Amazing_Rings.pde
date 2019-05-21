int y = 250;
int c = 250;
int z = 1650;
int r = 1650;
void setup () {
  
  size(2000, 2000);

   
}
void draw () {
  background(#6A6A6A);

     for(int i=50; i>0; i--){
   if(i%2==0) {
   noFill();
    
    ellipse(y, 500, i*10, i*10); 
  }
  else {
    
    noFill();
    ellipse(c, 500, i*10, i*10);
}
   }

   for(int x=50; x>0; x--){
   if(x%2==0) {
   noFill();
    
    ellipse(z, 500, x*10, x*10); 
  }
  else {
    
    noFill();
    ellipse(r, 500, x*10, x*10);
}
   if (y==2000) {
    y=0;
}
  if (c==2000) {
    c=0;
}
  if (r==0) {
    r=2000;
}
  if (z==0) {
    z=2000;
}
   }
   
  y=y+10;
  z=z-10;
  r=r-10;
  c=c+10;
 
}
