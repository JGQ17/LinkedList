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
	}
}