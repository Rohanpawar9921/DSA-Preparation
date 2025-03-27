import java.util.ArrayList;

public class heap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        
        public void add(int data){ //log n

            //step1 - add at last
            //step2 - child = size - 1, par = (child - 1)/2
            //while - child > par -> swap par-child -> child = par, par = (child - 1)/2 

            //add at last
            arr.add(data);

            int child = arr.size() - 1;
            int par = (child-1)/2;

            while(arr.get(child) > arr.get(par)){ //log(n)
                //swap
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);

                child = par;
                par = (child - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }
        //delete -->

        //swap first and last
        //remove last index
        //fix remaning heap -> heapify function

        //heapify --> 
        //1. find root, leftchild, rightchild
        //2. find minimum between these
        //3. swap minimum with parent -> call heapify for minindex
        private void heapify(int i){
            
            int left = 2*i+1;
            int right = 2*i+2;
            int maxIdx = i;

            if(arr.size() > left && arr.get(maxIdx) < arr.get(left)){
                maxIdx = left;
            }
            if(arr.size() > right && arr.get(maxIdx) < arr.get(right)){
                maxIdx = right;
            }
            if(maxIdx != i){
                //swap
                int temp = arr.get(maxIdx);
                arr.set(maxIdx, arr.get(i));
                arr.set(i, temp);

                heapify(maxIdx);
            }
        }

        public int remove() { //log n
            int data = arr.get(0);

            //step1 - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2- delete last
            arr.remove(arr.size()-1);

            //step3 - heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
        //priority queue and heap is same internally
    }
}
