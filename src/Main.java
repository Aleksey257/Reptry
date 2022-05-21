import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Введите целое положительное число");
        int b = Integer.parseInt(a);
        if(b <= 0){
            JOptionPane.showConfirmDialog(null, "Вы ввели неккоректное число");
        }
        else{
            int b_2 = 0;
            for(int i = 1; i <= b; i++){
                b_2 += i;
            }
        }
        if(a == null || a.equals("")){
            JOptionPane.showConfirmDialog(null, "Вы Владик");
        }
    }
}