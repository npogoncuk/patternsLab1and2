data class Group(
    val id: Int,
    val title: String,
    val students: MutableList<Student>,
    val department: Department
)
