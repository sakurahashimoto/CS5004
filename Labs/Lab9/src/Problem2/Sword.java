package Problem2;

/**
 * Equipment インターフェースを実装した具体的な武器クラスです。
 */
public class Sword implements Equipment {

  @Override
  public int getAttackBonus() {
    return 15; // 剣を装備すると攻撃力が15アップ
  }

  @Override
  public int getDefenseBonus() {
    return 0;  // 剣でガードするので防御も少しアップ
  }

  @Override
  public String getDescription() {
    return "Legend Sword";
  }
}