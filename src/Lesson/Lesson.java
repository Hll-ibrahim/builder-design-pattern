package Lesson;

public class Lesson {
    public String name;
    public double price;
    public double discountedPrice;
    public boolean discountedApplied;
    public String lessonNote;

    @Override
    public String toString() {
        return "Lesson{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discountedPrice=" + discountedPrice +
                ", discountedApplied=" + discountedApplied +
                ", lessonNote='" + lessonNote + '\'' +
                '}';
    }
}
