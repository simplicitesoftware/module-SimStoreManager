package com.simplicite.extobjects.SimStoreManager;

import java.util.*;

import org.json.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * REST service external object StmApi
 */
public class StmApi extends com.simplicite.webapp.services.RESTServiceExternalObject {
	private static final long serialVersionUID = 1L;

	@Override
	public Object get(Parameters params) throws HTTPException {
		return getStore();
	}

	@Override
	public Object post(Parameters params) throws HTTPException {
		return super.post(params);
	}
	
	private JSONObject getStore(){
		JSONObject sto = new JSONObject();
		JSONArray apps = new JSONArray();
		Grant g = Grant.getSystemAdmin();
		try{
			ObjectDB app = g.getTmpObject("StmApplication");
			synchronized(app.getLock()){
				for(String[] row : app.getTool().search()){
					app.setValues(row);
					JSONObject o = new JSONObject();
					o.put("name", app.getFieldValue("stmAppTitle"));
					o.put("url", app.getFieldValue("stmAppUrl"));
					o.put("settings_by_platform", new JSONObject(app.getFieldValue("stmAppSettings")));
					o.put("logo", app.getFieldValue("stmAppLogo"));
					o.put("module_name", app.getFieldValue("stmAppModuleName"));
					o.put("description", app.getFieldValue("stmAppDescription"));
					apps.put(o);
				}
			}
			sto.put("name", "My Store");
			sto.put("apps", apps);
			return sto;
		
		}
		catch(SearchException e){
			AppLog.error(e, g);
			return null;
		}
	}
}
