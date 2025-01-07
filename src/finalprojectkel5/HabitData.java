/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectkel5;

/**
 *
 * @author Lenovo X240
 */
import java.util.HashMap;
import java.util.Map;

public class HabitData {
    private static HashMap<String, Boolean> habits = new HashMap<>();

    // Tambahkan habit baru
    public static boolean addHabit(String habitName) {
        if (habits.containsKey(habitName)) {
            return false; // Habit sudah ada
        }
        habits.put(habitName, false); // Default: belum selesai
        return true;
    }

    // Dapatkan daftar habit
    public static HashMap<String, Boolean> getHabits() {
        return habits;
    }

    // Reset semua habit
    public static void resetHabits() {
        for (Map.Entry<String, Boolean> entry : habits.entrySet()) {
            entry.setValue(false); // Set semua habit ke false
        }
    }

    // Hapus semua habit
    public static void clearHabits() {
        habits.clear();
    }

    // Update status habit
    public static void updateHabitStatus(String habitName, boolean isCompleted) {
        if (habits.containsKey(habitName)) {
            habits.put(habitName, isCompleted);
        }
    }
}
