
public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin

/*
    //test default constructor
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine.toString());
      System.out.println("yours: " + yours.toString());
      System.out.println("wayne: " + wayne.toString());
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
*/
      Coin drop = new Coin();
      Coin dead = new Coin();
      Coin fred = new Coin();
      System.out.println( drop == dead );
	System.out.println( drop == fred );
	System.out.println( drop.equals(dead));
	System.out.println( drop.equals(fred));	
    /*===================TOP==========================
      ====================BOTTOM======================*/

  }//end main()

}//end class
