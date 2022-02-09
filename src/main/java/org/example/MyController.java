package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("")
    public String showFirstView() {
        return "first-view";
    }

//    @RequestMapping("/askName")
//    public String askName() {
//        return "ask-name-view";
//    }

//    @RequestMapping("/showName")
//    public String showName() {
//        return "show-name-view";
//    }


    //    @RequestMapping("/showName")
//    public String showName(HttpServletRequest request, Model model) {
//        String name = request.getParameter("employeeName");
//        name = name.toUpperCase();
//        model.addAttribute("firstName", name);
//        model.addAttribute("finish", "!!!");
//        return "show-name-view";
//    }
//    @RequestMapping("/showName")
//    public String showName(@RequestParam("employeeName") String employeeName, Model model) {
//        model.addAttribute("firstName", employeeName.toUpperCase());
//        model.addAttribute("finish", "!!!");
//        return "show-name-view";
//    }


    @RequestMapping("/askInfo")
    public String askInfo(Model model) {
        Employee employee = new Employee("first name", "last name", 666);
        model.addAttribute("employee", employee);
        return "ask-info-view";
    }

    @RequestMapping("/showInfo")
    public String showInfo(@ModelAttribute("employee") Employee employee) {
        employee.setFirstName(employee.getFirstName().toUpperCase());
        return "show-info-view";
    }
}
