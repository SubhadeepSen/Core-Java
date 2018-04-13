package nashornJSExample;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*With Java 8, Nashorn, a much improved javascript engine is introduced, to  replace the existing Rhino. 
 Nashorn provides better performance, as it directly compiles the code in memory and passes the bytecode to JVM.
 
 The Nashorn javascript engine can either be used programmatically from java programs or by utilizing the command
 line tool jjs, which located in $JAVA_HOME/bin
 */

public class NashornJSEngineExample {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager scriptEngine = new ScriptEngineManager();
		ScriptEngine engine = scriptEngine.getEngineByName("Nashorn");
		engine.eval("print('hello')");
	}

}
