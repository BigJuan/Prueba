import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

import com.pe.prueba.logs.JobLogger;


public class JobLoggerTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testInvalidConfiguration() throws Exception {
		 thrown.expect(Exception.class);
		 thrown.expectMessage(JUnitMatchers.containsString("Invalid configuration"));
		
		new JobLogger(false,false,false,true,false,false, null); 
		
		JobLogger.LogMessage("prueba de configuracion - se espera un Exception", true, false, false);
	}

	
	@Test
	public void testInvalidTypeError() throws Exception {
		 thrown.expect(Exception.class);
		 thrown.expectMessage(JUnitMatchers.containsString("Error or Warning or Message must be specified"));
		
		new JobLogger(true,false,false,false,false,false, null);  
		
		JobLogger.LogMessage("prueba de configuracion de Mensaje - se espera un Exception", true, false, false);
	}
}
