import iterator.Iterator;
import model.TV;

public class IteratorExample {
    public static void main(String[] args) {
        String[] channels = {"HBO", "CNN", "BBC", "2+2"};
        TV tv = new TV(channels);
        Iterator iterator = tv.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }
}
