// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package javaactions.actions;

import java.util.ArrayList;
import java.util.List;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import javaactions.proxies.A;

public class Create_A_Obj_ByRecurstion extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private final java.lang.Long Num_of_Objects;

	public Create_A_Obj_ByRecurstion(
		IContext context,
		java.lang.Long _num_of_Objects
	)
	{
		super(context);
		this.Num_of_Objects = _num_of_Objects;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		List<IMendixObject> ObjectsList = new ArrayList<IMendixObject>();
		ObjectsList =  createObjects(getFactorialValue(Num_of_Objects), ObjectsList, getContext());
		Core.commit(getContext(), ObjectsList);
		return ObjectsList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "Create_A_Obj_ByRecurstion";
	}

	// BEGIN EXTRA CODE
	public long getFactorialValue (long num) {
		if (num <= 1) {
			return num;
		}else {
			return num * getFactorialValue(num - 1);
		}
	}
	
	private List<IMendixObject> createObjects (long Num, List<IMendixObject> objList, IContext context){
		for(int i = 1; i <= Num; i++) {
			IMendixObject mendixObj = Core.instantiate(context, A.entityName);
			A newAObj = A.initialize(context, mendixObj);
			newAObj.setS_Num((long) i);
			objList.add(mendixObj);
		}
		return objList;
	}
	// END EXTRA CODE
}
