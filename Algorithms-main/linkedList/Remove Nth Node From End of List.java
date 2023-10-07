 public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ref = dummy;
        ListNode main = dummy;
        for(int i =0; i< n + 1; i++){
            ref = ref.next;
        }
        while(ref!=null){
            ref = ref.next;
            main = main.next;
        }

        main.next = main.next.next;

         return dummy.next;
    }
