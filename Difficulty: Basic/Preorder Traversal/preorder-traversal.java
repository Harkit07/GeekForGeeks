/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    private void preOrderUtil(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        preOrderUtil(root.left, list);
        preOrderUtil(root.right, list);
    }
    
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> list = new ArrayList<>();
        preOrderUtil(root, list);
        return list;
    }
}