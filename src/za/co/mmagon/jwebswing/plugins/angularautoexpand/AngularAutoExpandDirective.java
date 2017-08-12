package za.co.mmagon.jwebswing.plugins.angularautoexpand;

import za.co.mmagon.FileTemplates;
import za.co.mmagon.jwebswing.base.angular.directives.AngularDirectiveBase;

/**
 * The Angular Auto Expand Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
class AngularAutoExpandDirective extends AngularDirectiveBase
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
		return FileTemplates.getFileTemplate(AngularAutoExpandDirective.class, "autoExpand.min").toString();
	}
}
