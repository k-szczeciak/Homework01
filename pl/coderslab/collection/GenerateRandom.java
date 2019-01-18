package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

    public static void main(String[] args) {
        //System.out.println("test");
        Map<Integer, Integer> drawResult = checkRand(50000, 10);

        for (Integer key: drawResult.keySet()
             ) {
            System.out.println(key + " : " + drawResult.get(key));
        }
    }

    public static Map<Integer, Integer> checkRand(int amount, int interval){

        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        Random rand = new Random();

        for (int i = 0; i < amount; i++) {
            int draw =  rand.nextInt(interval);
            if (result.containsKey(draw)){
                int curAmount = result.get(draw);
                    curAmount++;
                    result.put(draw, curAmount);
                }else{
                    result.put(draw, 1);

            }
        }
        return result;
    }
}
