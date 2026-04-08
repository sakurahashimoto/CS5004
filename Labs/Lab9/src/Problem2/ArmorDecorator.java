package Problem2;

public class ArmorDecorator extends BaseEquipmentDecorator {
  private Equipment equipment; // 剣や斧などの具体的なデータ

  public ArmorDecorator(GameCharacter character, Equipment equipment) {
    super(character); // 親クラス（Base）にキャラクターを預ける
    this.equipment = equipment;
  }

  @Override
  public String getDescription() {
    // 中の人の説明 ＋ 装備の説明
    return decoratedCharacter.getDescription() + " + " + equipment.getDescription();
  }

  @Override
  public GameCharacter clone() {
    GameCharacter copy = decoratedCharacter.clone();
    copy.defense += equipment.getDefenseBonus();
    return copy;
  }
}