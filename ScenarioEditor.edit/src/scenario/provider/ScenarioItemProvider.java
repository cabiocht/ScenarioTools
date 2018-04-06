/**
 */
package scenario.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import scenario.Scenario;
import scenario.ScenarioFactory;
import scenario.ScenarioPackage;

/**
 * This is the item provider adapter for a {@link scenario.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAimedDurationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Aimed Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAimedDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_aimedDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_aimedDuration_feature", "_UI_Scenario_type"),
				 ScenarioPackage.Literals.SCENARIO__AIMED_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ScenarioPackage.Literals.SCENARIO__OUTCOMES);
			childrenFeatures.add(ScenarioPackage.Literals.SCENARIO__STATES);
			childrenFeatures.add(ScenarioPackage.Literals.SCENARIO__CHOICES);
			childrenFeatures.add(ScenarioPackage.Literals.SCENARIO__EVENTS_ACTIONS);
			childrenFeatures.add(ScenarioPackage.Literals.SCENARIO__IMPORTANT_GAME_STATES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Scenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Scenario scenario = (Scenario)object;
		return getString("_UI_Scenario_type") + " " + scenario.getAimedDuration();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Scenario.class)) {
			case ScenarioPackage.SCENARIO__AIMED_DURATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScenarioPackage.SCENARIO__OUTCOMES:
			case ScenarioPackage.SCENARIO__STATES:
			case ScenarioPackage.SCENARIO__CHOICES:
			case ScenarioPackage.SCENARIO__EVENTS_ACTIONS:
			case ScenarioPackage.SCENARIO__IMPORTANT_GAME_STATES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO__OUTCOMES,
				 ScenarioFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO__STATES,
				 ScenarioFactory.eINSTANCE.createGameState()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO__STATES,
				 ScenarioFactory.eINSTANCE.createGameInput()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO__STATES,
				 ScenarioFactory.eINSTANCE.createGMInput()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO__CHOICES,
				 ScenarioFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO__EVENTS_ACTIONS,
				 ScenarioFactory.eINSTANCE.createEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO__IMPORTANT_GAME_STATES,
				 ScenarioFactory.eINSTANCE.createImportantGameState()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScenarioEditPlugin.INSTANCE;
	}

}
