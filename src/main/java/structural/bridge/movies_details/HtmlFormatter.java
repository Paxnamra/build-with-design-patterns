package structural.bridge.movies_details;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("\n<th>");
        builder.append("Classification");
        builder.append("</th>");
        builder.append("\n<th>");
        builder.append(header);
        builder.append("</th>");

        for (Detail detail : details) {
            builder.append("\n<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</td>\n<td>");
            builder.append(detail.getValue());
            builder.append("</td></tr>");
        }

        builder.append("\n</table>");
        return builder.toString();
    }
}
