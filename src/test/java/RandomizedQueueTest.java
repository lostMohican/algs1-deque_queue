import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.*;

public class RandomizedQueueTest {

    private RandomizedQueue<Integer> randomizedQueue = new RandomizedQueue<Integer>();

    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true, randomizedQueue.isEmpty());

        randomizedQueue.enqueue(5);

        assertEquals(false, randomizedQueue.isEmpty());
    }

    @Test
    public void testSize() throws Exception {

        assertEquals(0, randomizedQueue.size());

        randomizedQueue.enqueue(5);
        randomizedQueue.enqueue(10);
        randomizedQueue.enqueue(15);

        assertEquals(3, randomizedQueue.size());
    }

    @Test
    public void testEnqueue() throws Exception {

        Integer[] array = new Integer[]{5,10,15};

        for ( Integer number: array ){
            randomizedQueue.enqueue(number);
        }

        ArrayList<Integer> queueList = new ArrayList<Integer>();
        for ( Integer deckItem : randomizedQueue ){ //uses the Iterable interface
            queueList.add(deckItem);
        }

        ArrayList<Integer> templIst = new ArrayList<Integer>(Arrays.asList(array));
        for ( Integer item : templIst ){
            assertTrue( queueList.contains(item) );
        }
    }

    @Test
    public void testDequeue() throws Exception {

        Integer[] array = new Integer[]{5,10,15};

        for ( Integer number: array ){
            randomizedQueue.enqueue(number);
        }

        ArrayList<Integer> queueList = new ArrayList<Integer>();
        queueList.add(randomizedQueue.dequeue());
        queueList.add(randomizedQueue.dequeue());
        queueList.add(randomizedQueue.dequeue());

        for( Integer intArray : array ){
            assertTrue(queueList.contains(intArray));
        }

        assertEquals(true, randomizedQueue.isEmpty());
    }

    @Test
    public void testSample() throws Exception {
        Integer[] array = new Integer[]{5,10,15};

        for ( Integer number: array ){
            randomizedQueue.enqueue(number);
        }

        ArrayList<Integer> queueList = new ArrayList<Integer>();
        queueList.add(randomizedQueue.sample());
        queueList.add(randomizedQueue.sample());
        queueList.add(randomizedQueue.sample());

        ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(array));
        for ( Integer queueInt : queueList ){
            assertTrue(temp.contains(queueInt));
        }

        assertEquals(false, randomizedQueue.isEmpty());
        assertEquals(3, randomizedQueue.size());
    }

    @Test
    public void testIterator() throws Exception {

        Integer[] array = new Integer[]{5,10,15};

        for ( Integer number: array ){
            randomizedQueue.enqueue(number);
        }

        Iterator<Integer> iter1 = randomizedQueue.iterator();
        Iterator<Integer> iter2 = randomizedQueue.iterator();

        while( iter1.hasNext() ){
            Integer item = iter1.next();
            StdOut.println("iter1: " + item);
        }

        while( iter2.hasNext() ){
            Integer item = iter2.next();
            StdOut.println("iter2: " + item);
        }

    }

    @Test
    public void testMain() throws Exception {

    }
}