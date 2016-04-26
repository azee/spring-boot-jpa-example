package io.fourfinanceit.homework.controller;

import io.fourfinanceit.homework.beans.User;
import io.fourfinanceit.homework.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by azee on 25.04.16.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") String id){
        return userService.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE}
    )

    @ResponseBody
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(method = RequestMethod.PUT,
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    @ResponseBody
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id){
        userService.delete(id);
    }
}
