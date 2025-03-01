// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package hotel_expedia.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import hotel_expedia.helpers.ParseDynamicJSON_RoomDetails;

public class JA_ParseDynamicToStaticJSON_RoomDetails extends CustomJavaAction<java.lang.String>
{
	private final java.lang.String DynamicJSON;

	public JA_ParseDynamicToStaticJSON_RoomDetails(
		IContext context,
		java.lang.String _dynamicJSON
	)
	{
		super(context);
		this.DynamicJSON = _dynamicJSON;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return new ParseDynamicJSON_RoomDetails(DynamicJSON).parseJson();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_ParseDynamicToStaticJSON_RoomDetails";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
