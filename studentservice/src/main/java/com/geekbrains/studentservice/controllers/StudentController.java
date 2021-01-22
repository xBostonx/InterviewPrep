package com.geekbrains.studentservice.controllers;

import com.geekbrains.studentservice.entities.Student;
import com.geekbrains.studentservice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/students")
    public String showAllStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students_page";
    }

    @GetMapping("/students/{id}")
    public String getStudent(@PathVariable Long id, Model model) {
        //  TODO Допилить эксепшны если студент не найден

        model.addAttribute("students", studentService.findById(id).get());
        return "students_page";
    }

    @GetMapping("/add")
    public String showAddStudentForm() {
        return "add_student_form";
    }

    @PostMapping("/add")
    public String addNewStudent(@ModelAttribute Student student) {
        studentService.addOrEditStudent(student);
        return "redirect:/students/";
    }

    @GetMapping("/edit/{id}")
    public String showEditStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "edit_student_form";
    }

    @PostMapping("/edit")
    public String editStudent(@ModelAttribute Student student) {
        studentService.addOrEditStudent(student);
        return "redirect:/students/";
    }

//    @DeleteMapping
//    public void deleteAllStudents() {
//        studentService.deleteAllStudents();
//    }

    @RequestMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
//  TODO Допилить эксепшны если студент не найден
        studentService.deleteStudentById(id);
        return "redirect:/students/";
    }
}
