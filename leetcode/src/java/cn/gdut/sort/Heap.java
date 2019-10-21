package cn.gdut.sort;



/*
public class Heap {
    public void buildheap(int [] nums){
        int length = nums.length;
        int heapSize = length;
        int nonleaf = length / 2 -1;
        for (int i = nonleaf;i>=0;i--){
            heapify(nums, i, heapSize);
        }
    }

    private void heapify(int [] nums, int i, int heapSize){
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < heapSize){
            if (nums[i] > nums[left]){
                smallest = left;
            }
            else {
                smallest = i;
            }
        }
        if (right < heapSize){
            if (nums[smallest] > nums[right]){
                smallest = right;
            }
        }
        if (smallest != i){
            int tmp;
            tmp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = tmp;
            heapify(nums, smallest, heapSize);
        }
    }

    public void heapsort(int [] nums){
        int heapSize = nums.length;
        buildheap(nums);

        for (int i = 0;i<nums.length;i++){
            int temp;
            temp = nums[0];
            nums[0] = nums[heapSize-1];
            nums[heapSize-1] = temp;
            heapSize = heapSize - 1;
            heapify(nums,0 ,heapSize);

        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        int [] nums = {6,7,4,8,2,1,12,5};
        heap.heapsort(nums);
        for (int n : nums){
            System.out.println(n);
        }
    }
}
*/
public class Heap{

    /**
     * 建立根堆 ,每次shit，根节点是最大的值
     * @param nums 数组
     * @param low 最小的下标
     * @param high 最大下表。
     */
    private void shit(int [] nums, int low, int high){
        // num[j] 是num[i] 的左孩子，num[j+1]是右孩子
        int i = low, j = 2 * i;
        // tmp表示的是双亲节点
        int tmp = nums[i];
        while (j <= high){
            // 如果i有左右孩子，并且右孩子较大，则将j指向右孩子
            if (j < high && nums[j+1] > nums[j]){
                j++;
            }
            // 如果双亲节点比左孩子大，则将num[j]调到双亲节点上
            if (tmp < nums[j]){
                // 修改i和j的值，以便向下筛选
                nums[i] = nums[j];
                i = j;
                j = 2 * i;
            }
            // 否则，本次循环结束，跳出
            else{
                break;
            }
        }
        // 被筛选的节点的值放入最终的位置
        nums[i] = tmp;

    }

    /**
     * 堆排序
     * @param nums 传入数组
     */
    private void  heapSort(int [] nums){
        int n = nums.length;
        int i, tmp;
        n = n+1;

        // 建立初始堆
        for (i = n / 2;i >= 1;i++){
            shit(nums, i, n);
        }
        // 进行n次堆排序，每一趟堆排序的个数减1.
        for (i = n;i >= 2;i--){
            // 将最后一个元素与区间内的nums[i]对换
            tmp = nums[i];
            nums[i] = nums[1];
            nums[1] = tmp;
            // 筛选num[1]节点，得到i-1个节点
            shit(nums, i, i-1);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        int [] nums = {6,7,4,8,2,1,12,5};
        heap.heapSort(nums);
        for (int n : nums){
            System.out.println(n);
        }
    }
}