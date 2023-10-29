import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose your character: (1) Warrior, (2) Mage");
        int choice = scanner.nextInt();

        CharacterFactory characterFactory = null;
        switch (choice){
            case 1:
                characterFactory = new WarriorFactory();
                break;
            case 2:
                characterFactory = new MageFactory();
                break;
            case 0:
                System.out.println("Invalid choice. Exiting.");
                System.exit(0);
                break;
        }
        createAndIntroduceCharacter(characterFactory);
    }
    public static void createAndIntroduceCharacter(CharacterFactory factory) {
        Character character = factory.createCharacter();
        System.out.println(character.introduce());
    }

}