package com.pe.prueba;

import java.util.HashMap;
import java.util.Map;

import com.pe.prueba.logs.JobLogger;



public class Home {

	public static void main(String[] args) throws Exception {
		boolean logToFileParam = false;
		boolean logToConsoleParam = true;
		boolean logToDatabaseParam = false;
		boolean logMessageParam = true;
		boolean logWarningParam = true;
		boolean logErrorParam = true;
		

		//jdbc:sqlserver://localhost;databaseName=LLBD
		//jdbc:mysql://localhost:3306/
		Map<String, String> dbParamsMap = new HashMap<String,String>();
		dbParamsMap.put("userName", "root");
		dbParamsMap.put("password", "");
		dbParamsMap.put("serverName", "localhost");
		dbParamsMap.put("dbms", "mysql");
		dbParamsMap.put("logFileFolder", "c:/Logs");
		dbParamsMap.put("portNumber", "3306");
		
		new JobLogger(logToFileParam, logToConsoleParam, logToDatabaseParam, logMessageParam, logWarningParam, logErrorParam, dbParamsMap);
		
		String messageText = "Texto Prueba";
		boolean message = true;
		boolean warning = true;
		boolean error = false;
		
		//System.out.println("test");
		//Class.forName("com.mysql.jdbc.Driver");
		
		JobLogger.LogMessage(messageText, message, warning, error);

	}

}
