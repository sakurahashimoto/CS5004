package Problem3;

import Problem2.Swimmer;
import java.util.Iterator;
import java.util.List;

//選手の名簿を上から順にチェックして、条件に合う「合格者」だけをピックアップする役割

//イテレーターという役割を引き受ける宣言
//イテレーターはインターフェース型、つまり、役割をさすかた
//イテレーターはhasNext()とnext()(次をください）の2つを持ってる
//取り出す型はSwimmer限定でお願い
//implement the Iterator<Swimmer> interface
//Class's responsibility is to act as a judge and traverse a list of swimmers,
//returning only those who meet our criteria
public class SwimmersIterator implements Iterator<Swimmer> {
  //three private fields to manage the state of the iteration
  //記録するためのフィールド
  //このデータ次のメソッドが始まるまで覚えている必要ある？あるならフィールド
  private List<Swimmer> swimmers;
  private int currentIndex = 0;
  //合格者が見つかたら一旦ここにキープ、そのあとでnext()がさっきの合格者連れてきてって頼むからそしたら、
  //はいどうぞnextSwimmerです
  //hasNext() でせっかく見つけた合格者を、next() が呼ばれるまで廊下で待たせておく
  private Swimmer nextSwimmer = null;

//currentIndex　と　nextSwimmer　は外から入れてもらう必要がない。なぜなら、どんな水泳選手のリスト
  //でも、スタートは同じで、フィールドにセットしてあるから。
  //コンストラクタにセットするのは外から入れて欲しいもの
  //constractor
  public SwimmersIterator(List<Swimmer> swimmers) {
    this.swimmers = swimmers;
  }

  @Override
  //審査員として次がいるか(true/false)を報告するメソッドを上書き（Override）するよ
  //true or false を伝える
  //it checks if nextSwimmer is already holding someone.
  //found someone 
  public boolean hasNext() {
    if (nextSwimmer != null) {
      return true;
    }

    while(currentIndex < swimmers.size()) {
      //今の水泳選手を指してる指し棒から選手を一人出す
      Swimmer swimmer = swimmers.get(currentIndex);

      //合格判定
      //バタフライ5回以上 ＋ 自由形26.17秒以下（hasFastTimeに任せる）
      //For each swimmer, it checks two conditions
      //Does the swimmer have at least 5 butterfly records?
      //Does the swimmer have a fast freestyle time (under 26.17 seconds)?
      if (swimmer.getButterfly50mTimes().size() >= 5 && hasFastTime(swimmer)) {
        nextSwimmer = swimmer; //合格、廊下で待ってて
        return true; //監督に報告
      }
      currentIndex++;
    }
      return false;
  }

  @Override
  public Swimmer next() {
    //it retrieves the swimmer parked in the nextSwimmer buffer, clears the buffer
    //by setting it back to null, and advances the currentIndex so the next search
    //starts from the next person in line. Finally, it returns the qualifying swimmer to the caller
  Swimmer result = nextSwimmer;
  //渡したことにするために廊下待機をぬるにする
  nextSwimmer = null;
  currentIndex ++;
  return result;
  }

  // 自由形で1回でも26.17秒以下のタイムがあるか探す専用の道具
  // private(内緒) で作る、合格か不合格か(boolean)を返すメソッド
  private boolean hasFastTime(Swimmer s) {
    // 自由形のタイムリストを1つずつ「time」と呼んでチェック（拡張for文）
    //If it finds even one result faster than 26.17, it returns true
    for (Double time : s.getFreestyle50mTimes()) {
      if (time <= 26.17) {
        return true; // 1つでも見つかれば即「合格(true)」
      }
    }
    return false; // 全部遅ければ「不合格(false)」
  }


}
