package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtils {

    private static Logger log;

    public static Logger logger(String name){
        log = LogManager.getLogger(name);
        return log;
    }
}
