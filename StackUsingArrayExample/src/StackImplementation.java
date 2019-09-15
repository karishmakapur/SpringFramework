public class StackImplementation<E> implements StackInterface<E>{
        private E[] elements; //stack --> array stack
        private int size;
        private static final int INITIAL_CAPACITY = 100;
        public StackImplementation(){
            elements = (E[]) new Object[INITIAL_CAPACITY];
        }
        public StackImplementation(int capacity)
        {
            elements = (E[]) new Object[capacity];

        }
        public boolean isEmpty()
        {
            return (size == 0);
        }
        public E peek()
        {
            if (size == 0)
            {
                throw new java.util.EmptyStackException();
            }
            return elements [size -1]; //top of stack
        }
        public E pop()
        {
            if(size == 0)
            {
                throw new java.util.EmptyStackException();
            }
            E element = elements[--size];
            elements[size] = null;
            return element;
        }
        public void push(E element)
        {
            if(size == elements.length)
            {
                resize();
            }
            elements[size++] = element;
        }
        public int size()
        {
            return size;
        }
        private void resize()
        {
            assert size == elements.length;
            Object[] a = new Object[2*size];
            System.arraycopy(elements, 0, a, 0, size);
            elements = (E[])a;
        }
}