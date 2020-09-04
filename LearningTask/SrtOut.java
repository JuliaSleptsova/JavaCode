public class SrtOut {
    public static void main(String[] args) {

        String myString = "           h                  III love               you hhhhhhhhhhhh hhhhhhhhhhhh uuuuuuu  ";
        //String pb = "-";
        //String[] subStr = myString.split(pb);
        int Start = 0;
        int Last = 0;

        while (Last<myString.length()) {
            if (myString.charAt(Last) == ' ') {
                while (Last>Start && myString.charAt(Start)==' ') ++Start;
                if (Last>Start) {
                    System.out.println(myString.substring(Start, Last));
                    Start = Last;
                }
            }

            Last++;
        }
    }
}


