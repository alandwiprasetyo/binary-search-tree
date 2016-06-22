package test;

public class Tree{
	Node root;
	public Tree(){
//		root = null;
	}
	Node insert(int value){
		Node current = root;
		Node parent = null;
		if(current == null){
			root = new Node(value);
			return root;
		}else{
			while(current != null){
				parent = current;
				if(current.value < value){
					current = current.left;
					if(current == null){
						parent.left = new Node(value);
						return current;
					}
				}else if(current.value > value){
					current = current.right;
					if(current == null){
						parent.right = new Node(value);
						return current;
					}
				}else{
					return parent;
				}
			}
			return parent;
		}
	}

	void find(int value){
		Node current = root;
		boolean found = false;
		while(current!=null && !found){
			if(current.value < value){
				current = current.left;
			}else if(current.value > value){
				current = current.right;
			}else{
				found = true;
			}
		}
		if(found){
			System.out.println("Node with value "+value+": found");
		}else{
			System.out.println("Node with value "+value+": not found");
		}
	}
}