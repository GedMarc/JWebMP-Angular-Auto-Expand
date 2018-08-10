import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.plugins.angularautoexpand.AngularAutoExpandDirective;

module com.jwebmp.plugins.angularautoexpand {
	exports com.jwebmp.plugins.angularautoexpand;

	requires com.jwebmp.core;
	requires java.validation;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularautoexpand.AngularAutoExpandPageConfigurator;
	provides IAngularDirective with AngularAutoExpandDirective;

}
