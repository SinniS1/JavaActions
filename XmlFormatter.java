package hotelservices.actions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;


public class XmlFormatter {
    public static String formatXml(String xmlString) {
        // Parse the XML string using Jsoup
        Document document = Jsoup.parse(xmlString, "", org.jsoup.parser.Parser.xmlParser());

//        // Set the output settings to format the XML nicely
//        document.outputSettings().prettyPrint(true);
//        document.outputSettings().indentAmount(2);
//        document.outputSettings().escapeMode(Entities.EscapeMode.xhtml);
//
//        // Get the root element and its descendants
//        Element rootElement = document.root();
//        cleanElement(rootElement);
//
//        // Return the formatted XML as a string
//        return document.outerHtml();
        String cleanedXml = xmlString.replaceAll("[\\s\\p{Z}]", " ");

        // Trim leading and trailing whitespaces
        String trimmedXml = cleanedXml.trim();
        return trimmedXml;
    }

    private static void cleanElement(Element element) {
        // Remove unnecessary attributes or modify as needed
        // Add additional cleaning logic if necessary

        // Clean attributes
        element.attributes().forEach(attribute -> {
            if (attribute.getKey().equals("xmlns")) {
                element.removeAttr(attribute.getKey());
            }
        });

        // Recursively clean child elements
        element.children().forEach(XmlFormatter::cleanElement);
    }
}
