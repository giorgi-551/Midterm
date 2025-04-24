package giorgi_maisuradze_18.midterm1.t2.spice.sub;

import giorgi_maisuradze_18.midterm1.t2.mixer.composer.A22;
import giorgi_maisuradze_18.midterm1.t2.spice.A21;

public class R21 {

    public static void main(String[] args) {
        // Create instances of A21 and A22
        A21 rectangle = new A21();
        A22 monthInfo = new A22();

        // Get width and height
        int width = rectangle.getWidth();
        int height = rectangle.getHeight();

        // Calculate area
        int area = width * height;

        // Get the current month
        int currentMonth = monthInfo.getMonth();

        // Determine month name with validation
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        String monthName;
        if (currentMonth >= 1 && currentMonth <= 12) {
            monthName = monthNames[currentMonth - 1];
        } else {
            monthName = "Invalid month";
        }

        // Display information
        System.out.println("Rectangle Dimensions:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Month Number: " + currentMonth);
        System.out.println("Month Name: " + monthName);
    }
}
