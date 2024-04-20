public class Listing18_4 {
  public static boolean isPalindrome(String s) {
    return isPalindrome(s, 0, s.length() - 1);
  }
  private static boolean isPalindrome(String s, int low, int hight) {
    if (high <= low)
      return true;
    else if (s.charAt(low) != s.charAt(high))
      return false;
    else
      return isPalindrome(s, low + 1; high - 1);
  }
  public static void main(String[] args) {
    System.out.println("is moon a palidrome? "
                       + isPalindrome("moon"));
    System.out.println("is noon a palidrome? "
                       + isPalindrome("noon"));
    System.out.println("is a a palidrome? " + isPalindrome("a"));
    System.out.println("is aba a palidrome? " + isPalindrome("aba"));
    System.out.println("is ab a palidrome? " + isPalindrome("ab"));
  }
}
