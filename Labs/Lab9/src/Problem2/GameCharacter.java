package Problem2;

// [設計図1] すべてのキャラクターの「親」になるクラス
abstract class GameCharacter implements Cloneable {
  protected String name;   // 名前
  protected int health;   // 体力
  protected int attack;   // 攻撃力
  protected int defense;  // 防御力

  // abstract = 「具体的な中身は、後で子供たちが書いてね」という予約
  public abstract GameCharacter clone();
  public abstract String getDescription();
}

// [設計図2] すべての装備品の「ルール」
interface Equipment {
  int getAttackBonus();  // 攻撃力がどれくらい上がるか
  int getDefenseBonus(); // 防御力がどれくらい上がるか
  String getDescription(); // 装備の名前（例：「鉄の剣」）
}