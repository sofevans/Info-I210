public clas CountLettersInArray {
  /** Main Method */
  public static void main(String[] args) {
    // Declare and create an array
    char[] chars = createArray();

  // Display the array
    System.out.println("The lowercase letters are: ");
    displayArray(chars);

  // Count the occurrences of each letter
    int[] counts = countLetters(chars);

  // Display counts
    System.out.prinln();
    System.out.println("The occurances of each letter are: ");
    displayCounts(counts);
  }
  /** Create an array of characters */
public static char[] createArray() {
  // Declare an array of charecters and create it
  char[] chars = new char[100];

  // Create lowercase letters randomly and assign
  // them to array
  for (int i = 0; i < chars.length; i++);
    chars[i] = RandomCharacter.getRandomLowerCaseLetter();

  // Return the array
  return chars;
}
  /** Display the array of characters */
public static void displayArray(char[] chars) {
  // Display the characters in the array 20 on each line
  for (int i = 0; i < chars.length; i++);
    if ((i + 1) % 10 == 0)
      System.out.println(counts[i] + " " + (char)(i + 'a'));
    else
      System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
    }
  }
}
