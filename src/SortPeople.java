import java.util.Arrays;
import java.util.HashMap;

public class SortPeople {
    public static void main(String[] args) {
        sortPeople(new String[]{"IEO", "Sgizfdfrims", "QTASHKQ", "Vk", "RPJOFYZUBFSIYp", "EPCFFt", "VOYGWWNCf", "WSpmqvb"}, new int[] {17233,32521,14087,42738,46669,65662,43204,8224});
    }

    static public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        int box;
        for(int i = 0; i<heights.length; i++){     //sort heights
            for(int j = i+1; j<heights.length; j++){
                if(heights[i]<heights[j]){
                    box=heights[i];
                    heights[i]=heights[j];
                    heights[j]=box;
                }
            }
            System.out.println(Arrays.toString(heights));
        }
        for (int i = 0; i < heights.length; i++) {
            names[i]=map.get(heights[i]);
        }
        System.out.println(Arrays.toString(names));
        return names;
    }
}
