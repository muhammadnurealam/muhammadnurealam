package Beta;
import org.apache.logging.log4j.*;
public class DEmo1 {

	public static Logger log=LogManager.getLogger(DEmo1.class.getName());
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("i am debugging");
		log.info("object is not present");
		log.error("object is not present");
		log.fatal("object is a fatal");


	}

}
