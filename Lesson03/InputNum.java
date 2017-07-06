import java.io.*;

class InputNum {
  public static void main(String[] args) throws IOException {
    System.out.println("整数を入力してください");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int num = Integer.parseInt(str); // 文字列を変換してint型の変数に読み込ませる
    System.out.println(num + "が入力されました．");
  }
}
