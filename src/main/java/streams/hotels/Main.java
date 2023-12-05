package streams.hotels;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/** The driver class for the HotelReviewData example */
public class Main {
    public static void main(String[] args) {
        HotelReviewData hdata = new HotelReviewData();
        hdata.addHotel("10323", new Hotel("10323", "Hilton Garden Inn", "123 Emerv"));
        hdata.addHotel("1045", new Hotel("1045", "Mariott Hotel", "456 Fulton"));

        hdata.addReview("10323", new Review("review10323_0", "10323", "nice", "Tom", 4));
        hdata.addReview("10323", new Review("review10323_1", "10323", "nice breakfast nice location", "Swetha", 5));
        hdata.addReview("10323", new Review("review10323_2", "10323", "poor breakfast", "Yan", 3));
        hdata.addReview("10323", new Review("review10323_4", "10323", "nothing special ok location", "Jassie", 3));
        hdata.addReview("10323", new Review("review10323_3", "10323", "nice big breakfast", "Anonymous", 4));
        hdata.addReview("10323", new Review("review10323_5", "10323", "nice location", "Vernon", 5));

        hdata.addReview("1045", new Review("review1045_0", "1045", "clean comfortable", "Tom", 5));
        hdata.addReview("1045", new Review("review1045_1", "1045", "comfortable with good breakfast", "Anonymous", 4));
        hdata.addReview("1045", new Review("review1045_2", "1045", "nice breakfast comfortable bed loved breakfast", "Xue", 4));

        // FILL IN CODE:
        // Create a stream of hotel Ids

        // Convert it to a stream of Hotel references (using map() and HotelData's getHotel method)

        // Use collect to convert the stream of hotels to a list of hotels

        // Get a list of all reviews that are written by Anonymous users
        // Use flatMap, filter, and other operations.

    }
}
