package com.project.TODO.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TODO.Model.ToDo;

@Service
public class ToDoService {
	@Autowired
	private ToDoRepo repo;
	
	public List<ToDo>getAllToDo(){
		ArrayList<ToDo> ToDoList=new ArrayList<>();
		repo.findAll().forEach(todo ->ToDoList.add(todo));
		return ToDoList;
	}
	
	public ToDo getToDoItemById(Integer id){
		return repo.findById(id).get();
		
	}
	
	public boolean updateStatus(int id){
		ToDo todo=getToDoItemById(id);
		todo.setStatus("Complete");
		return saveOrUpdateToDoItem(todo);
		
	}
	
	public boolean saveOrUpdateToDoItem(ToDo todo){
		ToDo updatedob=repo.save(todo);
		if(getToDoItemById(updatedob.getId()) !=null) {
			return true;
		}
		return false;
	}
	
	public boolean deleteToDoItem(int id){
		
		repo.deleteById(id);
		if(getToDoItemById(id)==null) {
			return true;
			
		}
		return false;
	}
}
