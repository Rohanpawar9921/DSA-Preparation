public class b_MinMaxST {
    public static int tree[];

    public static void init(int n) {
        tree = new int[4*n];
    }

    public static void buildST (int arr[], int i, int si, int sj ) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }   
        int mid = si + (sj - si) / 2;

        buildST(arr,2*i+1, si, mid);
        buildST(arr,2*i + 2, mid+1, sj);

        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }

    public static int findMaxUtil(int arr[], int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) {
            return Integer.MIN_VALUE;
        }
        else if (si >= qi && sj <= qj) {
            return tree[i]; 
        }
        else {
            int mid = si + (sj - si) /2;
            int leftMax = findMaxUtil(arr, 2*i+1, si, mid, qi, qj);
            int rightMax = findMaxUtil(arr, 2*i+2, mid+1, sj, qi, qj);
            return Math.max(leftMax, rightMax);
        }
    }

    public static int findMax (int arr[],int qi, int qj) {
        int n = arr.length;
        return findMaxUtil(arr, 0, 0, n-1, qi, qj);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int val) {
        if (si == sj) {
            tree[i] = val;
            return;
        }

        int mid = si + (sj - si) / 2;
        if (idx <= mid) {
            updateUtil(2 * i + 1, si, mid, idx, val);
        } else {
            updateUtil(2 * i + 2, mid + 1, sj, idx, val);
        }

        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }


    public static void update (int arr[], int idx, int val) {
        int n = arr.length;
        arr[idx] = val;
        updateUtil(0, 0, n-1, idx, val);
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);

        System.out.println("before update : ");
        
        for(int i=0; i< tree.length; i++) {
            System.out.print(tree[i] + " ");
        } System.out.println();

        System.out.println("max in range 2 to 5 is : " + findMax(arr, 2, 5));

        System.out.println("after update :");
        update(arr, 4, 10);
        for(int i=0; i< tree.length; i++) {
            System.out.print(tree[i] + " ");
        } System.out.println();
        System.out.println("max in range 2 to 5 is : " + findMax(arr, 2, 5));


        
    }
}
