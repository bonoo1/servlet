package hello.servlet.web.servlet.frontcontroller.v1.v3;

import hello.servlet.web.servlet.frontcontroller.v1.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String , String> paramMap);
}
