package itmo.java.basic.lesson2;

public class Table {
    int width;
    int height;
    int depth;

/*
конструктор со всеми параметрами
    Table() {
        width = 10;
        height = 10;
        depth = 10;
    }
конструктор по умолчанию
      Table table = new Table();
*/

    //конструктор в котором определены несколько параметров

    Table table = new Table(24, 50);

    public Table(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
