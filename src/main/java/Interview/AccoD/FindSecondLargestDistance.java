package Interview.AccoD;

import java.util.*;

/**
 * Below are the given coordinates of points on graph
 * {1,0},{2,0},{3,0},{-1,0},{0,2},{-2,0}
 * Find all the points that are at second farthest distance from center i.e. {0,0} ?
 * Answer for above input {0,2},{2,0},{-2,0}
 * Formula to get distance from center is d2=x2+y2
 */
public class FindSecondLargestDistance {

    public static void main(String[] args) {

       // int[][] points = {{1, 0}, {2, 0}, {3, 0}, {-1, 0}, {0, 2}, {-2, 0}, {6, 0}};
        int[] arr = {1, 2, 3, 1, 2, 2};
        //int len = points.length;
        int lenArr = arr.length;
        HashMap<Point, Integer> hm = new HashMap<Point, Integer>();
        hm.put(new Point(1, 0), Integer.valueOf(1));
        hm.put(new Point(2, 0), Integer.valueOf(2));
        hm.put(new Point(3, 0), Integer.valueOf(3));
        hm.put(new Point(-1, 0), Integer.valueOf(1));
        hm.put(new Point(0, 2), Integer.valueOf(2));
        hm.put(new Point(-2, 0), Integer.valueOf(2));
        hm.put(new Point(5, 0), Integer.valueOf(5));
        hm.put(new Point(6, 0), Integer.valueOf(6));

        Set<Integer> tr = new TreeSet<>();

        for (Map.Entry m : hm.entrySet()) {
            tr.add((Integer) m.getValue());
        }
        int treeSize = tr.size();
        List<Integer> setArra = new ArrayList<>(tr);
        Collections.sort(setArra, Collections.reverseOrder());
        System.out.println(setArra);
        Optional<Integer> secondFarth = setArra.stream().limit(2).skip(1).findFirst();

        System.out.println(" Second farther distance --> " + secondFarth.get());


        int mapSize = hm.size();
        List<Point> pointArra = new ArrayList<>();

        for (Map.Entry j : hm.entrySet()) {
            if (j.getValue().equals(secondFarth.get())) {
                pointArra.add((Point) j.getKey());
            }
        }

    }
}
