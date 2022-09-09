public class ProblemSet {

    public static void main(String[] args) {
        //Question 1
        double balance = 20 - 25 + 30 - 25;
        if (balance < 0) {
            System.out.println("We're in the red!");
        } else if (balance > 0) {
            System.out.println("We made a profit!");
        } else {
            System.out.println("We broke even.");
        }
        // my answer is "We broke even." - C
        //Question 2
        int dogs = 1;
        int cats = 2;

        if (dogs > 0 && cats == 0) { // false, so whole body can be skipped
            if (dogs > 1) {
                System.out.println("Dog lover");
            } else {
                System.out.println("Dog person");
            }
        } else if (cats > 0 && dogs == 0) { // false, same
            if (cats > 1) {
                System.out.println("Cat lover");
            } else {
                System.out.println("Cat person");
            }
            System.out.println("Cat person");
        } else if (cats > 0 && dogs > 0) { // true
            if (dogs > cats) { //false
                System.out.println("I guess you like dogs more");
            } else if (dogs == cats) { // false
                System.out.println("I guess you like both equally");
            } else {
                System.out.println("I guess you like cats more");
            }
        } else {

        } System.out.println("What, don't you like pets?");
        // my answer is "I guess you like cats more"

        // Question 3.
        boolean canSeePlayer = true;
        boolean playerPoweredUp = true;
        if (canSeePlayer){
            if (!playerPoweredUp){
                System.out.println("Attack!");
            } else{
                System.out.println("Run away!");
            }
        } else{
            System.out.println("Wander.");
        }

        // Question 4.
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isSnowing){
            isRaining = false;
        } else if (isRaining) {
            isSnowing = false;
        }

        if (isSnowing || isRaining || temperature < 50){
            System.out.println("Let's stay home.");
        } else {
            System.out.println("Let's go out!");
        }

        // Question 5,
        double time = 18;
        String timeOfDay;

        if (time >= 5 && time < 12){
            timeOfDay = "morning";
        } else if (time >= 12 && time < 20){
            timeOfDay = "daytime";
        } else {
            timeOfDay = "night";
        }

        // Question 6.
        int dayOfTheWeek = 5;
        boolean holiday = false;

        if (dayOfTheWeek >= 1 && dayOfTheWeek <= 5 && !holiday){
            System.out.println("Wake up at 7:00");
        } else if (dayOfTheWeek > 5 && dayOfTheWeek <= 7 || holiday) {
            System.out.println("Sleep in!");
        }

        // Question 7.
        double playbackPosition = 120;
        boolean rewinding = true;

        if (rewinding){
            double rewindAmount = 0.1;
            playbackPosition = playbackPosition - rewindAmount;
        }
        // rewindAmount couldn't have reached from outside curly braces

        // Question 8.
        int dayOfWeek = 1;
        String schedule;

        switch (dayOfWeek){
            case 1: schedule = "Gym in the morning.";
            break;
            case 2: schedule = "Class after work.";
            break;
            case 3: schedule = "Meetings all day.";
            break;
            case 4: schedule = "Work from home.";
            break;
            case 5: schedule = "Game night after work.";
            break;
            case 6: case 7: default:
                schedule = "Free!";
            break;
        }
        System.out.println(schedule);
    }
}
