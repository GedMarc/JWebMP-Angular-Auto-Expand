package com.jwebmp.plugins.angularautoexpand;

import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.base.angular.directives.AngularDirectiveBase;
import com.jwebmp.core.base.angular.services.IAngularDirective;

/**
 * The Angular Auto Expand Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularAutoExpandDirective
		extends AngularDirectiveBase
		implements IAngularDirective<AngularAutoExpandDirective>
{


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
