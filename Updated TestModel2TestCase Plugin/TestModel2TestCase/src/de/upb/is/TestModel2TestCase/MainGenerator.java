package de.upb.is.TestModel2TestCase;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import xunit.TestSuite;


public class MainGenerator {

	private static final String INPUT_PATH = "./input/";
	private static final String OUTPUT_PATH = "./output/";
	private static final String CSHARP_EXTENSION = ".cs";

	public static void main(String[] args) {
		File dir = new File(INPUT_PATH);
		File[] directoryListing = dir.listFiles();
		if (directoryListing != null) {
			for (File file : directoryListing) {
				if (file.isFile()) {
					generateCsharpTestCases(file.getPath());
				}
			}
		} else {
			System.out.println("Problem with the input directory. Check the value of INPUT_PATH.");
		}
	}

	public static void generateCsharpTestCases(String filePath) {

		Resource testCaseXmiResource = Utils.loadXMIResource(filePath);

		List<EObject> contentList = testCaseXmiResource.getContents();

		de.upb.is.TestModel2TestCase.csharp.nunit.TestSuiteGenerator tsGenerator = new de.upb.is.TestModel2TestCase.csharp.nunit.TestSuiteGenerator();

		for (EObject object : contentList) {
			if (object instanceof TestSuite) {
				String generatedTestCaseCode = "";

				TestSuite testSuite = (TestSuite) object;

				// Generate CSharp test cases
				generatedTestCaseCode = tsGenerator.generateTestSuite(testSuite).toString();

				// Create the .cs test files
				System.out.println(generatedTestCaseCode);
				Utils.fileWriter(generatedTestCaseCode, testSuite.getName(), OUTPUT_PATH, CSHARP_EXTENSION);
			}
		}
	}

	public static void generateTypescriptTestCases(String filePath) {

		Resource testCaseXmiResource = Utils.loadXMIResource(filePath);

		List<EObject> contentList = testCaseXmiResource.getContents();

		de.upb.is.TestModel2TestCase.typescript.TestSuiteGenerator tsGenerator = new de.upb.is.TestModel2TestCase.typescript.TestSuiteGenerator();

		for (EObject object : contentList) {
			if (object instanceof TestSuite) {
				String generatedTestCaseCode = "";

				TestSuite testSuite = (TestSuite) object;

				// Generate the typescript test cases
				generatedTestCaseCode = tsGenerator.generateTestSuite(testSuite).toString();

				// Create the test files
				System.out.println(generatedTestCaseCode);
				Utils.fileWriter(generatedTestCaseCode, testSuite.getName(), OUTPUT_PATH, CSHARP_EXTENSION);
			}
		}
	}

}