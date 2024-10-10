package gr.aueb.cf.starter.controller;


import gr.aueb.cf.starter.DTO.TeacherInsertDTO;
import gr.aueb.cf.starter.DTO.TeacherReadOnlyDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

    @GetMapping("/insert")
    public String getTeacherForm(Model model){
        model.addAttribute("teacherInsertDTO", new TeacherInsertDTO());
        return "teachers/insert";
    }
    @PostMapping("/insert")
    public String addTeacher(@ModelAttribute("teacherInsertDTO") TeacherInsertDTO teacherInsertDTO,
                             Model model){
        //service layer -> insert teacher()
        //TeacherReadOnlyDTO teacherReadOnlyDTO = new TeacherReadOnlyDTO(1L, "Αθανάσιος", "Ανδρούτσος");
        model.addAttribute("dto", teacherInsertDTO);
        return "teachers/success";
    }
}
