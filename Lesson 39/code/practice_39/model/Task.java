package practice_39.model;

import java.util.Objects;

public class Task implements Comparable<Task>{
    // поля класса - они описывают Объекты класса
    private int id; // идентификатор
    private String task; // содержание задачи

    // конструктор
    public Task(int id, String task) { // по имени совпадает с именем класса, но ничего не возвращает и не void
        this.id = id;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // метод ToString
    @Override
    public String toString() { // переопределяем для себя, для использования в своей программе
        return "Task{" + "id= " + id + ", task= '" + task  + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Task o) {
        return this.id - o.id; // сортировка по id
    }
}
