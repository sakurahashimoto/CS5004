package Problem1;

public class SmartSpeaker implements SmartDevice{
  private boolean isPlaying = false;

  @Override
  public void turnOn() {
    isPlaying = true;
    System.out.println("The SmartSpeaker is playing now");
  }

  @Override
  public void turnOff() {
    isPlaying = false;
    System.out.println("The SmartSpeaker is not playing now");
  }

  @Override
  public String getStatus() {
    //条件式 ? 正しいとき（true）の値 : 間違いのとき（false）の値;
    return "The SmartSpeaker is now " + (isPlaying ? "playing" : "stopped");
  }

}
