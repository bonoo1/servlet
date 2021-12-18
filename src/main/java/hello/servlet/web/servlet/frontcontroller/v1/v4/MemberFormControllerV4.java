package hello.servlet.web.servlet.frontcontroller.v1.v4;


import hello.servlet.web.servlet.frontcontroller.v1.ModelView;
import hello.servlet.web.servlet.frontcontroller.v1.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {

        return "new-form";
    }
}
