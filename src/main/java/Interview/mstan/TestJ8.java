package Interview.mstan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Program to find n occurrences of a character in a string
 */
public class TestJ8 {

    public static void main(String[] args) {

        String str="occurrancesssss";
        char[] charArr=str.toCharArray();
        List<Character> listArray = new ArrayList<>();

        for (char c : charArr)
            listArray.add(c);

        Stream<Character> cStream=listArray.stream();

        Long count =cStream.filter(ch->ch.equals('s')).count();

        System.out.println(Long.valueOf(count));

    }


}


