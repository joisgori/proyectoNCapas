package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.MovieDAO;
import com.uca.capas.domain.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.validation.Valid;

public class MainController {
	
	@Autowired
	private MovieDAO studentDao;
	
	//Objeto Logger
	static Logger log = Logger.getLogger(MainController.class.getName());
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		log.info("Entrando a funcion init-main " + log.getName());
		ModelAndView mav = new ModelAndView();
		List<Movie> students = null;
		try {
			//Se seleccionan todos los estudiantes
			students = studentDao.findAll();
			log.info("Termino de buscar en la base de datos");
		} 
		catch (Exception e) {
			log.log(Level.SEVERE,"Exception Occur",e);
		}
		mav.addObject("students",students);
		mav.setViewName("main");
		return mav;
	}
	
}
