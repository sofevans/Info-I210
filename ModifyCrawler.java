import java.util.Scanner;
import java.util.ArrayList;

public class ModifyCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a URL to begin search: ");
        String url = input.nextLine();
        System.out.println("Enter a word to search: ");
        String word = input.nextLine();
        crawler(url, word);
    }
    public static void crawler(String startingURL, String word) {
        ArrayList<String> listOfPendingURLs = new ArrayList<String>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<String>();
        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() &&
            listOfPendingURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
        if (!listOfTraversedURLs.contains(urlString)){
            listOfTraversedURLs.add(urlString);
            System.out.println("Crawl " + urlString);
            if (contains(urlString, word)) {
                System.out.println("The URL " + urlString + " contaoins the"
                        + "word " + word);
                System.out.print("The numebr of pages been searched is " +
                        listOfTraversedURLs.size());
                        break;
            }
            for (String s: getSubURLs(urlString)){
                if (!listOfTraversedURLs.contains(s))
                    listOfPendingURLs.add(s);
            }    
        }
    }
}
public static boolean contains(String urlString, String word) {
    try{
        java.net.URL url = new java.net.URL(urlString);
       try(Scanner input = new Scanner(url.openStream())){
           while (input.hasNext()){
               String line = input.nextLine();
               if (line.indexOf(word) > 0)
                   return true;
           }
       }
    }
        catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
        }
public static ArrayList<String> getSubURLs(String urlString){
    ArrayList<String> list = new ArrayList<String>();
    try{
        java.net.URL url = new java.net.URL(urlString);
        try (Scanner input = new Scanner(url.openStream())){
        int current = 0;
        while (input.hasNext()){
            String line = input.nextLine();
            current = line.indexOf("http:", current);
            while (current > 0){
                int endIndex = line.indexOf("\"", current);
                if(endIndex > 0) {
                    list.add(line.substring(current, endIndex));
                    current = line.indexOf("http:", endIndex);
                }
                else
                    current = -1;
            }
        }
    }
}
    catch (Exception ex){
        System.out.println("Error: " + ex.getMessage());
    }
    return list;
    }
}
