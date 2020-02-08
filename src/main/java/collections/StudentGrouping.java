package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import collections.StudentGrouping.Student.Grade;

public class StudentGrouping {

	public static class Student {

		public static enum Grade {
			A, B, C, D, E
		}

		String name;
		Grade grade;

		public Student(String name, Grade grade) {
			this.name = name;
			this.grade = grade;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Grade getGrade() {
			return grade;
		}

		public void setGrade(Grade grade) {
			this.grade = grade;
		}

		public String toString() {
			return name + ": " + grade;
		}
	}

	public static void main(String[] args) {
		
		List<Student> ls = Arrays.asList(new Student("S1", Grade.A),
										 new Student("S2", Grade.A),
										 new Student("S3", Grade.C));
		
		// simple grouping
		Map<Student.Grade, List<Student>> grouping = ls.stream().collect(
				Collectors.groupingBy(Student::getGrade));
		
		System.out.println(grouping);
		
		// enhanced grouping
		Map<Student.Grade, List<String>> grouping2 = ls.stream().collect(
				Collectors.groupingBy(Student::getGrade,
						Collectors.mapping(Student::getName, Collectors.toList())
						)
				);
		
		System.out.println(grouping2);

	}

}
