package Lesson;

public class NewStudentLessonBuilder extends LessonBuilder{

    public NewStudentLessonBuilder(){
        this.lesson = new Lesson();
    }
    @Override
    public LessonBuilder setPrice(double price){
        this.lesson.price = price;
        return this;
    }
    @Override
    public LessonBuilder setTitle(String title) {
        this.lesson.name = title;
        return this;
    }

    @Override
    public LessonBuilder applyDiscount(double oran) {
        this.lesson.discountedPrice = lesson.price * oran;
        this.lesson.discountedApplied = true;
        return this;
    }

    @Override
    public LessonBuilder addLessonNote(String note) {
        this.lesson.lessonNote = note;
        return this;
    }

    @Override
    public Lesson getResult() {
        return lesson;
    }
}
