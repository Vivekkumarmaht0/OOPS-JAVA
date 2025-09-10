// If a class extends an abstract class, it is forced to give implementation for all
// abstract method present in the parents class if a child class to do so, 
// then it also must be tagged as abstract.

abstract class Enemy {
    abstract void spawn();
    abstract void attack();
} 
abstract class BossEnemy extends Enemy {
    @Override
    void spawn() {
        System.out.println("Boss Enemy is making a dramatic entry");
    }
}
class Dragon extends BossEnemy {
    @Override
    void attack() {
        System.out.println("spitting fire");
    }
}
class Assisin extends BossEnemy {
    @Override
    void attack() {
        System.out.println("Shoots Bullets");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        BossEnemy boss1 = new Dragon();
        BossEnemy boss2 = new Assisin();
        boss1.spawn();
        boss2.spawn();
        boss1.attack();
        boss2.attack();
    }
}
