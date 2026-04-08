package Problem1;
//アダプター
//今のシステム: turnOn(), turnOff() というメソッドを使いたい。
//古い機械 (LegacyThermostat): activate(), deactivate() という全然違う名前のメソッドしか持っていない。
//解決策: 古い機械を「包み込んで」、外側からは turnOn() に見えるように翻訳するクラスを作ります。
public class LegacyThermostatAdapter implements SmartDevice{
  // [2] 中に「古い機械」そのものを変数として持っておく
  private LegacyThermostat legacy;

  // [2] コンストラクタで、既存の古い機械を受け取ってセットする
  public LegacyThermostatAdapter(LegacyThermostat legacy) {
    this.legacy = legacy;
  }
  @Override
  public void turnOn() {
    legacy.activate();
  }
  @Override
  public void turnOff() {
    legacy.deactivate();
  }
  @Override
  public String getStatus() {
    return "Temp is "  + legacy.getCurrentTemp();

  }


}
