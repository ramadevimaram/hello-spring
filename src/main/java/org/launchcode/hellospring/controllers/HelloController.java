package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
//public class HelloController {
//    //Handles requst at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello,Spring";
//    }
//    @PostMapping("goodbye")
//    @ResponseBody
//    public String goodbye(){
//        return "Goodbye,Spring";
//    }
//
//}
/*@Controller
public class HelloController{
    //Responds to /hello?name=LaunchCode
    //use RequestParam
    @RequestMapping(value = "hello", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name){
        return "Hello," + name +"!!!!";
    }
    //Responds tp /hello/LaunchCode
    //Use PathVariable
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name){
        return "Hello," +name +"!";
    }
    @GetMapping("form")
    //@ResponseBody
    public String helloForm(){
        return "form";
    }
 */
//Learning Form
/*@Controller
@ResponseBody
@RequestMapping("hello")//every request should begin /hello
public class HelloController {
    //Responds to /hello?name=LaunchCode
    //use RequestParam
    //@GetMapping("hello")//Use GetMethod
    //@PostMapping("hello")//Use PostMethod
    //lives path /hello/hello
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "hello")////remove here and added to top of class means class level annotation
    //@ResponseBody //remove here and added to top of class means class level annotation
    //@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})//path live /hello
    public String hello(@RequestParam String name){
        return "Hello," + name +"!!!!";
    }
    //lives /hello/form
    @GetMapping("form")
    //@ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello'method='post'>" +//submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
*/
//Exercise Controllers and Routing
@Controller
@ResponseBody
@RequestMapping("hello")//every request prefix adds /hello
public class HelloController {
    //Responds to /hello?name=LaunchCode
    //use RequestParam
    //@GetMapping("hello")//Use GetMethod
    //@PostMapping("hello")//Use PostMethod
    //path lives /hello/hello
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "hello")////remove here and added to top of class means class level annotation
    //@ResponseBody //remove here and added to top of class means class level annotation
    public static String createMessage(@RequestParam String name,String language){
       // return "Hello," + name + " " + language +"!!!!";

        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Name :" + name +
                        "</h1>" +
                        "<h1> Language :"+language+
                        "</h1>"+
                        "</body>" +
                        "</html>";
        return html;
    }
    //lives /hello/form
    @GetMapping("form")
    //@ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +//submit a request to /hello
                "<input type='text' name='name'>" +
                "<label>My favorite language:" +
                "<select name='language'>" +
                "<option value='English' selected>English</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "<option value='Telugu'>Telugu</option>" +
                "<option value='Hindi'>Hindi</option>" +
                "<option value='Tamil'>Tamil</option>" +
                "</select></label><br>" +
                "<input type='submit' value='greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}


/*@Controller
public class HelloController{
    //Responds to /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET,RequestMethod.POST})
   // @ResponseBody
    public String hello(@RequestParam String name, Model model){
        String thegreeting = "Hello," + name +"!!!!!";
        model.addAttribute("greeting",thegreeting);
        return "hello";
    }
    //Responds tp /hello/LaunchCode
    @GetMapping("hello/{name}")
    //@ResponseBody
    public String helloAgain(@PathVariable String name,Model model){
        String thegreeting = "Hello, "+ name +"!";
        model.addAttribute("greeting",thegreeting);
        return "hello";
    }
    @GetMapping("form")
    //@ResponseBody
    public String helloForm(){
        return "form";
    }
    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names1 = new ArrayList<>();
        names1.add("LaunchCode");
        names1.add("JAVA");
        names1.add("JavaScript");
        model.addAttribute("names",names1);
        return "hello-list";
    }
}
*/
