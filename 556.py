class Student:
    def _init_(self, student_id, name, age, grade):
        self.student_id = student_id
        self.name = name
        self.age = age
        self.grade = grade
        self.attendance = {}

    def take_attendance(self, date, status):
        self.attendance[date] = status

    def add_grade(self, subject, grade):
        # Implement as needed
        pass

    def _str_(self):
        return f"ID: {self.student_id}, Name: {self.name}, Age: {self.age}, Grade: {self.grade}"

# Implement similar classes for Teacher, Subject, Attendance, Grade

# Example function for adding a student
def add_student():
    student_id = input("Enter student ID: ")
    name = input("Enter student name: ")
    age = input("Enter student age: ")
    grade = input("Enter student grade: ")
    student = Student(student_id, name, age, grade)
    # Code to save student to file or data structure
    print(f"Student {name} added successfully.")

# Example function for taking attendance
def take_attendance():
    date = input("Enter date (YYYY-MM-DD): ")
    student_id = input("Enter student ID: ")
    status = input("Enter status (Present/Absent): ")
    # Code to mark attendance
    print(f"Attendance marked for student ID {student_id} on {date}.")

# Implement other functions based on the outlined features
def add_grade():
    grade=input("enter student grade")
# Example main function to run the program
def main():
    while True:
        print("\n=== School Management System ===")
        print("1. Add Student")
        print("2. Take Attendance")
        print("3. Add Grade")
        print("4. Search Student")
        print("5. Exit")
        choice = input("Enter your choice: ")

        if choice == '1':
            add_student()
        elif choice == '2':
            take_attendance()
        elif choice == '3':
            # Implement add grade function
            pass
        elif choice == '4':
            # Implement search student function
            pass
        elif choice == '5':
            print("Exiting program.")
            break
        else:
            print("Invalid choice. Please try again.")

if _name_ == "_main_":
    main()
