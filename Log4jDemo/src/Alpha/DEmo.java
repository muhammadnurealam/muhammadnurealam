package Alpha;
import org.apache.logging.log4j.*;
public class DEmo {

	public static Logger log=LogManager.getLogger(DEmo.class.getName());
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("i am debugging");
		log.info("object is not present");
		log.error("object is not present, null");
		log.fatal("object is a fatal");


	}

}
