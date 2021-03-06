//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and cooe" count.
public class countCode{
  public int countCode(String str) {
    int count = 0;
    for (int i = 0; i < str.length()-3; i++) {
      if ((str.substring(i, i+2) + str.substring(i+3, i+4)).equals("coe")) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countCode("aaacodebbb"));
    System.out.println(countCode("codexxcode"));
    System.out.println(countCode("cozexxcope"));
    System.out.println(countCode("cozfxxcope"));
    System.out.println(countCode("xxcozeyycop"));
}
}
