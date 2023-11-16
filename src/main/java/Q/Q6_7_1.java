public class Q6_7_1 {
    public static void main(String[] args) {
        int[] arrayScore = {80,75,85,95,90};
        int[] arrayJapan;

        arrayJapan = arrayScore;
        arrayScore[0] -= arrayJapan[0];
        arrayJapan[1] += 25;
        arrayScore[2] = 100;
        arrayJapan[3] = 100;
        arrayJapan[4]++;

        for (int i = 0; i < arrayJapan.length; i++) {   //表示
            System.out.println(i + "\t" + arrayScore[i]);
        }
    }
}
/* プログラム実行後の配列の内容
 *              [0]     [1]     [2]     [3]     [4]     
 * arrayScore    0     100     100     100      91
 */