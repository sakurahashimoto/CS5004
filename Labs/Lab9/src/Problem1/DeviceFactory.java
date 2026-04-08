package Problem1;

//factory
public class DeviceFactory {
  //文字列（type）を受け取って、対応するスマートデバイスを作成して返します。
  //戻り値の型が「SmartDevice」なので、ライトでもスピーカーでも返せます。
  public static SmartDevice createDevice(String type) {
    if (type.equalsIgnoreCase("light")) {
      return new SmartLight();
    } else if (type.equalsIgnoreCase("speaker")) {
      return new SmartSpeaker();
    }
    else {
      return null;
    }
  }



}
