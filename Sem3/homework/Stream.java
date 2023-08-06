import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream implements Comparable<Stream> {
    private List<Group> stream;

    public Stream(){
        this.stream = new ArrayList<Group>();
    }

    public List<Group> getStream() {
        return stream;
    }

    public void setStream(List<Group> stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "stream=" + stream +
                '}';
    }


    @Override
    public int compareTo(Stream o) {
        return Integer.compare(this.stream.size(), o.getStream().size());
    }
}
