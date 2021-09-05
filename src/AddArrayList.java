import java.util.ArrayList;
public class AddArrayList {
  public static void main(String[] args){
    // create ArrayList
    ArrayList<String> languages = new ArrayList<>();

    // add() method without the index parameter
    languages.add("Java");
    languages.add("C");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);

    // add() method with the index parameter
    languages.add(1, "JavaScript");
    System.out.println("Updated ArrayList: " + languages);
  }
}