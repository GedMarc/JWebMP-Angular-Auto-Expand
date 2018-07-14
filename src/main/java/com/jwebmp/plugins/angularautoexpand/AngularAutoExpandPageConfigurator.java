/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularautoexpand;

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.PluginInformation;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;

/**
 * Allows for elements to have an auto expand by adding a class
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Auto Expand",
		pluginDescription = "Auto Expands Components with Angular",
		pluginUniqueName = "jwebswing-angular-auto-expand",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,auto expand,ui,web ui, framework",
		pluginSubtitle = "Auto Expands Components with Angular",
		pluginSourceUrl = "https://www.akveo.com/products.html",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Auto-Expand/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Auto-Expand",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://www.akveo.com/products.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularAutoExpand.jar/download")
@ComponentInformation(name = "Angular Auto Expand",
		description = "Auto Expands Components with Angular",
		url = "https://www.akveo.com/products.html")
public class AngularAutoExpandPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAutoExpandPageConfigurator
	 */
	public AngularAutoExpandPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
		}
		return page;
	}
}
