package zuzusoft.com.kaarzins.model;

/**
 * Created by mukeshnarayan on 30/07/18.
 */

public class Car {

    private String id, carImageUrl, name, type, features, price;

    public Car(String id,String carImageUrl, String name, String type, String features, String price) {
        this.id = id;
        this.carImageUrl = carImageUrl;
        this.name = name;
        this.type = type;
        this.features = features;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getCarImageUrl() {
        return carImageUrl;
    }

    public void setCarImageUrl(String carImageUrl) {
        this.carImageUrl = carImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}