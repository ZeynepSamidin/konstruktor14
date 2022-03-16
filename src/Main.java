import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      /**  Class деген класс тузунуз.
       *Ал класстын номер деген бутун сан сактаган, соз деген соз сактаган жана массив деген сан сактаган массив бар.
        Конструктор жазыныз.
        Мейн методтон Classтын объектисин тузунуз.
                Объекттин полелерине конструктор аркылуу маани бериниз.
                Ошол объекттин полелерин консольго чыгарыныз.*/

    Class cl = new Class(580, "Hello world", new int[]{3,4,7});

        for (int cs: cl.getArray()) {
            System.out.print(cs + " ");
        }
            System.out.println(", " + cl.getNamber() + ", " + cl.getWord());
    }
}
