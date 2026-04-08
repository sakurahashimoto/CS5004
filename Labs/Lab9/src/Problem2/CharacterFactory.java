package Problem2;

public class CharacterFactory {

  //"tank", "dps", "support" などのキーワードで、すでに設定済みのキャラクターを生成して返します。

  public static GameCharacter createTemplate(String type, String name) {
    CharacterBuilder builder = new CharacterBuilder();

    if (type.equalsIgnoreCase("tank")) {
      // タンク：戦士ベースでHPと防御を高く設定
      return builder.setName(name)
          .setHealth(200)
          .setAttack(15)
          .setDefense(30)
          .buildWarrior();

    } else if (type.equalsIgnoreCase("dps")) {
      // DPS（アタッカー）：魔法使いベースで攻撃特化
      return builder.setName(name)
          .setHealth(80)
          .setAttack(60)
          .setDefense(5)
          .buildMage();
    } else if (type.equalsIgnoreCase("support")) {
      return builder.setName(name)
          .setHealth(100)
          .setAttack(5)
          .setDefense(60)
          .buildMage();
    }
    return null;
  }
}