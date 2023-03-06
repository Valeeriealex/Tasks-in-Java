package Wawe_algorithm_classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class W_a_c {
    public static void main(String [] args) {
        var mg = new MapGenerator();
        System.out.println(
            new MapPrinter().rawData(
                mg.getMap())
        );

        var lee = new WaweAlgorithm(mg.getMap());
        lee.Colorize(new Point2D (3, 3));
        System.out.println(
            new MapPrinter().rawData(
                mg.getMap())
        );
        
    }
}

// Класс получения точки в 2D пространстве, координаты x y
class Point2D { 

    int x, y;

    // Ввод координат
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // Получение координат
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //Приведение типа int к типу string
    //Аннотация-маркер, которая может применяться только к методам, должен переопределять метод супер класса
    @Override 
    public String toString() {
        return String.format("x: %d y: %d", x, y); // Означает, что печатается целое число без запятой
    }
}

// Класс получения и хранения карты
class MapGenerator{

    int [][] map;

    // Карта
    public MapGenerator () {
        int[][] map = {
            { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, -1, -1, -1, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };
        this.map = map;
    }

    // Получение карты
    public int [][] getMap () {
        return map;
    }

    // Стартовая позиция
    public void setStart (Point2D pos) {
        map[pos.x][pos.y] = -2;
    }

    // Финальная позиция
    public void setExit (Point2D pos) {
        map[pos.x][pos.y] = -3;
    }
}

// Класс печати карты
class MapPrinter{

    public MapPrinter () {
    }

    public String rawData(int [][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) { // Ряд
            for (int col = 0; col < map[row].length; col++) { // Колличество
              sb.append(String.format("%3d", map[row][col])); // Добовление в строку черз ряды и колличество
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
          sb.append("\n");
        }
        return sb.toString();
    }
}

// Класс реализации Волнового алгоритма
class WaweAlgorithm{

    int [] [] map;

    // Передача карты
    public WaweAlgorithm(int [][] map) {
        this.map = map;
    }

    // "Закрашивание этой карты"
    public void Colorize (Point2D startPoin) { // Начало закрашивая от стартовой позиции
    Queue<Point2D> queue = new LinkedList<Point2D>(); // Очередь на двусвязном списке, принимающие точки в 2D пространстве
        queue.add(startPoin); // Добавляем в очередь стартовую позицию
        map[startPoin.x][startPoin.y] = 1; 
    
        while (queue.size() != 0) { // Пока размер очереди не равен нулю
            Point2D current_position = queue.remove(); // Текущая позиция = удаление(сокращение) очереди
        
        // Заполнение карты:
          if (map[current_position.x - 1][current_position.y] == 0) {
            queue.add(new Point2D(current_position.x - 1, current_position.y));
            map [current_position.x - 1] [current_position.y] = map [current_position.x] [current_position.y] + 1;
          }
          if (map[current_position.x][current_position.y - 1] == 0) {
            queue.add(new Point2D(current_position.x, current_position.y - 1));
            map [current_position.x] [current_position.y - 1] = map [current_position.x] [current_position.y] + 1;
          }
          if (map[current_position.x + 1][current_position.y] == 0) {
            queue.add(new Point2D(current_position.x + 1, current_position.y));
            map [current_position.x + 1] [current_position.y] = map [current_position.x] [current_position.y] + 1;
          }
          if (map[current_position.x][current_position.y + 1] == 0) {
            queue.add(new Point2D(current_position.x, current_position.y + 1));
            map [current_position.x] [current_position.y + 1] = map [current_position.x] [current_position.y] + 1;
          }
        }
    }
    public ArrayList<Point2D> getRoad(Point2D exit) { // Массив принимающий точки в 2D пространстве с Получение пути до финальной позиции
        ArrayList<Point2D> road = new ArrayList<Point2D>(); // Массив принимающий точки в 2D пространстве Путь = Массив принимающий точки в 2D пространстве
        return road;                                        // Вернуть этот Путь
      }
}




