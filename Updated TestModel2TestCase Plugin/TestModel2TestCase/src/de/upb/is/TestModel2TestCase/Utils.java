package de.upb.is.TestModel2TestCase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import xunit.XunitPackage;

public class Utils {
	
	
	public static Resource loadXMIResource(String relativePath) {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		// You find the correct name of the package in the generated model code
		XunitPackage xunitPackage = XunitPackage.eINSTANCE;

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(relativePath).getAbsolutePath());

		// Demand load the resource for this file, here the actual loading is
		// done.
		Resource resource = resourceSet.getResource(fileURI, true);

		return resource;
	}

	public static void fileWriter(CharSequence content, String filename, String outputPath, String fileExtension) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(outputPath + filename + fileExtension);
			bw = new BufferedWriter(fw);
			bw.write(content.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
