import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log =LogManager.getLogger(testdemo.class);
		
		
		log.info("this is information messase");
		log.error("this is error messase");
		log.fatal("this is fatal messase");
		log.warn("this is warn messase");
	}

}
