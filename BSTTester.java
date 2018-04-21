package tree;


public class BSTTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSearchTree<String> bst = new BSearchTree();
		System.out.println(bst);
		bst.add("h");
		bst.add("e");
		BSTNode<String> bstroot = bst.getRoot();
		System.out.println(bstroot.getInfo());
		System.out.println(bstroot.getLeft().getInfo());
		BSTNode<String> n1 = new BSTNode("m");
		bstroot.setRight(n1);
		System.out.println(bstroot.getRight().getInfo());		
	}

}
