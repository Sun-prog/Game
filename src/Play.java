import java.util.ArrayList;
import java.util.List;



public class Play {
    public static void main(String ... args){
        ArrayList allGold = new ArrayList<Gold>();

List [] allEnemy;
List[] allWall;
Gold gold1 = new Gold(1,new Coordinate(4,1));
allGold.add(gold1);
        Gold gold2 = new Gold(1,new Coordinate(5,7));
        allGold.add(gold2);
        Gold gold3 = new Gold(1,new Coordinate(5,4));
        allGold.add(gold3);
MyBot bot2 = new MyBot(new Coordinate(4,3));
//System.out.println("Золото: x = "+smallGold.getLocCurrent().getX()+" y = "+ +smallGold.getLocCurrent().getY());
System.out.println("Начало Бот: x = "+bot2.getLocCurrent().getX()+" y = "+ +bot2.getLocCurrent().getY());
bot2.go(allGold, bot2);
        System.out.println("Бот сходил: x = "+bot2.getLocCurrent().getX()+" y = "+ +bot2.getLocCurrent().getY());
        bot2.go(allGold, bot2);
        System.out.println("Бот сходил : x = "+bot2.getLocCurrent().getX()+" y = "+ +bot2.getLocCurrent().getY());
    }
}
