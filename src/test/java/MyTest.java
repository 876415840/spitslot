import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: 孟庆浩
 * @Description:
 * @Date: Created in 17-10-9 下午3:43
 * @Modified By:
 */
public class MyTest {
    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);
    public static void main(String[] args) {
        int status = 0;
        if (status == 0) {
            logger.info("status:{}", status);
        } else {
            logger.info("status:{}", status);
        }
        logger.info("end!");
    }
}
