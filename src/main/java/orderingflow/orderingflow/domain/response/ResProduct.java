package orderingflow.orderingflow.domain.request;

public class ResProduct {
    // Id
    private String id;
    // 이름
    private String name;
    // 이미지 경로
    private String imagePath;
    // 설명
    private String description;
    // 수량
    private Number quantity;
    // 총 수량
    private Number totalQuantity;
    // 구매자
    private String buyer;
    // 구매자 수
    private Number buyerCount;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Number getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public Number getTotalQuantity() {
        return this.totalQuantity;
    }

    public void setTotalQuantity(Number totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getBuyer() {
        return this.buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Number getBuyerCount() {
        return this.buyerCount;
    }

    public void setBuyerCount(Number buyerCount) {
        this.buyerCount = buyerCount;
    }
}