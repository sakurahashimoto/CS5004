package Problem2;

public class WeaponDecorator extends BaseEquipmentDecorator {
  private Equipment equipment; // 剣や斧などの具体的なデータ

  public WeaponDecorator(GameCharacter character, Equipment equipment) {
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
    copy.attack += equipment.getAttackBonus();
    return copy;
  }
}