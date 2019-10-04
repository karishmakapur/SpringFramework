public class FindMid {
 
 
    public static void main(String args[]) {
            //creating LinkedList with 5 elements including head
          LinkedList linkedList = new LinkedList();
          LinkedList.Node head = linkedList.head();
          linkedList.add( new LinkedList.Node("1"));
          linkedList.add( new LinkedList.Node("2"));
          linkedList.add( new LinkedList.Node("3"));
          linkedList.add( new LinkedList.Node("4"));
          linkedList.add(new LinkedList.Node("5"));
          linkedList.add(new LinkedList.Node("6"));
          linkedList.add(new LinkedList.Node("7"));
          linkedList.add(new LinkedList.Node("8"));
          linkedList.add(new LinkedList.Node("9"));
          linkedList.add(new LinkedList.Node("10"));
       
          //finding middle element of LinkedList in single pass
          LinkedList.Node current = head;
          int length = 0;
          LinkedList.Node middle = head;
       
          while(current.next() != null){
              length++;
              if(length%2 == 0){
                  middle = middle.next();
              }
              current = current.next();
          }
        
          if(length%2 != 0){
              middle = middle.next();
          }

          System.out.println("length of LinkedList: " + length);
          System.out.println("middle element of LinkedList : " + middle);
         
        }
}
