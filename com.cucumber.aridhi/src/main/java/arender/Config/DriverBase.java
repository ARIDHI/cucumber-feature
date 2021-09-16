/**
 * 
 */
package arender.Config;

/**
 * @author ARIDHIHichem
 *
 */
public class DriverBase extends DriverConfig {

	
	
	public static void initialization() throws Exception  {
		

	    String serverName = prop.getProperty("server");
	  
	    if(serverName.equals("jenkins")) {
	    	DriverConfig.remoteDriver();
	    	DriverConfig.setRemoteURL();
		}	 
	    
	    else if(serverName.equals("local")) {
	    	DriverConfig.localDriver();
	    	DriverConfig.setLocalURL();
	    }
	    else {
	    	System.err.println("No server is defined on prop file !");
	    }
	}
}
