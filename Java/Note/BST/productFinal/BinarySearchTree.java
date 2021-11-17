public class BinarySearchTree {
    public static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(){}
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node root;

    public BinarySearchTree() {
        this.root = null;
    }
    
    public void insert(int newData) {
        this.root = insert(root, newData);
    }

    public Node insert(Node root, int newData) {
        if (root == null) {
            root = new Node(newData);
            return root;
        }
        else if (root.data >= newData) {
            root.left = insert(root.left, newData);
        } else {
            root.right = insert(root.right, newData);
        }
        return root;
    }

    public void LRN() {
        LRN(root);
    }

    public void LRN(Node root) {
        if (root == null) {
            return;
        }
        LRN(root.left);
        LRN(root.right);
        System.out.print(root.data + " ");
    }

    public int findMaximum() {
        if(root==null){
            return -1;
        }
        Node current = this.root;
        while (current.right != null) {
            current = current.right;
        }
        return (current.data);
    }

    public int findMinimum() {
        if(root==null){
            return -1;
        }
        Node current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    public static Node pre = new Node(), suc = new Node();
 
    public static void findPreSuc(int key){
        if (root == null)
            return;
        if (root.data == key){
            if (root.left != null){
                Node tmp = root.left;
                while (tmp.right != null)
                    tmp = tmp.right;
                pre = tmp;
            }
            if (root.right != null){
                Node tmp = root.right;
                
                while (tmp.left != null)
                    tmp = tmp.left;
                    
                suc = tmp;
            }
            return;
        }
        if (root.data > key){
            suc = root;
            root = root.right;
            findPreSuc(key);
        }else{
            pre = root;
            root = root.right;
            findPreSuc(key);
        }
    }

    //Driver Code
    public static void main(String[] args) {
        //BST Data
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);        bst.insert(4);        bst.insert(1);
        bst.insert(3);        bst.insert(5);        bst.insert(6);
        bst.insert(9);        bst.insert(7);        bst.insert(8);
        
        //Output BST
        System.out.print("Output BST by LRN is: "); bst.LRN();

        //Find Max and Min in BST
        System.out.println();
        System.out.println("Max of BST = " + bst.findMaximum());
        System.out.println("Min of BST = " + bst.findMinimum());

        //Find predecessor and successor
        final int FINDDATA = 4 ;    //The number for finding
        findPreSuc(FINDDATA);
        System.out.println("Predecessor of " + FINDDATA + " is " + pre.data);
        System.out.println("Successor   of " + FINDDATA + " is " + suc.data);
    }
}