class Equation
 {
public static void main (String[] args) {
   double a = 1 ;
   double b = 3 ;
   double c = - 9 ;
   double x1 ;
   double x2 ;
   double delta = (b * b -4 * a *c);
   if ( delta < 0 ){
    System.out.println("il n'y as pas de solution ");
   }
   else if ( delta == 0){
       x1 = -b / 2 * a;
       x2 = x1;
       System.out.println("Racine 1 :" + x1);
       System.out.println("Racine 2 :" + x2);
   }
   else{
     x1 = (-b + Math.sqrt(delta)) / 2 *a;
     x2 = (-b - Math.sqrt(delta)) / 2 *a;
     System.out.println("Racine 1:" + x1);
     System.out.println("Racine 2:" + x2);

}
}
}
