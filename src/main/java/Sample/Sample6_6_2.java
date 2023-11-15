import java.io.*;

public class Sample6_6_2 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));

        /* 月に対応する英単語の配列の宣言と初期値設定 */
        String[] arrayWord = {"","Jan","Feb","Mar","Apr","May","Jun",
                                "Jul","Aug","Sep","Oct","Nov","Dec"};

        /* 月の入力と対応する英単語の設定 */
        System.out.print("1-12の月＞");
        int month = Integer.parseInt(br.readLine());    //①
        String strWord = arrayWord[month];              //②

        System.out.println(strWord);
    }
}
/* プログラムの説明
 * ①たとえば、４月を表示するために変数monthに４を入力する
 * ②配列の内容を直接参照する
 *  なお、月の値をそのまま添字として用いるために、０番目の要素は利用していない。
 */