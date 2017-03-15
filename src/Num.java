public class Num {
    public static void main(String[] args) {

        int [] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        int sum = (num[0] + num[2] + num[4]);

        System.out.println("suma liczb 1,3,5 w tablicy: " + num[0]+"+" + "" + num[2]+"+" + num[4] + "="+ sum);


    }
}
