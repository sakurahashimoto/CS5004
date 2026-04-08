package Problem2;

public class Mage extends GameCharacter {

  public Mage(String name) {
    this.name = name;
    this.health = 80;  // 魔法使いは弱い
    this.attack = 40;  // でも攻撃力はすごい
    this.defense = 5;
  }

  @Override
  public GameCharacter clone() {
    Mage copy = new Mage(this.name);
    copy.health = this.health;
    copy.attack = this.attack;
    copy.defense = this.defense;
    return copy;
  }

  @Override
  public String getDescription() {
    return "Mage: " + name + " [HP:" + health + ", ATK:" + attack + ", DEF:" + defense + "]";
  }
}