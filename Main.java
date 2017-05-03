class Main {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		
		System.out.println("push method adds node at the end: ");
		list.push(9);
		list.push(9);
		list.push(13);
		list.push(13);
		list.push(12);
		list.push(12);
		list.showList();
		list.delDupl();
		list.showList();

		// System.out.println("pushFront method adds a node at the front: ");
		// list.pushFront(8);
		// list.showList();
		// System.out.println();

		// System.out.println("pop method removes a node from the front: ");
		// list.pop();
		// list.showList();
		// System.out.println();

		// System.out.println("popBack method removes a node from the end: ");
		// list.popBack();
		// list.showList();
		// System.out.println();

		// System.out.println("remove method removes a node: ");
		// list.remove(8);
		// list.showList();	
		// System.out.println();

		// System.out.println("find menthod finds node data 12: " + list.find(12));
		// // list.find(12);
		// // list.showList();
		// System.out.println();

		// System.out.println("length method shows the length of the list of nodes: " + list.length());
		// list.length();
	}
}