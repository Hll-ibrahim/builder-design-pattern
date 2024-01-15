package Lesson;

public class OldStudentBuilder extends LessonBuilder{
    public OldStudentBuilder(){
        this.lesson = new Lesson();
    }
    @Override
    public LessonBuilder setPrice(double price){
        this.lesson.price = price;
        return this;
    }
    @Override
    public LessonBuilder setTitle(String title) {
        this.lesson = new Lesson();
        this.lesson.name = title;
        return this;
    }

    @Override
    public LessonBuilder applyDiscount(double oran) {
        lesson.discountedPrice = lesson.price * oran;
        lesson.discountedApplied = false;
        return this;
    }

    @Override
    public LessonBuilder addLessonNote(String note) {
        lesson.lessonNote = note;
        return this;
    }

    @Override
    public Lesson getResult() {
        return this.lesson;
    }
}
