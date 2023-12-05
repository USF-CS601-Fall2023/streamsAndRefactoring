package streams.hotels;

import java.util.*;
import java.util.stream.Stream;

/** A class that stores the hotel reviews data in maps - note that
 *  this class is different from the one in project 1.
 *  Read the question carefully; the second map, was NOT in project 1.
 */
public class HotelReviewData {

    private Map<String, Hotel> hotelMap = new HashMap<>();
    // A map where the key is a hotelId and a value is a list of reviews for this hotelId
    private Map<String, List<Review>> reviewsMap = new HashMap<>();


    public void addHotel(String id, Hotel hotel) {
        hotelMap.put(id, hotel);
    }

    public Hotel getHotel(String id) {
        return hotelMap.get(id);
    }

    /** Add a review to the reviewsMap
     *
     * @param hotelId id of the hotel
     * @param review review for the hotel with the given hotelId
     */
    public void addReview(String hotelId, Review review) {
        // Do not change this function
        if (!reviewsMap.containsKey(hotelId))
            reviewsMap.put(hotelId, new ArrayList<>());
        reviewsMap.get(hotelId).add(review);
    }

    public List<Review> getReviews(String hotelId) {
        return reviewsMap.get(hotelId);
    }

    public Map<String, Hotel> getHotelMap() {
        return Collections.unmodifiableMap(hotelMap);
    }

    public Map<String, List<Review>> getReviewMap() {
        return Collections.unmodifiableMap(reviewsMap);
    }

}
