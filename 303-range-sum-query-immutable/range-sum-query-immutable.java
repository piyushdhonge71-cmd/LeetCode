class NumArray {
    private class node{
        int val;
        int startInterval;
        int endInterval;

        node left;
        node right;

        node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    node root;
    public NumArray(int[] nums) {
        this.root = tree(nums, 0, nums.length-1);
    }
    
    public int sumRange(int left, int right) {
        return sumRange(root, left, right);
    }
    private int sumRange(node parentRoot, int qsi, int qei){
        if(qsi <= parentRoot.startInterval && qei >= parentRoot.endInterval){
            return parentRoot.val;
        }
        else if(qei < parentRoot.startInterval || qsi > parentRoot.endInterval){
            return 0;
        }
        else{
            return sumRange(parentRoot.left, qsi, qei) + sumRange(parentRoot.right, qsi, qei);
        }
    }


    public node tree(int[] arr, int s, int e){
        if(s == e){
            node leaf = new node(s,e);
            leaf.val = arr[s];
            return leaf;
        }
        node root = new node(s,e);
        int mid = s + (e-s)/2;
        

        root.left = tree(arr,s,mid);
        root.right = tree(arr,mid+1,e);

        root.val = root.left.val + root.right.val;

        return root;

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */