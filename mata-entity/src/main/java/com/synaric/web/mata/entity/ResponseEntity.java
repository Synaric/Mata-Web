package com.synaric.web.mata.entity;

/**
 * 所有的请求都以这个形式返回。
 * Created by Synaric on 2016年8月17日.
 */
public class ResponseEntity {

	/**
	 * 是否正常返回。
	 */
	private boolean result;
	
	/**
	 * 返回结果描述。
	 */
	private String message;
	
	/**
	 * 返回结果实体。
	 */
	private Object entity;
	
	public ResponseEntity(boolean result, String message, Object entity) {
		this.result = result;
		this.message = message;
		this.entity = entity;
	}

	/**
	 * 返回处理成功。
	 * @param entity 返回实体。
	 * @return
	 */
	public static ResponseEntity fromSuccess(Object entity){
		return new ResponseEntity(true, "成功", entity);
	}
	
	/**
	 * 返回处理失败。
	 * @param entity 返回实体。
	 * @return
	 */
	public static ResponseEntity fromFailed(Object entity){
		return new ResponseEntity(false, "失败", entity);
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}
}
