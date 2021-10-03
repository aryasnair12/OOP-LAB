import java.io.File;

class lab4_pgm5{
  public static void main(String[] args) {

    // creates a file object
    File file = new File("/home/user");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}