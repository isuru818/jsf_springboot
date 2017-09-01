package org.orgname.modulename.jsf_springBoot.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.orgname.modulename.jsf_springBoot.jsf.FacesViewScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("indexBean")
@Scope(FacesViewScope.NAME)
public class IndexBean implements Serializable {

	private String message="Test Message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
