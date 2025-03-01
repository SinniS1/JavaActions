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
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import entitycachemodule.helpers.CacheHolder;

/**
 * Add or replaces the entity in the cache
 */
public class JA_ReplaceEntityInCache extends CustomJavaAction<java.lang.Void>
{
	private final IMendixObject EntityToCache;

	public JA_ReplaceEntityInCache(
		IContext context,
		IMendixObject _entityToCache
	)
	{
		super(context);
		this.EntityToCache = _entityToCache;
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		// BEGIN USER CODE
		if (EntityToCache == null) throw new IllegalArgumentException("EntityToCache is empty");
		CacheHolder.setObject(EntityToCache.getType(), EntityToCache);
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_ReplaceEntityInCache";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
