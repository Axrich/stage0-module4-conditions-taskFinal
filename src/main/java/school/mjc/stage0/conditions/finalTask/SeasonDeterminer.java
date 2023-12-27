package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Autumn";
                    break;
                default:
                    season = "Unknown";
                    break;
            }

            System.out.println(season);
        } else {
            System.out.println("Wrong month number");
        }
    }

    public static void main(String[] args) {
        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();

        seasonDeterminer.tellTheSeason(1); // Output: Winter
        seasonDeterminer.tellTheSeason(6); // Output: Summer
        seasonDeterminer.tellTheSeason(13); // Output: Wrong month number
    }
}
