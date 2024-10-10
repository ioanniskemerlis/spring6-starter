package gr.aueb.cf.starter.controller;


import gr.aueb.cf.starter.DTO.TeacherInsertDTO;
import gr.aueb.cf.starter.DTO.TeacherReadOnlyDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Teachers")
public class TeacherController {
    public String getTeacherForm(Model model){
        model.addAttribute("teacherInsertDTO", new TeacherInsertDTO());
        return "teachers/insert";
    }

    public String addteacher(@ModelAttribute("teacherInsertDTO") TeacherInsertDTO teacherInsertDTO,
                             Model model){

        //service layer -> insertteacher()
        TeacherReadOnlyDTO teacherReadOnlyDTO = new TeacherReadOnlyDTO(1L, "Αθανασιος", "Ανδρουτσος");
        model.addAttribute("dto", teacherReadOnlyDTO);
        return "teachers/success";
    }
}
