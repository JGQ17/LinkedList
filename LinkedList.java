class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	public void push(int val) {
		if (head == null) {
			Node node1 = new Node(val);
			head = node1;
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
}