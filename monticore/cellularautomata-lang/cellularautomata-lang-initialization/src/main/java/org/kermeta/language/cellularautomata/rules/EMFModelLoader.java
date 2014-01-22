/*
 * Copyright (c) 2014 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package org.kermeta.language.cellularautomata.rules;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ruleInit.CellularAutomatatInitialization;
import ruleInit.InitPackage;

import com.google.common.io.Files;

public class EMFModelLoader {
  public CellularAutomatatInitialization load(String path) {
    String fileExtension = Files.getFileExtension(path);

    // Initialize the model
    InitPackage.eINSTANCE.eClass();

    // Register the XMI resource factory for the .irule extension

    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put(fileExtension, new XMIResourceFactoryImpl());

    ResourceSet resSet = new ResourceSetImpl();

    Resource resource = resSet.getResource(URI.createURI(path), true);
    CellularAutomatatInitialization caInit = (CellularAutomatatInitialization) resource.getContents().get(0);
    return caInit;
  }

}