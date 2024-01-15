package Lesson;

public class LessonDirector {
    private LessonBuilder lessonBuilder;
    public LessonDirector(LessonBuilder lessonBuilder){
        this.lessonBuilder = lessonBuilder;
    }
    public Lesson MakeNewStudent(String title,double price,String note) {
        return lessonBuilder.setTitle(title).setPrice(price).applyDiscount(0.5).addLessonNote(note).getResult();
    }
}
