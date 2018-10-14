package com.poc.weka;

import java.util.HashMap;
import java.util.Map;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class PredictWeka {
	public static void main(String[] args) throws Exception {
		
		Map<Integer,String> wordMapping = new HashMap<Integer,String>();
		wordMapping.put(1, "kamusta rin");
		wordMapping.put(2, "goodmorning");
		wordMapping.put(3, "teka");
		wordMapping.put(4, "kelan");
		wordMapping.put(5, "mabuhay");
		wordMapping.put(6, "kamusta");
		wordMapping.put(7, "magandang umaga");
		
		DataSource source = new DataSource("C:\\Users\\ROG-GL552VX\\Desktop\\weka\\convo\\convo.arff");
		
		Instances trainDataSet = source.getDataSet();
		trainDataSet.setClassIndex(trainDataSet.numAttributes() - 1);
		
		int numClasses = trainDataSet.numClasses();
		
		for(int i=0;i<numClasses;i++) {
			String classValue = trainDataSet.classAttribute().value(i);
			System.out.println("Class Value"+i+" is "+ classValue);
		}
		
		NaiveBayes nb = new NaiveBayes();
		nb.buildClassifier(trainDataSet);
		
		DataSource unknownData = new DataSource("C:\\Users\\ROG-GL552VX\\Desktop\\weka\\convo\\unknowndata.arff");
		Instances testDataset = unknownData.getDataSet();
		
		testDataset.setClassIndex(testDataset.numAttributes() - 1);
		
		System.out.println("=======");
		System.out.println("NB Predicted");
		
		for(int i =0;i<testDataset.numInstances();i++) {	
			Instance newInst = testDataset.instance(i);
			double predNB = nb.classifyInstance(newInst);
			String predString = testDataset.classAttribute().value((int)predNB);
			System.out.println(wordMapping.get(Integer.parseInt(predString)));
		}
	}
}
