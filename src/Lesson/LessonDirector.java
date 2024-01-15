package Lesson;

public class LessonDirector {
    private LessonBuilder lessonBuilder;
    public LessonDirector(LessonBuilder lessonBuilder){
        this.lessonBuilder = lessonBuilder;
    }
    public void Make(){
        lessonBuilder.getLesson("title");
        lessonBuilder.applyDiscount(0.5);
        lessonBuilder.addLessonNote("note");
    }
}
