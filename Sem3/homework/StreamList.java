import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamList implements Iterable<Stream> {
    private List<Stream> streamList;

    public StreamList(){

    }

    public List<Stream> getStreamList() {
        return streamList;
    }

    public void setStreamList(List<Stream> streamList) {
        this.streamList = streamList;
    }

    @Override
    public Iterator<Stream> iterator() {
        return new StreamIterator(this);
    }
}