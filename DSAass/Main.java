package DSAass;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Add tasks
        toDoList.addToDo(new Task("Pray", "Go To Church"));
        toDoList.addToDo(new Task("Do assignments", "Take OOP Exam"));
        toDoList.addToDo(new Task("Stationary shopping", "Buy Books, Pen, and Compass"));

        // View the to-do list
        toDoList.viewToDoList();

        // Mark a task as completed
        toDoList.markToDoAsCompleted("Stationary shopping");

        // View the updated to-do list
        toDoList.viewToDoList();
    }
}
