/**
 * Created by ERKIN on 28/07/2014.
 */
public class Subset {

    public static void main(String[] args){
        int k = Integer.valueOf(args[0]);

        int lengthOfArgs = args.length;

        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<String>();
        while ( !StdIn.isEmpty() ){
            randomizedQueue.enqueue(StdIn.readString());
        }


        for ( int i = 0; i < k; i++ ){
            StdOut.println(randomizedQueue.dequeue());
        }

    }
}
