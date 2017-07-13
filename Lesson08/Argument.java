class Car {
  int num;
  double gas;

  void setNum(int n) { // メソッドの定義内で値を受け取る変数(ここではn)を 仮引数
    num = n;
    System.out.println("ナンバーを" + num + "にしました．");
  }
  void setGas(double g) { // g も仮引数
    gas = g;
    System.out.println("ガソリン量を" + gas + "にしました．");
  }
  void show() {
    System.out.println("車のナンバーは" + num + "です．");
    System.out.println("ガソリン量は" + gas + "です．");
  }
}

class Argument {
  public static void main(String[] args) {
    Car car1 = new Car();

    car1.setNum(1234); // メソッドを呼び出すときに渡す値が 実引数
    car1.setGas(20.5);
    car1.show();
  }
}
