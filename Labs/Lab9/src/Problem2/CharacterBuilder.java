package Problem2;

import java.util.ArrayList;
import java.util.List;

public class CharacterBuilder {
  private String name;
  private int health;
  private int attack;
  private int defense;

  private List<Equipment> equipments = new ArrayList<>();

  // 1. 名前をセットする欄
  public CharacterBuilder setName(String name) {
    this.name = name;
    return this; // 【重要】自分自身を返すことで「.」で繋げられるようにする
  }

  // 2. HPをセットする欄
  public CharacterBuilder setHealth(int health) {
    this.health = health;
    return this;
  }

  // 3. 攻撃力をセットする欄
  public CharacterBuilder setAttack(int attack) {
    this.attack = attack;
    return this;
  }

  public CharacterBuilder setDefense(int defense) {
    this.defense = defense; // メモ帳の「防御力」欄に書き込む
    return this;            // 自分自身（注文票）を返す
  }

  // 4. 最後に「戦士」として完成させるボタン
  public GameCharacter buildWarrior() {
    Warrior w = new Warrior(this.name);
    w.health = this.health;
    w.attack = this.attack;
    w.defense = this.defense;
    return w;
  }

  // 5. 最後に「魔法使い」として完成させるボタン
  public GameCharacter buildMage() {
    Mage m = new Mage(this.name);
    m.health = this.health;
    m.attack = this.attack;
    m.defense = this.defense;
    return m;
  }

  public CharacterBuilder addEquipment(Equipment equipment) {
    this.equipments.add(equipment); // リストに剣や鎧を放り込む
    return this; // 次の注文へ繋げる
  }

}