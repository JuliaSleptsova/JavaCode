public class min3numbers {
    public static int min1(int a, int b, int c) {

        int min;
        if (a > b){
            if (c > b){
                min = b;
            }
            else {
                min = c;
            }
        }
        else {
            if (a> c){
                min = c;
            }
            else {
                min  = a;
            }
        }
        return min;
    }
    public static int min(int a, int b, int c){
        int min;
        if ( a < b && a < c){
            min = a;
        }
        else {
            if (c < b) {
                min = c;
            }
            else {
                min = b;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
