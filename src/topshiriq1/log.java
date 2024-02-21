package topshiriq1;

import com.sun.tools.javac.Main;

import java.util.logging.Logger;

public class log {
    private static final Logger logger = Logger.getLogger(log.class.getName());

    public static void main(String[] args) {
        ////logni consolga chiqarish
      logger.info("Log consolga chiqdi");
      ////fine levelda chiqarish

        logger.fine("hammasi joyida ");
        /// file handler esmda yoq

    }
}
