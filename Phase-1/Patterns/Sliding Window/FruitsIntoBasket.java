
import java.util.HashMap;

public class FruitsIntoBasket {
    public int fruitBasket(int[] fruits){
        int low = 0, res = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int high = 0; high < fruits.length; high++){
            if(hm.containsKey(fruits[high])){
                hm.put(fruits[high], hm.get(fruits[high]) + 1);
            }else{
                hm.put(fruits[high], 1);
            }
            while(hm.size() > 2){
                hm.put(fruits[low], hm.get(fruits[low]) - 1);
                if(hm.get(fruits[low]) == 0){
                    hm.remove(fruits[low]);
                }
                low++;
            }
            res = Math.max(res, high + low - 1);
        }
        return res;
    }
    public static void main(String[] args){
        FruitsIntoBasket fib = new FruitsIntoBasket();
        fib.fruitBasket(new int[]{1, 2, 3, 4, 5});
    }
}
