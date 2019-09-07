# LoggApp
Logg Library for Flutter

# Import

`import com.darshan.logg.Logger;`

# Usage

```
Logger logger = new Logger(Logger.LogLevel.VERBOSE);
    logger.info(TAG, "This is info log");
    logger.debug(TAG, "This is debug log");
    logger.error(TAG,"This is error log");
    logger.verbose(TAG, "This is verbose log");
```