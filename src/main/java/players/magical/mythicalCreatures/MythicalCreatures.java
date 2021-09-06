package players.magical.mythicalCreatures;

public abstract class MythicalCreatures {

    private int health;

    public MythicalCreatures(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }
}
