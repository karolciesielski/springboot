package springboot.springboot2;

import org.springframework.web.bind.annotation.*;


public class TaskController {

    @RequestMapping("/zadanie7")
    public String getParameter1(@RequestHeader(defaultValue = "Brak parametru") String Accept){
        return Accept;
    }

    @RequestMapping("/zadanie8")
    public String getParameter2(@RequestParam(defaultValue = "Gościu!") String imie){
        return "Witaj " + imie;
    }

    @RequestMapping("/zadanie9/{number}")
    public String getCatsNumber(@PathVariable int number){
        return "Ala ma " + number + " kotów.";
    }

}
