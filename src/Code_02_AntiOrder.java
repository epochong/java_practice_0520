/**
 * @author wangchong
 * @date 2019/5/20 20:58
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_AntiOrder {
    public static int count(int[] A, int n) {
        // write code here
        int res = 0;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[j + 1]) {
                    int tem = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tem;
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(count(arr, 8));
    }
}
