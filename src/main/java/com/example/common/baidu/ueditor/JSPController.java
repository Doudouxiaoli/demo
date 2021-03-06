package com.example.common.baidu.ueditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@Transactional
@RequestMapping("/lib/ueditor/jsp")
public class JSPController {

    private static final Logger logger = LoggerFactory.getLogger(JSPController.class);

    @RequestMapping("/controller")
    @ResponseBody
    public void getConfigInfo(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("application/json");
//        String rootPath = request.getSession().getServletContext()
//                .getRealPath("/");
        String rootPath =  ClassUtils.getDefaultClassLoader().getResource("static").getPath();
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
