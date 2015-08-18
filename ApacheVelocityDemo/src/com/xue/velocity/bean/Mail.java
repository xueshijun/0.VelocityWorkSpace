/**
 * 
 */
package com.xue.velocity.bean;

/**
 * 邮件
 * 
 * @author hongten<br>
 * @date 2013-3-9
 */
public class Mail {

	private Integer id;
	private String senderName;
	private String senderMail;
	private String senderWebSite;
	private String receiverName;
	private String receiverMail;
	private String content;
	private String date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderMail() {
		return senderMail;
	}

	public void setSenderMail(String senderMail) {
		this.senderMail = senderMail;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverMail() {
		return receiverMail;
	}

	public void setReceiverMail(String receiverMail) {
		this.receiverMail = receiverMail;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSenderWebSite() {
		return senderWebSite;
	}

	public void setSenderWebSite(String senderWebSite) {
		this.senderWebSite = senderWebSite;
	}

}
