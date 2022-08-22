package Interview.mstan;

public class gfg {

    static String checkPosNeg(int val)
    {

        String[] result = { "Positive", "Negative" };

        System.out.println(val >> 31);
        System.out.println();
        System.out.println(-1 & 1);

        // checks if the number is positive or negative
        return result[(val >> 31) & 1];
    }
    public static void main(String[] args)
    {
        int num;
        num = -15;

        System.out.println(num + " is " + checkPosNeg(num));
        System.out.println(11/2);
        System.out.println(10%2);
    }
}
