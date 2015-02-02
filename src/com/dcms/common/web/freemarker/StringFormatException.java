package com.dcms.common.web.freemarker;

import freemarker.template.TemplateModelException;

/**
 * 非数字参数异常
 */
@SuppressWarnings("serial")
public class StringFormatException extends TemplateModelException {
	public StringFormatException(String paramName) {
		super("The \"" + paramName + "\" format error,please check.");
	}
}
