package Problem2;

import java.util.List;
//この Swimmer クラスでは、Comparable インターフェースを実装しました。
// compareTo メソッドの中では、for-each ループを使って自分と相手の自由形タイムの平均値を算出し、
// Double.compare を用いて比較しています。

// クラス名は Swimmer
//『比較可能』という能力を持たせます。比べる相手は同じ Swimmer 型です
//implement the Comparable<Swimmer> interface
public class Swimmer implements Comparable<Swimmer> {
  // 選手のデータ（名前やタイムのリスト）
  private String name;
  //この選手が過去に泳いだバタフライ５０mの記録をある分だけ保管できるようリストを用意する
  //<Double>このリスト以外には小数以外は入れないで
  //the swimming times are stored as Lists of Doubles
  private List<Double> butterfly50mTimes;
  private List<Double> backstroke50mTimes;
  private List<Double> breaststroke50mTimes;
  private List<Double> freestyle50mTimes;

  //コンストラクタ（初期化の道具）
  //外から送られてきたリストをこのクラスの引き出しに保管
  //The constructor takes lists as arguments and assigns them to the class fields
  //using the "this" keyword. This process ensures that when we create a new swimmer object,
  //all their historical data is safely stored in the object
  public Swimmer(String name, List<Double> butterfly50mTimes,
      List<Double> backstroke50mTimes,
      List<Double> breaststroke50mTimes,
      List<Double> freestyle50mTimes) {
    this.name = name;
    this.butterfly50mTimes = butterfly50mTimes;
    this.backstroke50mTimes = backstroke50mTimes;
    this.breaststroke50mTimes = breaststroke50mTimes;
    this.freestyle50mTimes = freestyle50mTimes;
  }
//Getter methods so we can use it outside the class
 public List<Double> getFreestyle50mTimes() {
    return this.freestyle50mTimes;
 }

 public List<Double> getButterfly50mTimes() {
    return this.butterfly50mTimes;
 }

 public String getName() {
    return this.name;
 }

  @Override
  //水泳用にオーバーライドする
  //最終的にイントタイプを返します
  //This method takes another swimmer object, called otherSwimmer,
  //as an argument to compare against 'this' swimmer.
  public int compareTo(Swimmer otherSwimmer) {
    //this　の過去のタイムを全部とって計算
    double mySum = 0.0;
    //this　のフリースタイル記録リストをください
   //total time
    List<Double> myTimes = this.getFreestyle50mTimes();
    for (Double time : myTimes) {
      mySum += time;
    }
    //Calculating the Averages
    double myAverage = mySum / myTimes.size();

    //otherSwimmer　の合計
    double otherSum = 0.0;
    //other　オブジェクトから獲得
    List<Double> otherTimes = otherSwimmer.getFreestyle50mTimes();
    for (Double time : otherTimes) {
      otherSum += time;
    }
    //Calculating the Averages
    double otherAverage = otherSum / otherTimes.size();
    // this < other -> -1
    // this > other -> 1
    // this == other -> 0
    //Double.compare(this, other)
    return Double.compare(myAverage, otherAverage);

  }

}
