package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) {
        String name = request.getParameter("name");
        if (name == null) {
            name = "World";
        }
        return "Hello " + name;
    }
    @RequestMapping(value = "hello", method= RequestMethod.GET)
    @ResponseBody
    public String helloForm() {

        String html = "<form method='post'>" +
                "<input type= 'text' name='name' />" +
                "<select name='lang'>" +
                "<option value='Spanish'>Spanish</option>" +
                "<option value='French'>French</option>" +
                "<option value='German'>German</option>" +
                "<option value='Italian'>Italian</option>" +
                "<option value='English'>English</option>" +
                "</select>" +
                "<input type='submit' value='Greet Me!' />" +
                "</form>";
        return html;
    }
    @RequestMapping(value="hello", method=RequestMethod.POST)
    @ResponseBody
    public static String createMessage(HttpServletRequest request) {
        String lang = request.getParameter("lang");
        String name = request.getParameter("name");

        if (lang.equals("Spanish")) {
            return "Hola " + name;
        }
        if (lang.equals("French")) {
            return "Bonjour " + name;
        }
        if (lang.equals("German")) {
            return "Guten Tag " + name;
        }
        if (lang.equals("Italian")) {
            return "Ciao " + name;
        }
        return "Hello " + name;
    }
    /*
    @RequestMapping(value = "hello")
    @ResponseBody
    public String helloPost(HttpServletRequest request) {
        String name = request.getParameter("name");

        return "Hello " + name;
    }

    @RequestMapping(value = "hello/{name}")
    @ResponseBody
    public String helloUrlSegment(@PathVariable String name) {
        return "Hello " + name;
    }
*/
    @RequestMapping(value = "goodbye")
    public String goodbye()  {
        return "redirect:/";
    }
}
