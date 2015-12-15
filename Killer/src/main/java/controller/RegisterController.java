package controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ua.com.ostps.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(value = "/register")
public class RegisterController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        User userForm = new User();    
        model.put("userForm", userForm);
        return "Registration";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
            Map<String, Object> model) {
        System.out.println("userID: " + user.getUserID());
        System.out.println("email: " + user.getEmail());
        System.out.println("password: " + user.getPassword());
         
        return "RegistrationSuccess";
    }
}