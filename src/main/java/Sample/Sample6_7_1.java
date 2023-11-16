public class Sample6_7_1 {
    public static void main(String[] args) {
        int[] arrayScore = {80,75,85,95,90};        //①
        int[] arrayEnglish;                         //②

        arrayEnglish    = arrayScore;               //③
        arrayEnglish[2] = 100;                      //④

        for (int i = 0; i < arrayScore.length; i++) {
            System.out.println(arrayScore[i]);      //⑤
        }
    }
}
