/******************************
 * class TwoDimArray
 * practice working with 2D arrays
 ******************************/
/*
 *Team Incredibly Cohesive (Jaylen Zeng, David Chen, Orion Roven)
 *APCS pd7
 *HW40 -- 2D arrays
 *2021-11-29
 *time spent: 0.3 hrs
 *DISCO:
   -In a for-each loop, you can implement another for-each loop that uses parameters found in the first loop. This is very helpful when you're working with 2D arrays.
 *QCC:
   -Do 3D Arrays exist? How deep does the rabbit hole go in Java? In other words, how many arrays can we stack?
*/
public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i = 0; i < a.length; i++) {
      String result = "";
      for (int b = 0; b < a[i].length; b++) {
        result += (a[i][b]);
      }
      System.out.print(result+"\n");
    }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for (int[] array : a) {
      String result = "";
      for (int i : array) {
        result += i;
      }
      System.out.print(result+"\n");
    }
  }
  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int sum = 0;
    for (int[] array : a) {
      for (int i : array) {
        sum += i;
      }
    }
    return sum;
  }
  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int result = 0;
    for (int i = 0; i < m.length; i++) {
      //result += sumRow(i, m);
      result += sumRow2(i, m);
    }
    return result;
  }
  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int sum = 0;
    for (int i = 0; i < a[r].length; i++) {
      sum += a[r][i];
    }
    return sum;
  }

  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    for (int i : m[r]) {
      summer += i;
    }
    return summer;
  }


  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
