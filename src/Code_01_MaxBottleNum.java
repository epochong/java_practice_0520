import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/20 19:49
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_MaxBottleNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<>();
        do {
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            if (n < 4) {
                sum += 1;
            } else {
                while (true) {
                    sum += n / 3;
                    n = n / 3 + n % 3;
                    if (n == 2) {
                        sum += 1;
                        break;
                    } else if (n == 1) {
                        break;
                    }
                }
            }
            res.add(sum);
        } while (true);
        res.forEach(i -> System.out.println(i));
        for (int i : res
             ) {
            System.out.println(i);
        }
    }
}
