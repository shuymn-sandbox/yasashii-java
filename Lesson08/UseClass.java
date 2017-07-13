class Car { // Car クラスの宣言
  int num;
  double gas;
}

class UseClass {
  public static void main(String[] args) {
    Car car1 = new Car(); // Objectを作成
    // メンバにアクセス
    car1.num = 1234; 
    car1.gas = 20.5;

    System.out.println("車のナンバーは" + car1.num + "です．");
    System.out.println("ガソリン量は" + car1.gas + "です．");
  }
}
