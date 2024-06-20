package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
        @RequestMapping(value = "/index", method = RequestMethod.GET)
        public String home() {
            System.out.println("Index");
            return "index.html";
        }


}
