package com.poc.weka;


/**
 * Hello world!
 *
 */
public class App{

    public static void main( String[] args ){
//    	String read = "C:\\Users\\joliveros\\Desktop\\arff\\weather.arff";
//    	String write = "C:\\Users\\joliveros\\Desktop\\arff\\new.arff";
//    	LoadSaveData ls = new LoadSaveData(read, write);
    	
    	//ls.readPath();

//    	String writecsv = "C:\\Users\\joliveros\\Desktop\\arff\\newCSV.csv";
//    	LoadAndSave csvSave = new LoadArffSaveCSV(read, writecsv);
//    	csvSave.load();
//    	csvSave.save();
    	
    	String readcsv = "C:\\Users\\joliveros\\Desktop\\arff\\newCSV.csv";
    	String writearff = "C:\\Users\\joliveros\\Desktop\\arff\\newARFF.arff";
    	LoadAndSave lsarff = new LoadCSVSaveArff(readcsv,writearff);
    	lsarff.load();
    	lsarff.save();
    	
    	
    	
    }
}
