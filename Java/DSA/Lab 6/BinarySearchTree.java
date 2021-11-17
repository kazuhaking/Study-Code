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

        public int data(){
            return this.data;
        }

    }

    private static Node root;

    private BinarySearchTree() {
        this.root = null;
    }
    
    private void insert(int newData) {
        this.root = insert(root, newData);
    }

    private Node insert(Node root, int newData) {
        if (root == null) {
            root = new Node(newData);
            return root;
        }
        else if (root.data > newData) {
            root.left = insert(root.left, newData);
        } else {
            root.right = insert(root.right, newData);
        }
        return root;
    }

    private void NLR(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        NLR(root.left);
        NLR(root.right);
    }
    
    private void NLR() {
        NLR(root);
    }


    private static Node pre = new Node(), suc = new Node();
 
    private static void findPreSuc(int key){
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

    private static Node search(Node root, int key){
        if(root==null)  return null;
        int tmp = key - root.data();
        if(tmp<0)       return search(root.left, key);
        else if(tmp>0)  return search(root.right, key);
        else            return root;
    }

    private static Node search(int key){
        return search(root, key);
    }

    private static Node min(){
        return min(root);
    }

    private static Node min(Node root){
        if(root.left==null)  return root;
        return min(root.left);
    }

    private static Node max(){
        return min(root);
    }

    private static Node max(Node root){
        if(root.right==null)  return root;
        return max(root.right);
    }

    private static Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        return x;
    }

    private static Node deleteMin() {
        return deleteMin(root);
    }

    private static Node delete(Node root, Integer key) {
        if (root==null) return null;
        int cmp = key - root.data();
        if (cmp < 0)        root.left = delete(root.left, key);
        else if (cmp > 0)   root.right = delete(root.right , key);
        else {
            if (root.right == null)    return root.left;
            if (root.left == null)     return root.right;

            Node t = root;
            root = min(t.right);
            root.right = deleteMin(t.right);
            root.left = t.left;
        }
        return root;
    }

    public static void LNR(Node root){
        if(root==null)  return;
        LNR(root.left);
        System.out.print(root.data() + " ");
        LNR(root.right);
    }

    public static void RNL(Node root){
        if(root==null)  return;
        RNL(root.right);
        System.out.print(root.data() + " ");
        RNL(root.left);
    }

    public void printAscending(){
        LNR(root);
    }

    public void printDesending(){
        RNL(root);
    }

    private static Node delete(int key) {
        return delete(root, key);
    }

    public static int height(Node root){
        if(root==null)  return 0;
        return 1 + Math.max(height(root.right), height(root.left));
    }

    public static int height(){
        return height(root) - 1;
    }

    public static Integer sum(Node sRoot){
        if(sRoot==null)    return 0;
        return sRoot.data() + sum(sRoot.right) + sum(sRoot.left);
    }

    public static Integer sum(){
        return sum(root);
    }


    //Driver Code
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);        bst.insert(4);        bst.insert(1);
        bst.insert(3);        bst.insert(5);        bst.insert(6);
        bst.insert(9);        bst.insert(7);        bst.insert(8);
        
        System.out.print("Output BST is: "); bst.printAscending(); 
        // System.out.println(); bst.printDesending();
        System.out.println("HH = " + bst.sum());
    }
}