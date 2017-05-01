class Main {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.push(9);
		System.out.println(list.head.data);
		list.push(10);
		System.out.println(list.head.next.data);
		list.push(11);
		System.out.println(list.head.next.next.data);
		list.push(12);
		System.out.println(list.head.next.next.next.data);
		list.pushFront(8);
		System.out.println(list.head.data);
		System.out.println(list.head.next.data);
		System.out.println(list.head.next.next.data);
		System.out.println(list.head.next.next.next.data);
		System.out.println(list.head.next.next.next.next.data);

	
		System.out.println(list.find(13));
		System.out.println(list.head.data);
		System.out.println(list.head.next.data);
		System.out.println(list.head.next.next.data);
		System.out.println(list.head.next.next.next.data);
	
		System.out.println(list.length());
		
	}
}