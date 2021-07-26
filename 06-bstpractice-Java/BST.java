
class Node {
    public int value;
    public Node left, right;
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    public Node root;
    
    public BST(int value) {
        this.root = new Node(value);
    }

    public void insert(int value) {
    	// Your code goes here
        insert(root,value);
    }

    private void insert(Node node, int value) {
    	// Your code goes here

        if(node==null )
        {
            root=new Node(value);          
            // return root;
        }
        if(value<root.value)
        {
            root.left=insert(root.left,value);
        }
        System.out.println("suk: "+node.value);
    }

    public boolean search(int value) {
    	// Your code goes here
    	// return false;
        return search(root,value);
    }

    private boolean search(Node current, int value) {
    	// Your code goes here



        System.out.println("ch: "+current.value);
    	return false;
    }

}