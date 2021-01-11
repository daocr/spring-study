package com.huilong.controller;

import com.huilong.controller.param.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
class PersonController {

    /**
     *
     * @param id 用户id
     * @return
     */
    @GetMapping("/{id}")
    public Person getPerson(@PathVariable Integer id) {

        Person person = new Person();

        person.setId(id);
        person.setName("张三");

        return person;
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public void add(@RequestBody Person person ) {
//
//
//
//
//    }
}