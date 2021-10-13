package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        FurnitureStore store = new FurnitureStore(new Chair(900, 20, "белый", "дерево", 97),
                new Armchair(2000, 16,"черный", "искусственная кожа", 109, "рабочее"),
                new Sofa(4400, 17, "голубой", "рогожка", 90,"раскладной"),
                new Bed(3000, 23, "белый","дерево",
                        "односпальная", "для подростков", 220),
                new Table(2200, 30, "черный", "дерево", 150, "обеденный", "круглый"),
                new Commode(3790, 1, "белый", "дерево", 78, 4));

        System.out.println(store);

        do {
            System.out.print("\nВыберите мебель, которая Вас интересует:\n" + "0 - Стул;\n" +
                    "1 - Кресло;\n" + "2 - Диван;\n" + "3 - Кровать;\n" +
                    "4 - Стол;\n" + "5 - Комод;\n" + "6 - Выход\n" + "\n~Ввод команды: ");

            Scanner scanner = new Scanner(System.in);
            int product = scanner.nextInt();

            if (product == 6) {
                break;
            }

            System.out.print("\nВыберите действие:\n" + "1 - Добавить в корзину;\n" +
                    "2 - Удалить из корзины;\n" + "3 - Купить товар;\n" +
                    "4 - Посмотреть информацию о товаре;\n" + "5 - Вернуться назад.\n" + "\n~Ввод команды: ");

            switch (scanner.nextInt()) {
                case 1:
                    store.furnitureCollection.get(product).addToCart();
                    break;
                case 2:
                    store.furnitureCollection.get(product).removeFromCart();
                    break;
                case 3:
                    store.furnitureCollection.get(product).buyAProduct();
                    break;
                case 4:
                    System.out.println(store.furnitureCollection.get(product));
                    break;
                case 5:
                    continue;
                default:
                    break;
            }

        } while (true);
    }
}
