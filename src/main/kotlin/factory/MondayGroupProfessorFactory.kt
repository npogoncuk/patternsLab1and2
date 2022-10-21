package factory

import Department
import Group
import MathProfessor
import PersonalInfo
import Professor
import Student

class MondayGroupProfessorFactory : AbstractFactory {
    override fun createGroup(): Group {
        val nazar1 = Student(PersonalInfo(1, "Nazar1", "Pohonchuk", "123", "+380123", "123@at.com", 1, "Student", .0))
        val nazar2 = Student(PersonalInfo(2, "Nazar2", "Pohonchuk", "123", "+380123", "123@at.com", 1, "Student", .0))
        val nazar3 = Student(PersonalInfo(3, "Nazar3", "Pohonchuk", "123", "+380123", "123@at.com", 1, "Student", .0))
        return Group(1, "monday group", mutableListOf(nazar1, nazar2, nazar3), Department("Math Department"))
    }

    override fun createProfessor(): Professor {
        return MathProfessor(
            PersonalInfo(
                3,
                "Ludmyla",
                "Stahiv",
                "lviv",
                "+38999",
                "abc@e.com",
                2,
                "lecturere",
                999_999.99
            )
        )

    }
}