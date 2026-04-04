package Trees;

public class countNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

        static class BinaryT{
            static int idx= -1;
            public static Node buildTree(int node[]){
                idx++;
                if(node[idx]== -1){
                    return null;
                }

                Node newNode= new Node(node[idx]);
                newNode.left= buildTree(node);
                newNode.right= buildTree(node);

                return newNode;
            }

        public static int CountOfNodes(Node root){
            if(root== null){
                return 0;
            }

            int leftNode= CountOfNodes(root.left);
            int rightNode= CountOfNodes(root.right);

            return 1+ leftNode+ rightNode;
        }

        public static void main(String[] args){
            int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryT tree= new BinaryT();
            Node root= tree.buildTree(node);

            countNode obj= new countNode();

            System.out.println(tree.CountOfNodes(root));
        }
    }
}
