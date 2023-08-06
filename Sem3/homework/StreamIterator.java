import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Stream> {
    private List<Stream> streamLists;
    private int counter;

    public StreamIterator(StreamList streams) {
    }

    public void StreamIterator(StreamList streamIterator){
        this.streamLists = streamIterator.getStreamList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < streamLists.size();
    }

    @Override
    public Stream next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return streamLists.get(counter);
    }

    @Override
    public void remove() {
        streamLists.remove(counter);
    }
}
