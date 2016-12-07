package jason.thymeleaf.controller;

import jason.thymeleaf.form.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * @author jason, Moon
 * @since 2016-10-07
 */
@Controller
public class FormController {

    @GetMapping("/form")
    public ModelAndView form(PersonForm personForm) {

        ModelAndView mv = new ModelAndView("/form");

        return mv;
    }

    @PostMapping("/form")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/result";
    }
}
