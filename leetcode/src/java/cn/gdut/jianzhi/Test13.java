package cn.gdut.jianzhi;

public class Test13 {

    private static final int[][] next = {{-1,0},{1,0},{0,1},{0,-1}};
    private int cnt = 0;
    private int rows;
    private int cols;
    private int threshold;
    // 用于存储每一个点中各个位数的和
    private int [][] digitSum;

    public int movingCount(int threshold, int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        // 初始化每一个格子的的数字和
        initDigitSum();
        boolean[][] marked = new boolean[rows][cols];
        dfs(marked, 0,0);
        return cnt;

    }

    private void dfs(boolean[][] marked, int r, int c){
        // 判断边界
        if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c]){
            return;
        }
        // 访问它
        marked[r][c] = true;
        if (this.digitSum[r][c] > this.threshold){
            return;
        }
        cnt++;
        for (int[] n : next){
            dfs(marked, r + n[0], c + n[1]);
        }
    }

    private void initDigitSum(){
        int[] digitSumOne = new int[Math.max(rows, cols)];
        for (int i = 0; i < digitSumOne.length; i++){
            int n = i;
            while (n > 0){
                digitSumOne[i] += n % 10;
                n /= 10;
            }
        }

        this.digitSum = new int[rows][cols];
        for (int i = 0; i < this.rows; i++){
            for (int j = 0; j < this.cols; j++){
                this.digitSum[i][j] = digitSumOne[i] + digitSumOne[j];
            }
        }
    }

    public static void main(String[] args) {
        Test13 test13 = new Test13();
        System.out.println(test13.movingCount(14, 12,14));
    }
}
