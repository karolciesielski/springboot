package springboot.springboot2.person;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PersonController {
        ArrayList<Person> persons;

        public PersonController() {
            this.persons = new ArrayList<>();
            persons.add(new Person("Mateusz", "Dubiniewicz", 27));
            persons.add(new Person("Jan", "Nowak", 35));
        }

        @GetMapping("/persons")
        public ArrayList<Person> returnListOfPersons(){
            return persons;
        }
        @PostMapping("/persons")
        public void addPersonToList(@RequestBody Person person){
            persons.add(person);
        }
        @DeleteMapping("/persons")
        public void deletePersonFromList(@RequestBody Person person){
            Person myPerson = null;

            for (Person current : persons) {
                if (current.equals(person)){
                    myPerson = current;
                    break;
                }
            }
            persons.remove(myPerson);
        }
        @PatchMapping("/persons")
        public void updatePerson(@RequestBody Person person,
                                 @RequestParam(defaultValue = "brak") String name,
                                 @RequestParam(defaultValue = "brak") String surname,
                                 @RequestParam(defaultValue = "-1") int age){
            Person myPerson = null;

            for (Person current : persons) {
                if (current.equals(person)){
                    if(!name.equals("brak")){
                        current.setFirstName(name);
                    }
                    if(!surname.equals("brak")){
                        current.setLastName(surname);
                    }
                    if(age!=-1){
                        current.setAge(age);
                    }
                    break;
                }
            }
        }

    }
