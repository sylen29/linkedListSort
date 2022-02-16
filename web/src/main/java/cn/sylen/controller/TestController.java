package cn.sylen.controller;

import cn.sylen.utils.WebServletUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "Test")
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    private static final String userDir = System.getProperties().getProperty("user.dir") + "/";

    @ApiOperation(value = "echo test", httpMethod = "GET")
    @RequestMapping(value = "/pong", method = RequestMethod.GET)
    @CrossOrigin
    public String echoTest(
            HttpServletRequest request, HttpServletResponse response
    ) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello!\n");
        sb.append("got Remote Addr: ").append(WebServletUtil.getRemoteAddr(request));

        sb.append("\nforwarded is: ").append(request.getHeader("X-Forwarded-For"));

        sb.append("\nreal ip is: ").append(request.getHeader("X-Real-IP"));
        return sb.toString();
    }
}
