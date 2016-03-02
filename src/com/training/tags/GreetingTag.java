package com.training.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetingTag extends TagSupport {

	private String userName;

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			if (userName != null)

				out.println("<b> Welcome to Custom Tag Programming : </b>" + userName);
			else
				out.println("<i> Welcome to Custom  Programming </i>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Tag.SKIP_BODY;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
