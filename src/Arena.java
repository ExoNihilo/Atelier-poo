public class Arena {
    public static void main(String[] args) {

        Monster gobelin = new Monster("Gobelin", 3, 12 );
        Monster orc = new Monster ("Orc", 6, 15);

        while(!gobelin.isKO() && !orc.isKO()){
            orc.takeHit(gobelin.getAttack());
            gobelin.takeHit(orc.getAttack());
        }
    }
}
