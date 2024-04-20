import java.io.File;
import java.util.Scanner;

public class Listing18_7 {
  public static void main(String[] args) {
    System.out.print("Enter a directory or a file: ");
    Scanner input = new Scanner(System.in);
    String directory = input.nextLine();
    System.out.println(getSize(new File(directory)) + "bytes");
  }
  public static long getSize(File file) {
    File[] files = file.listFiles();
    for (int i = 0; files != null && i < files.length; i++) {
      size += getSize(files[i]);
    } 
  }
  else {
    size += file.length();
    }
  return size
  }
}
