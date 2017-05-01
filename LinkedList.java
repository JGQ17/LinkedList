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
	}
	
	//pushFront(): adds a node at the front
	public void pushFront(int val) {
		Node start = new Node(val);
		start.next = head;
		head = start;
	}

	//pop(): removes a node at the front
	public int pop() {
		int val = head.data;
		head = head.next;
		return val;
	}

	//popBack(): remves a node a t the end
	public int popBack() {
		Node storage = head;
		while (storage.next.next != null) {
			storage = storage.next;
		}
		int val = storage.next.data;
		storage.next = null;
		return val;
	}

	//remove(): removes a node
	public boolean remove(int x) {
		Node storage = head;
		boolean match = false;
		if(x == head.data) {
			head = head.next;
			match = true;
			storage = head;
		}

		while (storage.next != null) {
			if(x == storage.next.data) {
				storage.next = storage.next.next;
				match = true;
				continue;
			} 
			storage = storage.next;
		}
		return match;
	}

	//find(): finds a node
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

	//length(): shows the length of the list of nodes
	public int length() {
		int counter = 0;
		for(Node storage = head; storage != null; counter++) {
			storage = storage.next;
		}
		return counter;
	}

	//showList(): displays the nodes' values
	public void showList() {
		Node storage = head;
		while (storage.next != null) {
			System.out.print(storage.data + " ");
			storage = storage.next;
		}
		System.out.println(storage.data);
	}
}