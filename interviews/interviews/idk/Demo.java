class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Demo {
    public static void main(String[] args){  
		ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,null)))))))));
		ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,null))));
		ListNode returnListNode = new ListNode();
		ListNode tempListNode = new ListNode((l1.val + l2.val)%10);
		returnListNode = tempListNode;
		int carry = (l1.val + l2.val)/10;
		System.out.println(l1.val);
		System.out.println(l2.val);
		System.out.println(tempListNode.val);
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null && l2 != null && l1.next != null && l2.next != null){
			if (l1.next == null || l1 != null) {
				l1.val = 0;
			}
			if (l2.next == null || l2 != null) {
				l2.val = 0;
			}
			ListNode newListNode = new ListNode((l1.val + l2.val + carry)%10);
			carry = (l1.val + l2.val + carry)/10;
            tempListNode.next = newListNode;
			// if (newListNode.val == 0) {
			// 	tempListNode.next = new ListNode(0);
			// }
			tempListNode = tempListNode.next;
			System.out.println(l1.val);
			System.out.println(l2.val);
			System.out.println(tempListNode.val);
			System.out.println("hoho");
			l1 = l1.next;
			l2 = l2.next;
			
        }
        if(l1 != null && l2 != null){
            ListNode newListNode = new ListNode((l1.val + l2.val + carry)%10);
            tempListNode.next = newListNode;
            System.out.println(l1.val);
            System.out.println(l2.val);
            System.out.println(tempListNode.val);
            carry = (l1.val + l2.val + carry)/10;
            if (carry != 0) {
                ListNode newListNode1 = new ListNode(carry);
                tempListNode.next = newListNode1;
            }
        }
    }
}

    