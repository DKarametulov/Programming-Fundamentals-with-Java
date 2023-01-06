package AdvertisementMessage;

public class AdvertisementMessage {
    static class Massage{
    private String phrases;
    private String events;
    private String authors;
    private String cities;


    public void AdvertisementMessage(String phrases, String events, String authors, String cities) {
        this.phrases = phrases;
        this.events = events;
        this.authors = authors;
        this.cities = cities;
    }
    @Override
        public String toString(){
        return phrases + " "+ events + " " + authors + " " + cities;
    }

    }




}





