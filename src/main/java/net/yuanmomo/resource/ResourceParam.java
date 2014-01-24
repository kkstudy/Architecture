
/**
 * Project Name : Architecture
 * File Name    : ResourceParam.java
 * Package Name : net.yuanmomo.resource
 * Created on   : 2014-1-24下午4:52:03
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.resource;
/**
 * ClassName : ResourceParam 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-24 下午4:52:03 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class ResourceParam {
	/********************** 默认返回状态及对应的信息 *****************************/
	public static final String STATUS_CODE_SUCCESS="STATUS_CODE_SUCCESS";
	public static final String STATUS_CODE_SUCCESS_MESSAGE="STATUS_CODE_SUCCESS_MESSAGE";
	
	public static final String STATUS_CODE_FAILED="STATUS_CODE_FAILED";
	public static final String STATUS_CODE_FAILED_MESSAGE="STATUS_CODE_FAILED_MESSAGE";
	
	public static final String STATUS_CODE_OPTION_UNAUTHORIZED="STATUS_CODE_OPTION_UNAUTHORIZED";
	public static final String STATUS_CODE_OPTION_UNAUTHORIZED_MESSAGE="STATUS_CODE_OPTION_UNAUTHORIZED_MESSAGE";
	
	public static final String STATUS_CODE_TIMEOUT="STATUS_CODE_TIMEOUT";
	public static final String STATUS_CODE_TIMEOUT_MESSAGE="STATUS_CODE_TIMEOUT_MESSAGE";
	
	/********************** 默认异常信息 *****************************/
	public static final String SERVER_ERROR="SERVER_ERROR";
	
	/********************** 业务逻辑描述信息 *****************************/
	public static final String USER_REGISTER_SUCCESS="USER_REGISTER_SUCCESS";
	public static final String USER_REGISTER_FAILED="USER_REGISTER_FAILED";
	
	/********************** DAO层异常对应描述 *****************************/
	public static final String DAO_INSERT_NONE_EXCEPTION="DAO_INSERT_NONE_EXCEPTION";
	
	/********************** Proxy层异常对应描述 *****************************/
	public static final String PROXY_MULTI_OBJECT_FOUND="PROXY_MULTI_OBJECT_FOUND";
	
	/********************** Business层异常对应描述  *****************************/
	public static final String BUSINESS_USER_NAME_EXISTS="BUSINESS_USER_NAME_EXISTS";
	
	/********************** Validattion 对应描述 *****************************/
	public static final String VALIDATION_USER_NULL="STATUS_CODE_TIMEOUT";
	public static final String VALIDATION_USER_NAME_ILLEGAL="VALIDATION_USER_NAME_ILLEGAL";
	public static final String VALIDATION_USER_AGE_ILLEGAL="VALIDATION_USER_AGE_ILLEGAL";
}
