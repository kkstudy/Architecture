
/**
 * Project Name : Architecture
 * File Name    : ResourceUtil.java
 * Package Name : net.yuanmomo.resource
 * Created on   : 2014-1-24下午3:41:31
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.resource;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ClassName : ResourceUtil 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-24 下午3:41:31 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class ResourceUtil {
	private static ResourceBundle defaultBundle = null;
	static{
		defaultBundle = ResourceBundle.getBundle("resource.exceptionMap", Locale.getDefault()); 
	}
	
	public static String getString(String code){
		if(code == null || "".equals(code.trim())){
			return "";
		}
		return defaultBundle.getString(code);
	}
}
