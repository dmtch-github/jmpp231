package mvchdb.web.controller;

import mvchdb.business.entities.User;
import mvchdb.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/add")
    public String getUsers(ModelMap model) {
        model.addAttribute("listUsers", userService.getUsers());
        return "all-users";
    }

    @RequestMapping("/")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }

    @RequestMapping("/ok")
    public String saveUser(Model model) {
        User user = (User)model.getAttribute("user");
        System.out.println(user);
        return "ok";
    }
}
