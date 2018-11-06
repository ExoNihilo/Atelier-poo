public class Monster {
    private String name;
    private int attack;
    private int life;

    public Monster(String name, int attack, int life) {
        this.name = name;
        this.attack = attack;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void takeHit(int hit) {
        this.life = this.life - hit;
        if(this.life < 0) {
            this.life = 0;
        }
        System.out.println(this.name + " has " + this.life + " points remaining.");
    }

    public boolean isKO() {
        if(this.life > 0) {
            return false;
        } else {
            System.out.println(this.name + " is KO!");
            return true;
        }
    }
}


