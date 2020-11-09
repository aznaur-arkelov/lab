public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Война и мир", 600);
        Book b2 = new Book("Цветы для Элджернона");
        Book b3 = new Book();
        b3.setTitle("без границ");
        b3.setNumber_of_pages(3003);
        b2.setNumber_of_pages(300);
        b1.output();
        System.out.print(b1);
    }
}
