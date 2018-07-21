package com.jwebmp.plugins.angularautoexpand;

import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.base.angular.directives.AngularDirectiveBase;

/**
 * The Angular Auto Expand Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularAutoExpandDirective
		extends AngularDirectiveBase
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAutoExpandDirective
	 */
	public AngularAutoExpandDirective()
	{
		super("AngularAutoExpand");
	}

	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularAutoExpandDirective.class, "autoExpand", "autoExpand.min.js")
		                    .toString();
	}
}
