package com.example;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS) 
public class User 
{
	private Date date;
	
	Logger log = Logger.getLogger(this.getClass());

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [date=" + date + "]";
	}

	public User() {
		super();
		log.info("-- User Created--");
	}

	
	
	
	
}
