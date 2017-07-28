package com.poc.weka;

import java.io.File;
import java.io.IOException;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;

public class LoadSaveData {
	private String readPath;
	private String writePath;
	private DataSource source;
	private Instances dataset;
	private ArffSaver saver;
	public LoadSaveData(String read,String write){

		this.setReadPath(read);
		this.setWritePath(write);
    	try{
    		source = new DataSource(getReadPath());
    		dataset = source.getDataSet();
    		saver = new ArffSaver();
    	}catch(Exception e){
    		
    	}

	}
	
	public void readPath(){
    	System.out.println(dataset.toSummaryString());
	}
	
	public void writePath() throws IOException{	
		saver.setInstances(dataset);
		saver.setFile(new File(getWritePath()));
		saver.writeBatch();
	}

	public String getReadPath() {
		return readPath;
	}

	public void setReadPath(String readPath) {
		this.readPath = readPath;
	}

	public String getWritePath() {
		return writePath;
	}

	public void setWritePath(String writePath) {
		this.writePath = writePath;
	}
}
