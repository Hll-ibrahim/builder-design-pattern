package Lesson;

public class LessonMain {
    public static void main(String[] args){
        LessonBuilder lessonBuilder = new NewStudentLessonBuilder();
        lessonBuilder.addLessonNote("Ders notu").setPrice(12);

        Lesson lesson = lessonBuilder.getResult();

        System.out.println(lesson);
    }
}
