package structural.bridge.movies_details;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);
}
