package enemies;

import behaviours.ITakeDamage;

public abstract class Enemy implements ITakeDamage {

    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    @Override
    public void ITakeDamage(Enemy Enemy) {

    }
}
