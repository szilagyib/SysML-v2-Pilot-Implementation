/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Binding
 * Connector</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class BindingConnectorImpl extends ConnectorImpl implements BindingConnector {

	public static final String BINDING_CONNECTOR_SUBSETTING_DEFAULT = "Objects::selfLinks";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BINDING_CONNECTOR;
	}

	@Override
	public EList<Feature> getRelatedFeature() {
		EList<Feature> relatedFeatures = super.getRelatedFeature();
		if (relatedFeatures.isEmpty()) {
			Type owner = getOwningType();
			if (owner instanceof InvocationExpressionImpl) {
				int i = argIndex(owner);
				if (i >= 0) {
					for (int j = 0; j < 2; j++) {
						Feature feature = getRelatedFeature((InvocationExpressionImpl)owner, i, j);
						setRelatedFeature(j, feature);
						relatedFeatures.add(feature);
					}
				}
			}
		}
		return relatedFeatures;
	}
	
	public Feature getRelatedFeatureFor(Feature end) {
		Type owner = getOwningType();
		return owner instanceof InvocationExpressionImpl?
			getRelatedFeature((InvocationExpressionImpl)owner, argIndex(owner), getConnectorEnd().indexOf(end)):
			null;
	}
	
	protected Feature getRelatedFeature(InvocationExpressionImpl expression, int argIndex, int endIndex) {
		if (endIndex == 0) {
			List<? extends Feature> arguments = expression.getArguments();
			if (argIndex < arguments.size()) {
				Feature argument = arguments.get(argIndex);
				Feature feature = argument instanceof Expression ? ((ExpressionImpl) argument).getResult()
						: argument;
				return feature;
			}
		} else if (endIndex == 1) {
			EList<Feature> inputs = expression.getInput();
			if (argIndex < inputs.size()) {
				return inputs.get(argIndex);
			}
		}
		return null;
	}
	
	protected int argIndex(Type expression) {
		return expression.getOwnedFeature().stream().filter(f -> f instanceof BindingConnector)
				.collect(Collectors.toList()).indexOf(this);
	}
	
	@Override
	public void transform() {
		super.transform();
		getRelatedFeature();
	}

	@Override
	protected String getDefaultSupertype() {
		return BINDING_CONNECTOR_SUBSETTING_DEFAULT;
	}
	
} // BindingConnectorImpl
