package logger.data;

import logger.pojo.Log;

import java.util.concurrent.TimeoutException;

public interface DataStore {

    void addLog(Log log);

    void appendLog(Log log) throws TimeoutException;
}
