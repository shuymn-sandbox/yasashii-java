class Car {
    private int num;
    private double gas;

    // メソッドのオーバーロード(多重定義): 同じ名前の複数のメソッドを，同じクラス内に定義する
    // 各メソッドの引数の型・個数は異なるようにする必要がある
    // 状況に応じて別々の働きをする: 多様性(polymorphism)

    public void setCar(int n) { // int型の引数を持つsetCar()メソッド
        num = n;
        System.out.println("ナンバーを" + num + "にしました．");
        this.show();
    }

    public void setCar(double g) { // double型の引数をもつsetCar()メソッド
        gas = g;
        System.out.println("ガソリン量を" + gas + "にしました．");
        this.show();
    }

    public void setCar(int n, double g) { // 2この引数を持つsetCar()メソッド
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "に，ガソリン量を" + gas + "にしました．");
        this.show();
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です．");
        System.out.println("ガソリン量は" + gas + "です．");
    }
}

class OverLoading {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setCar(1234, 20.5); // 引数を2つ渡すと，2つあるメソッドが呼ばれる

        System.out.println("車のナンバーだけ変更します．");
        car1.setCar(2345); // int型の引数をもつメソッドが呼ばれる

        System.out.println("ガソリン量だけ変更します．");
        car1.setCar(30.5); // double型の引数を持つメソッドが呼ばれる
    }
}
