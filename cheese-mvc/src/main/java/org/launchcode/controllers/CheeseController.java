package org.launchcode.controllers;

import org.launchcode.models.Category;
import org.launchcode.models.Cheese;
import org.launchcode.models.data.CategoryDAO;
import org.launchcode.models.data.CheeseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by LaunchCode
 */


@Controller
@RequestMapping(value = "cheese")
public class CheeseController {

    @Autowired
    CategoryDAO categoryDAO;

    @Autowired
    private CheeseDAO cheeseDAO;

    // Request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("cheeses", cheeseDAO.findAll());
        model.addAttribute("title", "My Cheeses");

        return "cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayCheeseForm(Model model) {
        model.addAttribute("title", "Add Cheese");
        model.addAttribute(new Cheese());
        model.addAttribute("categories", categoryDAO.findAll());
        return "cheese/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@ModelAttribute @Valid Cheese newCheese, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Cheese");
            return "cheese/add";
        }
        Category cat = categoryDAO.findOne(categoryId);
        newCheese.setCatagory(cat);
        cheeseDAO.save(newCheese);
        // Redirect to /cheese
        return "redirect:";
    }
    @RequestMapping(value="delete", method= RequestMethod.GET)
    public String displayDeleteCheeseForm(Model model) {
        model.addAttribute("title", "Delete Cheese");
        model.addAttribute("cheeses", cheeseDAO.findAll());
        return "cheese/delete";
    }
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String processDeleteCheeseForm(@RequestParam int cheeseId) {
        cheeseDAO.delete(cheeseId);
        return "redirect:";
    }
    @RequestMapping(value = "edit/{cheeseId}", method = RequestMethod.GET)
    public String displayEditForm(Model model, @PathVariable int cheeseId) {
        model.addAttribute(cheeseDAO.findOne(cheeseId));
        model.addAttribute("categories", categoryDAO.findAll());
        return "cheese/edit";
    }
    @RequestMapping(value = "edit/{cheeseId}", method = RequestMethod.POST)
    public String processEditForm(Model model, @PathVariable int cheeseId, @Valid Cheese cheese, Errors errors, String name, String description, CheeseType type, Integer rating) {
        model.addAttribute("categories", categoryDAO.findAll());
        if (errors.hasErrors()) {
            return "cheese/edit";
        }
        Cheese editCheese = cheeseDAO.findOne(cheeseId);
        editCheese.setName(name);
        editCheese.setDescription(description);
        editCheese.setType(type);
        editCheese.setRating(rating);
        // Redirect to /cheese
        return "redirect:/cheese";
    }

}
