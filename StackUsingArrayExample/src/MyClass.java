// STACK 
import java.util.*;


public class MyClass {
    public static void main(String args[]) {
      StackImplementation<Integer> stack = new StackImplementation<Integer>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      do
      {
          System.out.println(stack.peek());
          stack.pop();
      }while(!stack.isEmpty());
      
    }
}
