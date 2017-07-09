package za.co.mmagon.jwebswing.plugins.angularautoexpand;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

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
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularAutoExpand.jar/download"
)
@ComponentInformation(name = "Angular Auto Expand",
        description = "Auto Expands Components with Angular",
        url = "https://www.akveo.com/products.html")
public class AngularAutoExpandPageConfigurator extends PageConfigurator
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
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            AngularPageConfigurator.setRequired(page.getBody(), true);
            page.getAngular().getAngularDirectives().add(new AngularAutoExpandDirective());
        }
        return page;
    }
}
