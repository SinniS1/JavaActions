// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package hotelservices.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

public class JA_XMLFormatter extends CustomJavaAction<java.lang.String>
{
	private final java.lang.String xmlInput;

	public JA_XMLFormatter(
		IContext context,
		java.lang.String _xmlInput
	)
	{
		super(context);
		this.xmlInput = _xmlInput;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		 try {
	            return formatXml(xmlInput);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_XMLFormatter";
	}

	// BEGIN EXTRA CODE
       public static String formatXml(String xmlInput) throws Exception {
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	        StringReader xmlReader = new StringReader(xmlInput);
	        StringWriter formattedXmlWriter = new StringWriter();
	        transformer.transform(new StreamSource(xmlReader), new StreamResult(formattedXmlWriter));
	        String formattedXml = formattedXmlWriter.toString();
	        return formattedXml;
	    }
	    
	// END EXTRA CODE
}
