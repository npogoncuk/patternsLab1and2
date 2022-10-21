package factory

import Department
import Group
import PersonalInfo
import Professor
import ProgrammingProfessor
import Student

class DefaultGroupProfessorFactory: AbstractFactory {
    override fun createGroup(): Group {
        val nazar1 = Student(PersonalInfo(1, "Nazar1", "Pohonchuk", "123", "+380123", "123@at.com", 1, "Student", .0))
        return Group(1, "monday group", mutableListOf(nazar1), Department("Programming Department"))
    }

    override fun createProfessor(): Professor {
        return ProgrammingProfessor(
            PersonalInfo(
                9,
                "Sergij",
                "Velgosh",
                "somewhere",
                "+38999",
                "sergijjjj@e.com",
                99,
                "lecturere",
                999_999.99
            )
        )

    }
}