import kotlin.collections.ArrayList

data class Student(val name: String, val age: String)

 fun main() {
     val students = ArrayList<Student>()
     val studentinfo =
     //val student = Student("Mike", 29)

     print("How any students do you wish to add?: ")
     val numberOfStudents = readLine()?.toInt()
     var count = 0
     for (i in 0..numberOfStudents!!-1) {
         print("Give me the names and age of student number " + (count+1) + ": ")
         val student = readLine()?.split(" ")
         if (student != null) {
             students.add(Student(student[0], student[1]))
         }
         count++
     }
    print(students)
 }
