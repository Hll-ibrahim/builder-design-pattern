package Lesson;

public class LessonMain {
    public static void main(String[] args){
        LessonBuilder lessonBuilder = new NewStudentLessonBuilder();
        LessonBuilder lessonBuilder2 = new NewStudentLessonBuilder();
        LessonDirector lessonDirector = new LessonDirector(lessonBuilder2);

        Lesson lesson = lessonBuilder.setTitle("Web Programming").addLessonNote("html css js jquery vuejs php laravel mysql").setPrice(12).getResult();

        Lesson newLesson = lessonDirector.MakeNewStudent("Artifical Inteligence",24,"You will learn about ai.");

        System.out.println(lesson);
        System.out.println(newLesson);
    }
}
