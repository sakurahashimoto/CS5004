package Problem2;

// extends は「設計図を引き継ぐ」という文法です
public class Warrior extends GameCharacter {

  // 【コンストラクタ】: 名前を決めて、戦士用のステータスをセットする
  public Warrior(String name) {
    this.name = name;
    this.health = 150; // 戦士はタフ
    this.attack = 20;
    this.defense = 15;
  }

  // 【clone メソッド】: 自分と全く同じステータスのコピーを1人作る
  @Override
  public GameCharacter clone() {
    Warrior copy = new Warrior(this.name);
    copy.health = this.health;
    copy.attack = this.attack;
    copy.defense = this.defense;
    return copy;
  }

  // 【getDescription メソッド】: 自分の情報を文字で返す
  @Override
  public String getDescription() {
    return "Warrior: " + name + " [HP:" + health + ", ATK:" + attack + ", DEF:" + defense + "]";
  }
}