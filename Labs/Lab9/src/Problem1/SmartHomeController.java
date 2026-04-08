package Problem1;

import java.util.ArrayList;
import java.util.List;

//Singleton
//2回目以降に呼ばれたときも、『さっき作ったのはこれだよ！』と即座に差し出せるように、唯一の実体を大切に保管しておくための場所」
//これがあるおかげで、家の中にコントローラーが2つも3つも増えずに済む
public class SmartHomeController {
  // 【static】: インスタンス（newしたもの）ではなく、クラス自体に紐付く「唯一の箱」
  private static SmartHomeController instance;

  private List<SmartDevice> devices;

  //コンストラクタ：外部からの new を封鎖する
  // 【private】: 外部で「new SmartHomeController()」と書くとエラー
  private SmartHomeController() {
    // 【this】: 「このクラス自身の」という意味。
    // 【new ArrayList<>()】: 実際にデバイスを格納するための「実体」をメモリに作ります
    this.devices = new ArrayList<>();
  }

  public static SmartHomeController getInstance() {
    if (instance == null) {
      instance = new SmartHomeController();
    }
    return instance;
  }
  //スマートデバイスなら何でも持ってきていいよ
  public void addDevice(SmartDevice device) {
    devices.add(device);
  }
  public void turnAllOff() {
    // リストの中身が空になるまで、1つずつ取り出してdeviceと名付けてループ
    for (SmartDevice device : devices) {
      device.turnOff();
    }
  }

}
