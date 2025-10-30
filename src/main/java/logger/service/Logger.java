package logger.service;

import logger.data.FileStore;
import logger.pojo.Log;

import java.util.Queue;
import java.util.Set;

public class Logger {

    private FileStore fileStore;

    private Set<Log> logTrackSet;

    private Queue<Set<Log>> logPeocessingQueue;

    private Integer timeOut;

    private static Logger logger = null;
    private static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
}
