import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamService {

    private StreamList streamList;

    public List<Stream> getSortedListStream(StreamList streamList){
        List<Stream> sortedListStream = new ArrayList<>(streamList.getStreamList());
        Collections.sort(sortedListStream);
        return sortedListStream;
    }
}
