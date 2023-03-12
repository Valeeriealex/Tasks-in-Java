// Методы, выводящие все данные о товаре
public class Program {
    private static void Show(Products[] all){
        for (Products product : all) {
            System.out.println(product);
            System.out.println("----");
        }
    }
    public static void Main(String[] args) {
        Products milk = new Milk("Молоко", 60, 6, "Литр", "6 месяцев", 2);
        Products lemonade = new Lemonade("Лимонад", 56, 12, "Литр", 2);
        Products bread = new Bread("Хлеб", 45, 1, "шт", "3 дня", "1 сорт муки");
        Products eggs = new Eggs("Яйца", 82, 10, "шт", "3 недели", 10);
        Products masks = new Masks("Маски", 455, 12, "шт", 12);
        Products paper = new ToiletPappar("Туалетная бумага", 275, 12, "шт", 12, 2);
        Products diapers = new Diapers("Подгузники", 1112, 56, "шт", 2, "да", 12, 5, 7, "мягкие");
        Products nipple = new Nipple("Соска", 134, 1, "шт", 1, "да");

        Products[] all = new Products[] {milk, lemonade, bread, eggs, masks, paper, diapers, nipple};

        Show(all);
    }
}