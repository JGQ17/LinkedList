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

	public int popBack() {
		Node storage = head;
		while (storage.next.next != null) {
			storage = storage.next;
		}
		int val = storage.next.data;
		storage.next = null;
		return val;
	}

	public boolean remove(int x) {
		Node storage = head;
		boolean match = false;
		if(x == head.data) {
			head = head.next;
			match = true;
		}
		while (storage.next != null) {
			if(x == storage.next.data) {
				storage.next = storage.next.next;
				match = true;
			} 
			storage = storage.next;
		}
		return match;
	}

	public boolean find(int val) {
		Node storage = head;
		boolean match = false;
		while (storage.next != null) {
			if(val == storage.data) {
				match = true;
			} 
			storage = storage.next;
		}
		return match;
	}

	public int length() {
		int counter = 0;
		for(Node storage = head; storage != null; counter++) {
			storage = storage.next;
		}
		return counter;
	}

	// public void showList() {
	// 	Node storage = head;
	// 	while (storage.next != null) {
	// 		System.out.println(storage.data);
	// 		storage = storage.next;
	// 	}
	// 	System.out.println(storage.data);
	// }
}