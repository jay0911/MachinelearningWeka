package com.poc.weka;

import java.io.File;
import java.io.IOException;

import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.core.converters.CSVSaver;

public class LoadArffSaveCSV implements LoadAndSave{
	private String readPath;
	private String writePath;
	private Instances dataset;
	public LoadArffSaveCSV(String read,String write){
		this.setReadPath(read);
		this.setWritePath(write);
	}

	public void load() {
		// TODO Auto-generated method stub
		ArffLoader loader = new ArffLoader();
		try {
			loader.setSource(new File(getReadPath()));
			setDataset(loader.getDataSet());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(dataset.toSummaryString());
	}

	public void save() {
		// TODO Auto-generated method stub
		CSVSaver saver = new CSVSaver();
		saver.setInstances(getDataset());
		try {
			saver.setFile(new File(getWritePath()));
			saver.writeBatch();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getWritePath() {
		return writePath;
	}

	public void setWritePath(String writePath) {
		this.writePath = writePath;
	}

	public String getReadPath() {
		return readPath;
	}

	public void setReadPath(String readPath) {
		this.readPath = readPath;
	}

	public Instances getDataset() {
		return dataset;
	}

	public void setDataset(Instances dataset) {
		this.dataset = dataset;
	}

}
