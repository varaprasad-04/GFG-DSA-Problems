class Solution {
    public static Node detectCycle(Node head){
        Node sp=head;
        Node fp=head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
            
            if(fp==sp){
                Node temp=head;
                while(temp!=sp){
                    temp=temp.next;
                    sp=sp.next;
                }
                return temp;
            }
        }
        return null;
    }
}