public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = BonusMilesService.calculate(12_600);
        System.out.println(miles);
    }
}