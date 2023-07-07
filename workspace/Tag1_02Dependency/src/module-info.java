import de.msg.dependencies.Dependency;
import de.msg.dependencies.internal.DependencyImpl;
import de.msg.dependencies.internal.DependencyOtherImpl;

module tag1_02Dependency {
	exports de.msg.dependencies; // Paket
	uses Dependency;
	provides Dependency with DependencyImpl, DependencyOtherImpl;
}