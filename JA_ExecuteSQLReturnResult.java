// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package dbmaintenance.actions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * FlowFabric B.V.
 */
public class JA_ExecuteSQLReturnResult extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private final java.lang.String sql;
	private final java.lang.String resultTable;

	public JA_ExecuteSQLReturnResult(
		IContext context,
		java.lang.String _sql,
		java.lang.String _resultTable
	)
	{
		super(context);
		this.sql = _sql;
		this.resultTable = _resultTable;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		logger.debug("executeAction: " + this.sql);
		
		String kw_insert = "insert";
		String kw_update = "update";
		String kw_delete = "delete";
		String sql_lc = this.sql.toLowerCase();
		if(sql_lc.indexOf(kw_insert) != -1 ||sql_lc.indexOf(kw_update) != -1 || sql_lc.indexOf(kw_delete) != -1){
			throw new RuntimeException("Please do not try to insert, update or delete data with this method");
		}
		
        List<IMendixObject> resultList = null;
        List<IMendixObject> result = new ArrayList<IMendixObject>();

        resultList = (List<IMendixObject>) Core.dataStorage().executeWithConnection(connection ->
        {
            
            try {
                PreparedStatement stmt = connection.prepareStatement(this.sql);
                ResultSet rset = stmt.executeQuery();
                ResultSetMetaData rmd = rset.getMetaData();
                int colCount = rmd.getColumnCount();
                while(rset.next()){
                    IMendixObject obj = Core.instantiate(getContext(),this.resultTable);
                    result.add(obj);
                    for(int colIdx=1; colIdx <= colCount ; colIdx++){
                        String colName = rmd.getColumnName(colIdx);
                        obj.setValue(getContext(),colName,rset.getObject(colIdx));
                    }
                    logger.debug(String.format("Created object %s", obj));
                }
                
            } catch (SQLException e) {
                logger.error("Failed to execute sql statement: " + e.getMessage());
                throw new RuntimeException(e);
            }
            return result;
        });
      
        return resultList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_ExecuteSQLReturnResult";
	}

	// BEGIN EXTRA CODE
	private final ILogNode logger = Core.getLogger(this.getClass().getName());
	// END EXTRA CODE
}
