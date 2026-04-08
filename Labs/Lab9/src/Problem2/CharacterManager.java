package Problem2;

public class CharacterManager {
  public static void main(String[] args) {
    System.out.println("=== RPG Character System Demo ===\n");

    // 1. Factoryを使ってテンプレートからキャラクターを作る
    // 文法：Factoryが内部でBuilderを使って、"tank"設定の戦士を生成します
    GameCharacter tank = CharacterFactory.createTemplate("tank", "Kent");
    System.out.println("1.make template: " + tank.getDescription());

    // 2. Prototypeを使ってキャラクターをクローン（コピー）する
    // 文法：clone()メソッドで、今のステータスを保持したまま別個体を作ります
    GameCharacter tankCopy = tank.clone();
    System.out.println("2. make clone: " + tankCopy.getDescription());

    // 3. Builderを直接使って、自分好みの「こだわりキャラ」を作る
    // 文法：メソッドチェーンを使って1項目ずつ設定します
    CharacterBuilder builder = new CharacterBuilder();
    GameCharacter customMage = builder.setName("Sakura")
        .setHealth(120)
        .setAttack(80)
        .setDefense(10)
        .buildMage();
    System.out.println("3. custom: " + customMage.getDescription());

    // 4. Decoratorを使って装備を追加し、能力を強化する
    // 文法：元のキャラ(customMage)を、武器(Sword)でラッピングします
    Sword magicSword = new Sword();
    GameCharacter powerUpMage = new WeaponDecorator(customMage, magicSword);

    Chainmail chainmail = new Chainmail();
    GameCharacter armoredMage = new ArmorDecorator(customMage, chainmail);
    // Decoratorの効果は計算が必要なため、一度cloneして最新ステータスを表示
    System.out.println(  powerUpMage.getDescription());
    System.out.println(  powerUpMage.clone().getDescription());

    System.out.println(  armoredMage.getDescription());
    System.out.println(  armoredMage.clone().getDescription());
  }
}