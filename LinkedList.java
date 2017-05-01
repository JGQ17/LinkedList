class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}
	//push(): adds a node at the end
	public void push(int val) {
		if (head == null) {
			head = new Node(val);
		}
		else if (head != null) {
			Node storage = head;
			while (storage.next != null) {
				storage = storage.next;
			}
			storage.next = new Node(val);
		}
		/*
		Our condition is that if the last node in the list has a reference to null
		then we will create a new node and set the reference in the last object in
		the list to the new node we just created
		*/
	}
	
	//pushFront(): ads a node at the front
	public void pushFront(int val) {
		Node start = new Node(val);
		start.next = head;
		head = start;
	}

	public int pop() {
		int val = head.data;
		head = head.next;
		return val;
	}
}