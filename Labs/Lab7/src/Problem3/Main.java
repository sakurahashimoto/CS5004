package Problem3;

import Problem1.DataCollections;
import Problem2.Swimmer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

//やっていること:
//DataCollections で数字の統計を出す
//Swimmer オブジェクトを3人分作る
//Collections.sort() で全員を速い順に並べる（Problem 2の発動）
//SwimmersIterator を使って、合格者だけを表示する（Problem 3の発動）

public class Main {
  public static void main(String[] args) {

    // Problem 1: 相対頻度のテスト
    //instantiate the DataCollections class and assign it to the variable dc
    DataCollections dc = new DataCollections();
    //create a List of Integers called nums using Arrays.asList
    List<Integer> nums = Arrays.asList(1, 2, 2, 4, 4, 4, 4);
    Map<Integer, Double> result = dc.getRelativeFrequency(nums);
    System.out.println("Problem 1: Relative Frequency");
    System.out.println(result);
    System.out.println();

    //Problem2
    //We create multiples swimmers and compare
    // テスト用データの準備
    //the Swimmer constructor to create three individual objects
    Swimmer sakura = new Swimmer("Sakura",
        /*butterfly50mTimes=*/Arrays.asList(28.0, 29.0, 30.0, 27.5, 28.5, 29.0),
        /*backstroke50mTimes=*/new ArrayList<>(),
        /*breaststroke50mTimes=*/new ArrayList<>(),
        /*freestyle50mTimes=*/Arrays.asList(25.5, 27.0)); // 平均: 26.25

    Swimmer kent = new Swimmer("Kent",
        Arrays.asList(31.0, 32.0, 33.0),
        new ArrayList<>(), new ArrayList<>(),
        Arrays.asList(24.0, 25.0)); // 平均: 24.5 (最速！)

    Swimmer yuki = new Swimmer("Yuki",
        Arrays.asList(30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0),
        new ArrayList<>(), new ArrayList<>(),
        Arrays.asList(28.0, 29.0)); // 平均: 28.5
//collect these three objects into a single List of Swimmers
    List<Swimmer> allSwimmers = Arrays.asList(sakura, kent, yuki);

    //Problem 2: 並べ替え（Sorting）のテスト
    System.out.println("Problem 2: Sorting Results (Fastest First)");

    // ここが重要！Comparable(compareTo)を使って並べ替えます
    //To test Problem 2, I call Collections.sort and pass allSwimmers as the argument
    Collections.sort(allSwimmers);

    for (Swimmer s : allSwimmers) {
      System.out.println(s.getName() + " is in the list.");
    }
    System.out.println();

    //Problem 3: フィルタリング（Iterator）のテスト
    System.out.println("Problem 3: Qualified Winners");
    //ass the sorted allSwimmers list into my custom SwimmersIterator, naming it iterator.
    //This acts as a 'judge' to find qualifying winners
    SwimmersIterator iterator = new SwimmersIterator(allSwimmers);

    while (iterator.hasNext()) {
      //Butterfly 5 times, Freestyle 26.17 seconds
      //If it returns true, it means a swimmer meets the strict criteria
      Swimmer winner = iterator.next();
      System.out.println("The winner is " + winner.getName());
    }
  }
}