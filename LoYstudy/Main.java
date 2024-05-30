
import java.util.*;
public class Main {
    public static void main(String[] args){

        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }
        System.out.println("=========================================================");
        for(Integer i : v){
            System.out.println(i);
        }
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();

        scoreMap.put("김성동", 97);
        scoreMap.put("황기태", 88);
        scoreMap.put("김남윤", 98);
        scoreMap.put("이재문", 70);
        scoreMap.put("한원선", 99);

        System.out.println("=================================================================");
        System.out.println("HashMap의 요소 개수 :" + scoreMap.size());

        Set<String> keys = scoreMap.keySet();
        Iterator<String> it2 = keys.iterator();
        while (it2.hasNext()){
            String name = it2.next();
            int score = scoreMap.get(name);
            System.out.println(name+":"+score);
        }
        System.out.println("===================================================================");
        for(String key : keys){
            System.out.println(key+":"+scoreMap.get(key));
        }
    }
}
