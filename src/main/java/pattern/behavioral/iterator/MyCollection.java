package pattern.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class MyCollection implements Iterable<String>{
    private String[] data = {"a", "b", "c"};

    public Iterator<String> iterator(){
        return Arrays.asList(data).iterator();
    }
}
