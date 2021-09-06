package players;

public abstract class Player {

    private int health;

    public Player(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }
}
