package Problem1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//数字のリストを受け取って、「どの数字が何パーセント含まれているか」を計算する

/**
 * This class calculate the occurrence rates of elements within a list.
 */
//1.HashMapを使って各要素の出現回数をカウント
//2.全要素数（totalSize）で割ることで、相対頻度（Relative Frequency）を算出
public class DataCollections {
  //getRelativeFrequencyメソッドの宣言
  //公開設定どこからでも使える
  //戻り値（キーと値）のペアを返す宣言
  //引数は外からもらう数字たち

  /**
   * Calculate the relative frequency for each integer in the list
   * Count the occurrence for each number using Hashmap
   * Divides each number by total list size
   * @param numbers The list of integers
   * @return Returns A Map where keys are integers, and the values are the relative frequencies
   */
  public Map<Integer, Double> getRelativeFrequency(List<Integer> numbers) {
    //結果を書くためのまっさらな名簿
    //結果はMap型の外から受け取った数字とそれが起こる頻度のセット
    //Mapインターフェース（ーができる）にHashMapを代入
    //ただの空の箱
    //we create instance of hashmap
    Map<Integer, Double> frequencyMap = new HashMap<>();
    //リストに何個入ってるか数を数えて代入
    double totalSize = numbers.size();
    //リストにある数字たちのそれぞれを”n”と呼ぶ。
    //もし、外から受けとった数字がすでに”frequencyMap”に入っていたら、1カウントあげる。なかったら、
    //”n”の数字を１とセットする
    //ここでそれぞれの数字（n）をfrequencyMap　に書き込む　.put
    //counting the number of times each element in numbers occurs
    for (Integer n : numbers) {
      //マップの中身は、数字：何回出てきたかの回数
      //ループ終了後は、数；回数
      if (frequencyMap.containsKey(n)) {
        frequencyMap.put(n,frequencyMap.get(n) + 1);
        } else{
        //set the starting point of frequency number
        frequencyMap.put(n,1.0);
      }
    }
    //Map<Integer, Double>の戻り値、値を計算する
    //回数を％に変える
    //数字たち全部を持ってくる
    //keySet()重複含まない
    for (Integer key : frequencyMap.keySet()) {
      //キーは引数の数字たちだけど、そこからじゃないとバリューは取れない
      //frequencyMap.get(key)　中にkeyを入れたときは必ずバリューが帰ってくる
      double frequency = frequencyMap.get(key) / totalSize;
      frequencyMap.put(key, frequency);
    }
    return frequencyMap;

  }


}



