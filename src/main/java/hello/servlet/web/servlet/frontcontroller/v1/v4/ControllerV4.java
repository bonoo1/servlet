package hello.servlet.web.servlet.frontcontroller.v1.v4;

import java.util.Map;

public interface ControllerV4 {

    /**
     *
     * @param paramMap
     * @param model
     * @return
     */

    String process(Map<String, String >paramMap, Map<String, Object> model);
}
