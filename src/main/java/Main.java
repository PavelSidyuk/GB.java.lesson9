public class Main {


    public static void main (String[] args)throws MyArrayDataException, MyArraySizeException {

        String[][] strArr = {
                {"11", "4", "7", "14"},  // в таком виде проще визуально представить двумерный массив 4х4
                {"33", "2", "1",   "5"},  // в виде строк и колонок
                {"77", "3", "111", "99"},
                {"32", "23", "5",  "8"},


        };

        initializationArr(strArr);
    }


    public static void initializationArr (String[][] s) throws MyArrayDataException, MyArraySizeException  {
        int summ = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (s.length != 4 || s[i].length != 4) {
                    throw new MyArraySizeException("Не верный размер массива, укажите массив [4][4]" );
                }
                try {
                    Integer.parseInt(s[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Проблемный элемент находится :  линия № " + (i + 1) + "  колонка № " + (j+1) +" Не число ");// прибавляю 1 для того чтобы не програмисты понемали в какой строке и колонке ошибка.
                }

                summ += Integer.parseInt(s[i][j]);
            }
            System.out.println("сумма =" +summ);


        }

    }

}
