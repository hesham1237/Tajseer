package com.elm.tajseer.tajseer;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
public class Controllar {
    @Autowired
    private service service;
    //add a student
    @PostMapping(value ="/Student")
    public Student addStudent(@RequestBody Student student){

        service.addStudent(student);
        return student;
    }
    //get all student
    @GetMapping(value = "/Student")
    public List<Student> deletst(){
        service.getStudents();
        return service.getStudents();
    }
    //get all the student by id
    @GetMapping("/{id}")
    public Student getStdudent(@PathVariable("id") int id){
        return service.getStudent(id);

    }
    //Delete a student
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id){
         service.deleteStudent(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@RequestBody Student student,@PathVariable("id") int id){
        return service.udateStudent(student,id);
}

}
