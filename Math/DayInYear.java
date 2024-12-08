package Math;

public class DayInYear {
    public int dayOfYear(String date) {
        int y = Integer.parseInt(date.substring(0, 4));
        int m = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8));
        int v = y % 400 == 0 || (y % 4 == 0 && y % 100 != 0) ? 29 : 28;
        int[] days = {31, v, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = d;
        for (int i = 0; i < m - 1; ++i) {
            ans += days[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        DayInYear solution = new DayInYear();

        System.out.println(solution.dayOfYear("2024-12-08")); // 343
        System.out.println(solution.dayOfYear("2023-01-01")); // 1
        System.out.println(solution.dayOfYear("2020-02-29")); // 60
        System.out.println(solution.dayOfYear("2019-12-31")); // 365
        System.out.println(solution.dayOfYear("2000-03-01")); // 61
    }
}
