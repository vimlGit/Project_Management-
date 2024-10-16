package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
@Entity
public class Task {
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		private String name ;
		
		
		@Override
		public String toString() {
			return "Task [id=" + id + ", name=" + name + "]";
		}
		
	
		
}
