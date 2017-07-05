package com.pe.prueba;

import java.util.HashMap;
import java.util.Map;

import com.pe.prueba.logs.JobLogger;



public class Home {

	public static void main(String[] args) throws Exception {
		boolean logToFileParam = true;
		boolean logToConsoleParam = true;
		boolean logToDatabaseParam = true;
		boolean logMessageParam = true;
		boolean logWarningParam = true;
		boolean logErrorParam = true;
		
 
		Map<String, String> dbParamsMap = new HashMap<String,String>();
		dbParamsMap.put("userName", "root");
		dbParamsMap.put("password", "slackwarex");
		dbParamsMap.put("serverName", "localhost");
		dbParamsMap.put("dbms", "mysql");
		dbParamsMap.put("logFileFolder", "src/main/resources/Logs/");
		dbParamsMap.put("portNumber", "3306");
		
		new JobLogger(logToFileParam, logToConsoleParam, logToDatabaseParam, logMessageParam, logWarningParam, logErrorParam, dbParamsMap);

		
		
		String messageText = "Mensaje 12";
		boolean message = true;
		boolean warning = true;
		boolean error = true;
		
		 
		
		JobLogger.LogMessage(messageText, message, warning, error);

	}

}
