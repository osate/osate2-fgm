/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage
 * @generated
 */
public class FeatureGroupMappingAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FeatureGroupMappingPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupMappingAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FeatureGroupMappingPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureGroupMappingSwitch<Adapter> modelSwitch =
    new FeatureGroupMappingSwitch<Adapter>()
    {
      @Override
      public Adapter caseFGMGrammarRoot(FGMGrammarRoot object)
      {
        return createFGMGrammarRootAdapter();
      }
      @Override
      public Adapter caseFGMLibrary(FGMLibrary object)
      {
        return createFGMLibraryAdapter();
      }
      @Override
      public Adapter caseFeatureMappingset(FeatureMappingset object)
      {
        return createFeatureMappingsetAdapter();
      }
      @Override
      public Adapter caseFGMSubclause(FGMSubclause object)
      {
        return createFGMSubclauseAdapter();
      }
      @Override
      public Adapter caseFeatureMapping(FeatureMapping object)
      {
        return createFeatureMappingAdapter();
      }
      @Override
      public Adapter caseFeaturePath(FeaturePath object)
      {
        return createFeaturePathAdapter();
      }
      @Override
      public Adapter caseFeatureReference(FeatureReference object)
      {
        return createFeatureReferenceAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAnnexLibrary(AnnexLibrary object)
      {
        return createAnnexLibraryAdapter();
      }
      @Override
      public Adapter caseModalElement(ModalElement object)
      {
        return createModalElementAdapter();
      }
      @Override
      public Adapter caseAnnexSubclause(AnnexSubclause object)
      {
        return createAnnexSubclauseAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot <em>FGM Grammar Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot
   * @generated
   */
  public Adapter createFGMGrammarRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary <em>FGM Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary
   * @generated
   */
  public Adapter createFGMLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset <em>Feature Mappingset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset
   * @generated
   */
  public Adapter createFeatureMappingsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause <em>FGM Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause
   * @generated
   */
  public Adapter createFGMSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping <em>Feature Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping
   * @generated
   */
  public Adapter createFeatureMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath <em>Feature Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath
   * @generated
   */
  public Adapter createFeaturePathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference <em>Feature Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference
   * @generated
   */
  public Adapter createFeatureReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexLibrary <em>Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexLibrary
   * @generated
   */
  public Adapter createAnnexLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ModalElement <em>Modal Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ModalElement
   * @generated
   */
  public Adapter createModalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexSubclause <em>Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexSubclause
   * @generated
   */
  public Adapter createAnnexSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FeatureGroupMappingAdapterFactory
