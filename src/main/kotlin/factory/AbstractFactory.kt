package factory

import Group
import Professor

interface AbstractFactory {
    fun createGroup(): Group
    fun createProfessor(): Professor
}