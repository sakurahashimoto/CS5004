package Problem1;

//ファサード
//ユーザーが個別のデバイスを操作しなくても、一括で命令を出せる「窓口」

public class SmartHomeFacade {
  // 司令塔（Singleton）を中に持っておく
  private SmartHomeController controller;

  public SmartHomeFacade() {
    // 世界に1つのコントローラーを取得
    this.controller= SmartHomeController.getInstance();
  }
  public void leaveHome() {
    System.out.println("All off");
    controller.turnAllOff();
  }
  public void nightMode() {
    System.out.println("Night mode is on");
    controller.turnAllOff();
  }


}
