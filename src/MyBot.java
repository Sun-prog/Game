import java.util.*;

public class MyBot {
    boolean    invisible;
    int        speed;
    int        MyBotx;
    int        MyBoty;
    int        score;
    Coordinate LocCurrent;


    public MyBot(Coordinate locCurrent) {
        LocCurrent = locCurrent;
    }

    public MyBot(int x, int y) {
        this.MyBotx = x;
        this.MyBoty = y;
    }

    public Coordinate getLocCurrent() {
        return LocCurrent;
    }

    Coordinate go(ArrayList<Gold> gold, MyBot ...bots){

        //оределяем дистанцию до ближайшего золота
        Map<Gold, Integer> allDistance = new HashMap<>();
        Integer distanse = 0;
        int numberDistance =0;
       // for (int y=0;y<gold.size();y++) {
        for (Gold a:gold) {
            System.out.println("Координаты Золото: x = "+a.getLocCurrent().getX()+" y = "+ a.getLocCurrent().getY()+"номер золота = "+ numberDistance);
            distanse =  Math.abs(LocCurrent.getX()-a.getLocCurrent().getX())+Math.abs(LocCurrent.getY()-a.getLocCurrent().getY());
            System.out.println("Дистанция до этого золота = "+distanse);
           // i- номер золота, дистанция к нему
            allDistance.put(a,distanse);
            numberDistance++;
        }
        List<Integer> sortDistanse = new ArrayList<>(allDistance.values());
        Collections.sort(sortDistanse);
        int indexMinDistance =0;
        System.out.println("минимальная дистанция = "+sortDistanse.get(indexMinDistance));
        Integer MinDistance =sortDistanse.get(indexMinDistance);
        Gold aimGold = getKeyFromValue(allDistance,MinDistance);
        System.out.println("значит двигаемся к золоту с координатами x = "+aimGold.getLocCurrent().getX()+" y = "+ aimGold.getLocCurrent().getY());
//уже двигаемся к золоту aimGold
        if (LocCurrent.getX()>aimGold.getLocCurrent().getX()) {
            int i = LocCurrent.getX();
            i--;
            LocCurrent.setX(i);
            return LocCurrent;
        } else  if (LocCurrent.getX()<aimGold.getLocCurrent().getX()) {
            int i = LocCurrent.getX();
            i++;
            LocCurrent.setX(i);
            return LocCurrent;
        } else  if (LocCurrent.getY()<aimGold.getLocCurrent().getY()) {
            int i = LocCurrent.getY();
            i++;
            LocCurrent.setY(i);
            return LocCurrent;
        } else    {
            int i = LocCurrent.getY();
            i--;
            LocCurrent.setY(i);
            return LocCurrent;
        }

    }
    public static Gold getKeyFromValue(Map<Gold, Integer> hm, Object value) {
        for (Gold o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
}
