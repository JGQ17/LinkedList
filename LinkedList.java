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

	//popBack(): removes a node at the end
	public int popBack() {
		Node storage = head;
		while (storage.next.next != null) {
			storage = storage.next;
		}
		int val = storage.next.data;
		storage.next = null;
		return val;
	}

	//remove(): removes all nodes with data value = x
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

	//find(): finds a node with data value = val
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

	/*
	This is a pretty complicated method.
	Try to go through this again in the future once you've forgotten 
	until you can understand it again.
	*/
	//delDupl(): deletes duplicate values from linked list
	public void delDupl() {
		Node storage1 = head;
		while (storage1 != null && storage1.next != null) {
			showList();
			Node storage2 = storage1;
			while (storage2.next != null) {
				showList();
				if (storage1.data == storage2.next.data) {
					if (storage2.next.next != null) {
						storage2.next = storage2.next.next;
						continue;
					}
					else {
						storage2.next = null;
						continue;
					}
				}
				storage2 = storage2.next;
			}
			storage1 = storage1.next;
		}
	}
}