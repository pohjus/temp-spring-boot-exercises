package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HtmlHelperImpl implements HtmlHelper {

    @Override
    public String toHtmlTable(String[][] data) {
        String htmlTable = "<table>\n";

        for(int i=0; i<data.length; i++) {
            htmlTable += "<tr>\n";
            for(int j=0; j<data[0].length; j++) {
                htmlTable += "<td>" + data[i][j] + "</td>";
            }
            htmlTable += "\n</tr>\n";

        }

        htmlTable += "</table>";
        return htmlTable;
    }
}
