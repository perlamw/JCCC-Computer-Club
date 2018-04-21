package tree;


public class BSearchTree<T extends Comparable<T>> implements BSTInterface<T> {

	protected BSTNode<T> root;
	protected boolean found;
	
	public BSearchTree() {
	
		root = null;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return recSize(root);
	}
	
	private int recSize(BSTNode<T> tree) {
		if (tree == null)
			return 0;
		else 
			return recSize(tree.getLeft()) + recSize(tree.getRight()) + 1;
		
	}

	@Override
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		recRemove(root, element);
		return found;
	}
	
	private BSTNode<T> recRemove(BSTNode<T> tree, T element) {
		if (tree == null)
			found = false;
		if (element.compareTo(tree.getInfo()) < 0)
			tree.setLeft(recRemove(tree.getLeft(), element));
		else if (element.compareTo(tree.getInfo()) > 0)
			tree.setRight(recRemove(tree.getRight(), element));
		else {
			tree = removeNode(tree);
			found = true;
		}
		return tree;
				
	}
	
	private BSTNode<T> removeNode(BSTNode<T> tree) {
		return null;
	}

	
	@Override
	public T get(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T element) {
		// TODO Auto-generated method stub
		BSTNode<T> newNode = new BSTNode(element);
		BSTNode<T> prevNode, currNode;
		
		currNode = root;
		prevNode = root;
		if (root == null)
			root = newNode;
		else {
			while (currNode != null) {
				prevNode = currNode;
				if (element.compareTo(currNode.getInfo()) <= 0) {
					currNode = currNode.getLeft();
				}
				else {
					currNode = currNode.getRight();
				}
			}
			if (element.compareTo(prevNode.getInfo()) <= 0)
				prevNode.setLeft(newNode);
			else
				prevNode.setRight(newNode);
				
		}
		
		System.out.println("Root: " + root.getInfo());
		
	}

	public BSTNode<T> getRoot() {
		return root;
	}

	@Override
	public int reset(int orderType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getNext(int orderType) {
		// TODO Auto-generated method stub
		return null;
	}

}
