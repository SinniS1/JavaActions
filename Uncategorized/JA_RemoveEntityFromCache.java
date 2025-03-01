// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package entitycachemodule.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import entitycachemodule.helpers.CacheHolder;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Deletes the entity from the cache
 */
public class JA_RemoveEntityFromCache extends CustomJavaAction<java.lang.Boolean>
{
	private final java.lang.String EntityToRemove;

	public JA_RemoveEntityFromCache(
		IContext context,
		java.lang.String _entityToRemove
	)
	{
		super(context);
		this.EntityToRemove = _entityToRemove;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		if (EntityToRemove == null) throw new IllegalArgumentException("EntityToRemove is empty");
		if( CacheHolder.removeObject(EntityToRemove) != null ) {
			return true;
		}
		else {
			return false;
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
		return "JA_RemoveEntityFromCache";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
