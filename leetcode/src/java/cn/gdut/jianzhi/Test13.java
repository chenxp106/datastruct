package cn.gdut.jianzhi;

public class Test13 {

    private final static int[][] next = {{0,1},{0,-1},{1,0},{-1,0}};
    private int rows;
    private int cols;
    private int threshold;
    // 用于存储每个节点中的数字和
    private int [][] digistSum;
    // 结果，count
    private int cnt;

    public int movingCount(int threshold, int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        digist(rows, cols);
        boolean [][] marked = new boolean[rows][cols];
        dfs(marked, 0 ,0);
        return cnt;

    }

    private void dfs(boolean [][] marked, int r, int c){
        if (c < 0 || c >= cols || r < 0 || r >= rows || marked[r][c]){
            return;
        }
        marked[r][c] = true;
        if (this.digistSum[r][c] > this.threshold){
            return;
        }
        cnt++;
        for (int [] x : next){
            dfs(marked, r + x[0], c + x[1]);
        }
    }

    private void digist(int rows, int cols){
        int[] digitSumOne = new int[Math.max(rows, cols)];
        for (int i = 0; i < digitSumOne.length; i++){
            int n = i;
            while (n > 0){
                digitSumOne[i] += n % 10;
                n /= 10;
            }
        }
        this.digistSum = new int[rows][cols];
        for (int i = 0;i < this.rows; i++){
            for (int j = 0; j < this.cols; j++){
                this.digistSum[i][j] = digitSumOne[i] + digitSumOne[j];
            }
        }
    }


    public static void main(String[] args) {
        Test13 test13 = new Test13();
        System.out.println(test13.movingCount(14, 12,14));
    }
}
