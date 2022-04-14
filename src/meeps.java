public class meeps {
    private int id;
    private String body;
    private String created_at;
    private String updated_at;
    private int user_id;

    public meeps(int id, String body, String created_at, String updated_at, int user_id) {
        this.id = id;
        this.body = body;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user_id = user_id;

    }

    public String listToString() {
        String output = "";
        output += id + "   ";
        output += body + "   ";
        output += created_at + "   ";
        output += updated_at + "   ";
        output += user_id + "   ";

        return output;
    }

    public int getId(){
        return id;
    }
    public String getBody() {
        return body;
    }
    public String getCreated_at(){
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public int getUser_id() {
        return user_id;
    }
}
