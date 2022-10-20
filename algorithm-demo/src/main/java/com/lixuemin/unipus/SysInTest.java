import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class SysInTest{
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String arrStr = in.nextLine();
        int k = in.nextInt();
        String[] arrIn = arrStr.split(" ");
        List<Integer> list = new ArrayList<>(arrIn.length);
        Map<Integer, Integer> map = new HashMap<>();
        for(String s : arrIn){
            Integer key = Integer.valueOf(s);
            map.put(key, map.getOrDefault(key,0) + 1);
        }
        list.sort((a,b) -> {
            int a1 = map.get(a);
            int b1 = map.get(b);
            return a1 != b1 ? b1 - a1 : b - a;
        });
        for(int i = 0; i < k; i++){
            list.remove(i);
        }
        System.out.println(new HashSet<>(list).size());
    }

}