package model;

public class parcel {
    String cardID;
    String 物品类型;
    String 现在地址;
    String 发货人;
    String 收货人;
    String 发货地址;
    String 收货地址;
    String 发货人联系方式;
    String 收货人联系方式;
    String 下一站;

    public parcel(String cardID, String 物品类型, String 现在地址, String 发货人, String 收货人, String 发货地址, String 收货地址, String 发货人联系方式, String 收货人联系方式, String 下一站) {
        this.cardID = cardID;
        this.物品类型 = 物品类型;
        this.现在地址 = 现在地址;
        this.发货人 = 发货人;
        this.收货人 = 收货人;
        this.发货地址 = 发货地址;
        this.收货地址 = 收货地址;
        this.发货人联系方式 = 发货人联系方式;
        this.收货人联系方式 = 收货人联系方式;
        this.下一站 = 下一站;
    }


    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String get物品类型() {
        return 物品类型;
    }

    public void set物品类型(String 物品类型) {
        this.物品类型 = 物品类型;
    }

    public String get现在地址() {
        return 现在地址;
    }

    public void set现在地址(String 现在地址) {
        this.现在地址 = 现在地址;
    }

    public String get发货人() {
        return 发货人;
    }

    public void set发货人(String 发货人) {
        this.发货人 = 发货人;
    }

    public String get收货人() {
        return 收货人;
    }

    public void set收货人(String 收货人) {
        this.收货人 = 收货人;
    }

    public String get发货地址() {
        return 发货地址;
    }

    public void set发货地址(String 发货地址) {
        this.发货地址 = 发货地址;
    }

    public String get收货地址() {
        return 收货地址;
    }

    public void set收货地址(String 收货地址) {
        this.收货地址 = 收货地址;
    }

    public String get发货人联系方式() {
        return 发货人联系方式;
    }

    public void set发货人联系方式(String 发货人联系方式) {
        this.发货人联系方式 = 发货人联系方式;
    }

    public String get收货人联系方式() {
        return 收货人联系方式;
    }

    public void set收货人联系方式(String 收货人联系方式) {
        this.收货人联系方式 = 收货人联系方式;
    }

    public String get下一站() {
        return 下一站;
    }

    public void set下一站(String 下一站) {
        this.下一站 = 下一站;
    }
}
