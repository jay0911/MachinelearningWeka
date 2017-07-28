package com.poc.weka;


/**
 * Hello world!
 *
 */
public class App{

    public static void main( String[] args ){
    	String read = "C:\\Users\\joliveros\\Desktop\\arff\\weather.arff";
    	String write = "C:\\Users\\joliveros\\Desktop\\arff\\new.arff";
    	LoadSaveData ls = new LoadSaveData(read, write);
    	
    	ls.readPath();


    }
}
