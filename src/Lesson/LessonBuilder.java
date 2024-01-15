package Lesson;

abstract class LessonBuilder {
    public Lesson lesson;
    public abstract LessonBuilder getLesson(String title);
    public abstract LessonBuilder applyDiscount(double oran);
    public abstract LessonBuilder setPrice(double fiyat);
    public abstract LessonBuilder addLessonNote(String note);
    public abstract Lesson getResult();
}
