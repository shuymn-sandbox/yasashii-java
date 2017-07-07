/*
   体重と身長を入力してください．
   165.2
   52.5
   身長は165.2cmです．
   体重は52.5kgです．
*/
import java.io.*;

class Practice5 {
  public static void main(String[] args) throws IOException {
    System.out.println("身長と体重を入力してください．");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("身長[cm]: ");
    String str1 = br.readLine();
    System.out.print("体重[kg]: ");
    String str2 = br.readLine();

    double num1 = Double.parseDouble(str1);
    double num2 = Double.parseDouble(str2);

    System.out.println("身長は" + num1 + "cmです．");
    System.out.println("体重は" + num2 + "kgです．");
  }
}
