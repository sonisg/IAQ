public boolean hasCycle(ListNode head) {
        HashSet<ListNode> h = new HashSet<>();
        while(head!=null){
            if(h.contains(head)){
                return true;
            }
            h.add(head);
            head = head.next;
        }
        return false;   
    }


Algo:
create hashset, add the values and check if value still exits then it has loop.
