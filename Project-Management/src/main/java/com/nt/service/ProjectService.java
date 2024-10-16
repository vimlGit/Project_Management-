package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Project;
import com.nt.repository.ProjectRepository;

import jakarta.transaction.Transactional;

@Service
public class ProjectService {

		@Autowired
		private ProjectRepository projectRepository ;
		
		public List<Project> getAllProject(){
			//System.out.println(projectRepository.getById(101L));
			return projectRepository.findAll() ;
		}
		
	
		public Project saveProject(Project project){
			
			return projectRepository.save(project);
		}
		
public  void deleteProject(Long id){
			
			 projectRepository.deleteById(id);
		}

 
public  Project getProject(Long id){
	
	 return projectRepository.findById(id).get();
}


public Project updateProject(Project project){
	
	return projectRepository.save(project);
}

		
}
