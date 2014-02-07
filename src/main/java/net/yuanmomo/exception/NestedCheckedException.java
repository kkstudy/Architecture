/**
 * Project Name : Architecture
 * File Name    : NestedException.java
 * Package Name : net.yuanmomo.exception
 * Created on   : 2014-2-7下午6:27:17
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * ClassName : NestedException Function : TODO ADD FUNCTION. Reason : TODO ADD
 * REASON. Date : 2014-2-7 下午6:27:17
 * 
 * @author : Hongbin Yuan
 * @version
 * @since JDK 1.6
 * @see
 */
public class NestedCheckedException extends Exception {
	/**
	 * serialVersionUID:.
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 2878318230420497799L;
	
	private Throwable cause;
	
	public NestedCheckedException(String msg) {
		super(msg);
	}
	
	public NestedCheckedException(String msg, Throwable ex) {
		super(msg);
		this.cause = ex;
	}
	
	public Throwable getCause() {
		return (this.cause == null ? this : this.cause);
	}
	
	public String getMessage() {
		String message = super.getMessage();
		Throwable cause = getCause();
		if (cause != null) {
			message = message + ";nested Exception is " + cause;
		}
		return message;
	}
	
	public void printStackTrace(PrintStream ps) {
		if (getCause() == null) {
			super.printStackTrace(ps);
		} else {
			ps.println(this);
			getCause().printStackTrace(ps);
		}
	}
	
	public void printStackTrace(PrintWriter pw) {
		if (getCause() == null) {
			super.printStackTrace(pw);
		} else {
			pw.println(this);
			getCause().printStackTrace(pw);
		}
	}
	
	public void printStackTrace() {
		printStackTrace(System.err);
	}
}
