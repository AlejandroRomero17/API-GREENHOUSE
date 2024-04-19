package uxtj.apiinvernadero.apiinvernadero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uxtj.apiinvernadero.apiinvernadero.models.User;
import uxtj.apiinvernadero.apiinvernadero.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/greenhousecontrol/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Método GET para obtener todos los usuarios
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Método POST para agregar un nuevo usuario
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // Método PUT para actualizar un usuario existente
    @PutMapping("/{userID}")
    public User updateUser(@PathVariable Long userID, @RequestBody User updatedUser) {
        return userService.updateUser(userID, updatedUser);
    }

    // Método DELETE para eliminar un usuario por su ID
    @DeleteMapping("/{userID}")
    public void deleteUser(@PathVariable Long userID) {
        userService.deleteUser(userID);
    }
}
