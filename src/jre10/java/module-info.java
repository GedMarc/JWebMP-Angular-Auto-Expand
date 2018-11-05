import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularautoexpand.AngularAutoExpandDirective;
import com.jwebmp.plugins.angularautoexpand.implementations.AngularAutoExpandExclusionsModule;

module com.jwebmp.plugins.angularautoexpand {
	exports com.jwebmp.plugins.angularautoexpand;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularautoexpand.AngularAutoExpandPageConfigurator;
	provides IAngularDirective with AngularAutoExpandDirective;

	provides IGuiceScanModuleExclusions with AngularAutoExpandExclusionsModule;
	provides IGuiceScanJarExclusions with AngularAutoExpandExclusionsModule;

}
