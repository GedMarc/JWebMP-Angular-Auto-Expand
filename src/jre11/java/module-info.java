module com.jwebmp.plugins.angularautoexpand {
	exports com.jwebmp.plugins.angularautoexpand;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularautoexpand.AngularAutoExpandPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularautoexpand.AngularAutoExpandDirective;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularautoexpand.implementations.AngularAutoExpandExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularautoexpand.implementations.AngularAutoExpandExclusionsModule;

}
