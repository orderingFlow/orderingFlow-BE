package orderingflow.orderingflow.domain.request;

public class ReqCredentials {
    // Id
    private String id;
    // 암호
    private String password;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
