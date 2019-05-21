void setup () {
  size(500, 500);

   for(int i=11; i>0; i--){
   if(i%2==0) {
    fill(#050505);
    
    ellipse(250, 250, i*20, i*20); 
  }
  else {
    
    fill(#FF0000);
    ellipse(250, 250, i*20, i*20);
}
   }
}
