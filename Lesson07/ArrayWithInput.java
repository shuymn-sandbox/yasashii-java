import java.io.*;

class ArrayWithInput {
  public static void main(String[] args) throws IOException {
    System.out.print("テストの受験者数を入力してください: ");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int num = Integer.parseInt(str);

    int[] test;
    test = new int[num];

    System.out.println("人数分の点数を入力してください．");
    for(int i=0; i<num; i++) {
      System.out.print((i+1) + "人目: ");
      str = br.readLine();
      int tmp = Integer.parseInt(str);
      test[i] = tmp;
    }

    for(int i=0; i<num; i++) {
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です．");
    }
  }
}
