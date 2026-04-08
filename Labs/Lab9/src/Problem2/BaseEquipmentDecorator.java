package Problem2;

// [1] デコレーター自身も GameCharacter のフリをします
public abstract class BaseEquipmentDecorator extends GameCharacter {
  // [2] 中に「包み込まれるキャラクター」を保持します
  protected GameCharacter decoratedCharacter;

  public BaseEquipmentDecorator(GameCharacter character) {
    this.decoratedCharacter = character;
  }

  // [3] クローンも中の人をコピーするようにします
  @Override
  public GameCharacter clone() {
    return decoratedCharacter.clone();
  }
}