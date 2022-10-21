package factory

import Department
import Group
import MathProfessor
import PersonalInfo
import Professor
import ProgrammingProfessor
import Student

class FridayGroupProfessorFactory : AbstractFactory {
    override fun createGroup(): Group {
        val nazar1 = Student(PersonalInfo(1, "Nazar1", "Pohonchuk", "123", "+380123", "123@at.com", 1, "Student", .0))
        val nazar2 = Student(PersonalInfo(2, "Nazar2", "Pohonchuk", "123", "+380123", "123@at.com", 1, "Student", .0))
        return Group(1, "monday group", mutableListOf(nazar1, nazar2), Department("Programming Department"))
    }

    override fun createProfessor(): Professor {
        return ProgrammingProfessor(
            PersonalInfo(
                9,
                "Oleh",
                "Sinkevych",
                "OlehAdress",
                "+38999",
                "ohel@e.com",
                2,
                "lecturere",
                999_999.99
            )
        )

    }
}