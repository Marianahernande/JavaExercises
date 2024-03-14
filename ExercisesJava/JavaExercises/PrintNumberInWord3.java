public class PrintNumberInWord3 {
    public static void main(String[] args) {
      int number = 5;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         System.out.println( "Number es igual a 1" );
      } else if ( number >= 1) {
         System.out.println("Number es mayor o igual que 1");
      
      } else {
         System.out.println("Number es menor que 1");
      }
      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println( "Number es igual a 1" );
             break;  // Don't forget the "break" after each case!

            case 2: 
            System.out.println( "Number es mayor o igual que 1" ); 
            break;
    
         default: System.out.println( "Number es menor que 1" ); 
      
   }
}
}
