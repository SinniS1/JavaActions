// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package hotelnativemobile.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.core.Core;
import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;

public class isMendixObjectExpired extends CustomJavaAction<java.lang.Boolean>
{
	private final java.util.Date ObjectCreatedDate;

	public isMendixObjectExpired(
		IContext context,
		java.util.Date _objectCreatedDate
	)
	{
		super(context);
		this.ObjectCreatedDate = _objectCreatedDate;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE

        // Create a logger instance
        var logger = Core.getLogger("MendixObjectExpiration");

        // Define 13 minutes in milliseconds
        final long THIRTEEN_MINUTES = 13 * 60 * 1000;

        if (ObjectCreatedDate == null) {
            logger.warn("ObjectCreatedDate is NULL. Returning false.");
            return false; // If date is null, assume object is expired
        }

        // Get current time in UTC
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        Date nowUTC = calendar.getTime();

        // Calculate the time for 13 minutes ago in UTC
        Date thirteenMinutesAgoUTC = new Date(nowUTC.getTime() - THIRTEEN_MINUTES);

        // Log the calculated values
        logger.info("Current UTC Time: " + nowUTC);
        logger.info("13 Minutes Ago UTC: " + thirteenMinutesAgoUTC);
        logger.info("Object Created UTC: " + ObjectCreatedDate);

        // Return true if ObjectCreatedDate is within the last 13 minutes
        boolean isNotExpired = ObjectCreatedDate.after(thirteenMinutesAgoUTC);
        logger.info("Is Object NOT Expired? " + isNotExpired);

        return isNotExpired;

		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "isMendixObjectExpired";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
