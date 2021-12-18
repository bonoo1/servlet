package hello.servlet.web.servlet.frontcontroller.v1;

import hello.servlet.web.servlet.frontcontroller.v1.controller.MemberFormControllerV1;
import hello.servlet.web.servlet.frontcontroller.v1.controller.MemberListControllerV1;
import hello.servlet.web.servlet.frontcontroller.v1.controller.MemberSaveControllerV1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServletV1",urlPatterns = "/front-controller/v1/*")//*이 들어가면 v1뒤에 어떤url이 들어와도 일단 호출됨?
public class FrontControllerServletV1 extends HttpServlet {

    private Map<String, ControllerV1> controllerMap = new HashMap<>();

    public FrontControllerServletV1() {
        controllerMap.put("/front-cotnroller/v1/members/new-form", new MemberFormControllerV1());
        controllerMap.put("/front-cotnroller/v1/members/save", new MemberSaveControllerV1());
        controllerMap.put("/front-cotnroller/v1/members", new MemberListControllerV1());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse
            response)
            throws ServletException, IOException {
        System.out.println("FrontControllerServletV1.service");
        String requestURI = request.getRequestURI();
        ControllerV1 controller = controllerMap.get(requestURI);
        if (controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        controller.process(request, response);
    }
}