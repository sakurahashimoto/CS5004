package Problem1;

public class SmartLight implements SmartDevice{
  public boolean isOn = false;

  @Override
  public void turnOn() {
    isOn = true;
    System.out.println("The light is on now");
  }

  @Override
  public void turnOff() {
    isOn = false;
    System.out.println("The light is off now");
  }
  @Override
  public String getStatus() {
    //条件式 ? 正しいとき（true）の値 : 間違いのとき（false）の値;
    return "The SmartLight is " +  (isOn ? "on" : "off");
  }


}
