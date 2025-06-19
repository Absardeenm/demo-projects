package com.project.TODO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.TODO.Model.ToDo;
import com.project.TODO.service.ToDoService;

//import ch.qos.logback.core.model.Model;

@Controller
public class TodoController {
	@Autowired
	private ToDoService service;
	@GetMapping({"/","viewToDoList"})
	public String viewAllToDoItems( Model model,@ModelAttribute("messege") String messege) {
		model.addAttribute("view", service.getAllToDo());
		model.addAttribute("msg", messege);
		return "ViewToDoList";
		
	}
	@PostMapping("/updateToDoStatus/{id}")
	public String UpdateStatus(@PathVariable int id,RedirectAttributes redirectAttributes) {
		if(service.updateStatus(id)) {
			redirectAttributes.addFlashAttribute("messege","update Success");
			return "redirect:/ViewToDoList";
			
		}
		redirectAttributes.addFlashAttribute("messege","update Fails");
		return "redirect:/ViewToDoList";
		
	}
	@GetMapping("/addToDoItem")
	public String addToDoItem(Model model) {
		model.addAttribute("todo", new ToDo());
		
	
		return"addToDoItem";
	}
	@PostMapping("/saveToDoltem")
	public String saveToDoItem(ToDo todo,RedirectAttributes redirectAttributes) {
		if(service.saveOrUpdateToDoItem(todo)) {
			
			redirectAttributes.addFlashAttribute("message","Save success");
			return "redirect:/ViewToDoList";
		}
		redirectAttributes.addFlashAttribute("message","Save Failure");
		return "redirect:/addToDoItem";
		 
		
	}
	@GetMapping("/editToDoItem/{id}")
	public String editToDoItem(@PathVariable int id,Model model) {
		model.addAttribute("todo", service.getToDoItemById(id));
		return "EditToDoItem";
		
	}
	@PostMapping("/editSaveToDoItem")
	public String EditSaveToDoItem(ToDo todo, RedirectAttributes redirectAttributes) {
      if(service.saveOrUpdateToDoItem(todo)) {
			
			redirectAttributes.addFlashAttribute("message","Edit success");
			return "redirect:/ViewToDoList";
		}
		redirectAttributes.addFlashAttribute("message","Edit Failure");
		return "redirect:/editToDoItem"+todo.getId();
		
	}
	@GetMapping("/deleteToDoItem/{id}")
	public String deleteToDoItrm(@PathVariable int id,RedirectAttributes redirectAttributes ) {
		if(service.deleteToDoItem(id)) {
			redirectAttributes.addFlashAttribute("message","delete success");
			
		}
		redirectAttributes.addFlashAttribute("message","delete Failed");
		return "redirect:/ViewToDoList"; 
	}
}
