package Wave_algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class W_a {
    public static void main(String[] args) {
        var map = getStartMap(); // В map передается метод получения карты
    
        System.out.println(mapToString(map)); // Печать метода сопоставления со строкой в карте
    
        int[] startPos = getPoint2D(6, 4); // Вызов метода получения стартовой позиции
    
        WaveAlgorithm(map, startPos); // Вызов Волнового алгоритма, применяемого к карте и стартовой позиции
    
        System.out.println(mapToString(map)); // Печать метода сопоставления со строкой в карте
    
      }
      public static int[] getPoint2D(int x, int y) { // Метод получение координаты в 2D пространстве
        return new int[] { x, y };
    }

    public static int[][] getStartMap() { // Метод печати поля
      return new int[][] {
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
    }
    public static String mapToString(int[][] map) { // Метод сопоставления со строкой
         StringBuilder sb = new StringBuilder();
    
        for (int row = 0; row < map.length; row++) { // Ряд
          for (int col = 0; col < map[row].length; col++) { // Колличество
            sb.append(String.format("%3d", map[row][col])); // Карта состоит из рядов и колличеств
          }
          sb.append("\n");
        }
    
        return sb.toString();
      }
    
      public static void WaveAlgorithm(int[][] map, int[] startPos) { // Реазизация волнового алгоритма, передается карта и стартовая позиция
    
        Queue<int[]> queue = new LinkedList<int[]>(); // Очередь
        queue.add(startPos); // Добавляем в очередь стартовую позицию
        map[startPos[0]][startPos[1]] = 1; 
    
        while (queue.size() != 0) { // Пока размер очереди не равен нулю
          int[] current_Position = queue.remove(); // Текущая позиция = удаление(сокращение) очереди
          int posX = current_Position[0]; // Позиция х = текущая позиция от 0
          int posY = current_Position[1]; // позиция У = текущая позиция от 1
        // Возможные варианты хода:
          if (map[posX - 1][posY] == 0) {
            int[] temp = new int[] { posX - 1, posY };
            queue.add(temp);
            map[posX - 1][posY] = map[posX][posY] + 1;
          }
          if (map[posX][posY - 1] == 0) {
            int[] temp = new int[] { posX, posY - 1 };
            queue.add(temp);
            map[posX][posY - 1] = map[posX][posY] + 1;
          }
          if (map[posX + 1][posY] == 0) {
            int[] temp = new int[] { posX + 1, posY };
            queue.add(temp);
            map[posX + 1][posY] = map[posX][posY] + 1;
          }
          if (map[posX][posY + 1] == 0) {
            int[] temp = new int[] { posX, posY + 1 };
            queue.add(temp);
            map[posX][posY + 1] = map[posX][posY] + 1;
          }
        }
      }
}
